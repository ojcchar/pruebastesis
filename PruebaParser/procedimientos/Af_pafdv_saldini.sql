 procedure af_pafdv_saldini (
                            p_afdv             af_tafdv.afdv_afdv%type,
                            p_servicio         af_tafdv.afdv_servicio%type,
                            p_status           af_tafdv.afdv_status%type,
                            p_fecservicio      date,
--                            p_auxi             af_tafdv.afdv_auxi%type,
                            p_auxi             in_tresp.resp_auxi%type,
                            p_cias             ge_tcias.cias_cias%type,
--                            p_etar             af_tafdv.afdv_etar%type,
                            p_etar             af_tafdv.afdv_etct%type,
                            p_area             af_tafdv.afdv_area%type,
--                            p_alma             af_tafdv.afdv_mval_alma%type,
--                            p_bode             af_tafdv.afdv_mval_bode%type,
                            p_alma             af_tafdv.afdv_alma%type,
                            p_bode             af_tafdv.afdv_bode%type,
                            p_carg             af_tafdv.afdv_carg%type,
                            p_vlibros          number,
                            p_vacumajui        number,
                            p_vdepacum         number,
                            p_vacumajud        number,
                            p_vacumajuifis     number,
                            p_vacumdepfis      number,
                            p_vacumajudepfis   number,
                            p_vacumdepdife     number,
                            p_vacumvalo        number,
                            p_vacumprovi       number,
                            p_usua             varchar2,
                            p_etco             af_tafdv.afdv_etco%type,
                            p_ceco             af_tafdv.afdv_ceco%type,
                            p_fecinicio        date default null,
							p_fecavaluo        date default null)
  is
  cursor c_ai is select  tpnv_tpnv                                   -- afdv_vacumajui ajustes por inflacion           (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'ai'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'p';
  --
  cursor c_dp is select  tpnv_tpnv                                   -- afdv_vdepacum  depreciacion contable           (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'dp'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'p';
  --
  cursor c_ad is select   tpnv_tpnv                                   -- afdv_vacumajud  ajustes a la depreciacion      (1357)
                  from    af_ttpns
                  where   tpnv_tpoajus  = 'ad'
                  and     tpnv_servicio = 'a'
                  and     tpnv_oper     = 'p';
  --
  cursor c_if is select  tpnv_tpnv                                   -- afdv_vacumajuifis ajustes por inflacion fiscal  (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'if'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'p';
  --
  cursor c_df is select  tpnv_tpnv                                   -- afdv_vacumdepfis  depreciacion fiscal        (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'df'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'p';
  --
  cursor c_af is select  tpnv_tpnv                                   -- afdv_vacumajudfis ajustes depreciacion fiscal    (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'af'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'p';
  --
  cursor c_dd is select  tpnv_tpnv                                   -- afdv_vacumdepdife depreciacion diferida          (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'dd'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'p';
  --
  cursor c_vl is select  tpnv_tpnv                                   -- afdv_vacumvalo valorizacion                       (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'vl'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'v';
  --
  cursor c_pr is select  tpnv_tpnv                                   -- afdv_vacumprovi provision                         (1357)
                 from    af_ttpns
                 where   tpnv_tpoajus  = 'pr'
                 and     tpnv_servicio = 'a'
                 and     tpnv_oper     = 'v';
  --
  cursor c_ser is select  tpnv_tpnv                                   --  activo al servicio                    (1357)
                  from    af_ttpns
                  where   tpnv_servicio = 'a'
                  and     tpnv_oper     = 'e';
  --

-- jarz 2005/06/01  reintegros activos fijos
-- jarz 2005/08/26  se unifica version se agrega parametro de llamado p_fecavaluo
-- 					se agrega condicion en la creacion de la novedad si envia fecha graba novedad
-- jarz 2005/12/09  unificacion it epm

  v_tpnv         af_ttpns.tpnv_tpnv%type;
  --
  v_nuaf         af_tnuaf.nuaf_nuaf%type;
  v_msg          varchar2(500);
  v_fecnovedad   date;                                                                                    -- (epmv100)
  --
begin
  --
  v_fecnovedad := nvl( p_fecinicio, p_fecservicio );                                                      -- (epmv100)
  --
  if ( nvl( p_carg, 'zz' ) = 'pl' ) then
    --
    open  c_ser;
      fetch c_ser into v_tpnv;
      --
      if ( c_ser%notfound ) then
         raise_application_error(-20799,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad salida al servicio');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, p_fecservicio, p_auxi, p_cias,
           p_etar,  p_area, p_alma, p_bode, p_vlibros, 'creacion del activo /devolutivo', p_usua,
           'n', 'n', 'nv', 'o', null, p_etco, p_ceco, null, v_msg);
        --
        if ( v_msg is not null ) then
           raise_application_error(-20800,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_ser;
    --
  end if;
  --
  if (   nvl( p_servicio, 'z' ) ='a' and  nvl( p_status, 'z' ) ='a' and  v_fecnovedad is not null ) then   -- (1357) (epmv100)
  --if (   p_fecservicio is not null ) then                                         -- (1357)
    --
    open  c_ai;
      --
      fetch c_ai into v_tpnv;
      --
      if ( c_ai%notfound ) then
         raise_application_error(-20801,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
           p_etar,  p_area, p_alma, p_bode, p_vacumajui,
                    'creacion del activo /devolutivo', p_usua, 'n', 'n', 'nv', 'o', null,
                    p_etco, p_ceco, null, v_msg, null, null, null, 's');
        --
        if ( v_msg is not null ) then
           raise_application_error(-20802,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_ai;                                                                                                    -- (1357)
    --
    open  c_dp;                                                                                                    -- (1357)
      --
      fetch c_dp into v_tpnv;
      --
      if ( c_dp%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
           p_etar,  p_area, p_alma, p_bode, p_vdepacum,
                    'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
                    p_etco, p_ceco, null, v_msg, null, null, null, 's');
        --
        if ( v_msg is not null ) then
           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_dp;                                                                                                    -- (1357)
    --
    open  c_ad;
      --
      fetch c_ad into v_tpnv;
      --
      if ( c_ad%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
           p_etar,  p_area, p_alma, p_bode, p_vacumajud,
                    'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
                    p_etco, p_ceco, null, v_msg, null, null, null, 's');
        --
        if ( v_msg is not null ) then
           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_ad;                                                                                                    -- (1357)
    --
    open  c_if;                                                                                                    -- (1357)
      --
      fetch c_if into v_tpnv;
      --
      if ( c_if%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
           p_etar,  p_area, p_alma, p_bode, p_vacumajuifis,
                    'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
                    p_etco, p_ceco, null, v_msg, null, null, null, 's');
        --
        if ( v_msg is not null ) then
           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_if;                                                                                                    -- (1357)
    --
    open  c_df;                                                                                                    -- (1357)
      --
      fetch c_df into v_tpnv;
      --
      if ( c_df%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
           p_etar,  p_area, p_alma, p_bode, p_vacumdepfis,
                    'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
                    p_etco, p_ceco, null, v_msg, null, null, null, 's');
        --
        if ( v_msg is not null ) then
           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_df;                                                                                                     -- (1357)
    --
    open  c_af;                                                                                                     -- (1357)
      --
      fetch c_af into v_tpnv;
      --
      if ( c_af%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
           p_etar,  p_area, p_alma, p_bode, p_vacumajudepfis,
                    'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
                    p_etco, p_ceco, null, v_msg, null, null, null, 's');
        --
        if ( v_msg is not null ) then
           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_af;                                                                                                     -- (1357)
    --
    open  c_dd;                                                                                                     -- (1357)
      --
      fetch c_dd into v_tpnv;
      --
      if ( c_dd%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
           p_etar,  p_area, p_alma, p_bode, p_vacumdepdife,
           'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
           p_etco, p_ceco, null, v_msg, null, null, null, 's');
        --
        if ( v_msg is not null ) then
           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
        end if;
        --
      end if;
      --
    close c_dd;                                                                                                     -- (1357)
    --
    open  c_vl;                                                                                                     -- (1357)
      --
      fetch c_vl into v_tpnv;
      --
      if ( c_vl%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
		-- jarz 2005/08/26 se unifica version
		if ( p_fecavaluo is not null ) then                                                                         -- (epmv101)
	        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
	           p_etar,  p_area, p_alma, p_bode, p_vacumvalo,
	           'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
	           p_etco, p_ceco, null, v_msg, null, null, null, 's');
	        --
	        if ( v_msg is not null ) then
	           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
	        end if;
		end if;
        --
      end if;
      --
    close c_vl;                                                                                                     -- (1357)
    --
    open  c_pr;                                                                                                     -- (1357)
      --
      fetch c_pr into v_tpnv;
      --
      if ( c_pr%notfound ) then
         raise_application_error(-20800,'error af_pafdv_saldini saldo inicial: no se encontro tipo de novedad de ajustes de inflacion');
      else
        --
		-- jarz 2005/08/26 se unifica version
		if ( p_fecavaluo is not null ) then                                                                   -- (epmv101)

	        af_pnove.crea_nove ( p_afdv, v_tpnv, v_fecnovedad, p_auxi, p_cias,                                   --(epmv100)
	           p_etar,   p_area, p_alma,  p_bode, p_vacumprovi,
	           'proceso periodico activos /devolutivos activos fijos', p_usua, 'n', 'n', 'nv', 'o', null,
	           p_etco, p_ceco, null, v_msg, null, null, null, 's');
	        --
	        if ( v_msg is not null ) then
	           raise_application_error(-20801,'error af_pafdv_saldini: '||v_msg);
	        end if;
		end if;
        --
      end if;
      --
    close c_pr;                                                                                                     -- (1357)
    --
  end if;
  --
exception
  when others then
    raise_application_error(-20900,'error af_pafdv_saldini: '||sqlerrm);
end;