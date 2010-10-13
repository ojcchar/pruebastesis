Package Body  pi_qsimu  is
  --
  --
  procedure ins_port ( p_port_real       in    number,
                         p_port_simu       in    number  ) is
    --
    cursor c_port_real is
    select port_port,             port_descri,       port_dias,
           port_stat,             port_tasa_refe,    port_peri_prom,
           port_marg_cero,        port_marg_nega,    port_rend_siaf,
           port_anua,             port_a_dia_hab,    port_inmi,
           port_inma,             port_cias,         port_mtva,
           port_fech_cier,        port_sf_fond,      port_usua,
           port_feccre,           port_ceco,         port_etco,
           port_vali_cupo,        port_prom_marg,    port_renta,
           port_porc_comi,        port_tipo,         port_port_simu,
           port_port_feccie_simu
      from pi_tport
     where port_port = p_port_real;
    --
    --  Hace una Replica de un portafolio Real y lo Copia en uno Simulado
    --
    --
    --
    r_port_real          c_port_real%rowtype;
    --
  begin
     --
     open c_port_real;
       --
       fetch c_port_real into r_port_real;
       --
       if ( c_port_real%notfound ) then
          raise_application_error(-20801, 'Portafolio Real No Encontrado, = ' || to_char(p_port_real));
       else
         --
         if ( r_port_real.port_tipo = 'S' ) then
          raise_application_error(-20802, 'Portafolio Origen : ' || to_char(p_port_real)|| ' es de Simulacion.  Seleccione el Portafolio Origen Tipo R-Real ');
         end if;
         --
         update pi_tport
            set port_port_simu        = r_port_real.port_port,
                port_descri           = substr('SIMULACION DE : ' || r_port_real.port_descri, 1, 100),
                port_fech_cier        = r_port_real.port_fech_cier,
                port_port_feccie_simu = r_port_real.port_fech_cier,
                port_dias             = r_port_real.port_dias,
                port_stat             = r_port_real.port_stat,
                port_tasa_refe        = r_port_real.port_tasa_refe,
                port_peri_prom        = r_port_real.port_peri_prom,
                port_marg_cero        = r_port_real.port_marg_cero,
                port_marg_nega        = r_port_real.port_marg_nega,
                port_rend_siaf        = 'N',
                port_anua             = r_port_real.port_anua,
                port_a_dia_hab        = r_port_real.port_a_dia_hab,
                port_inmi             = r_port_real.port_inmi,
                port_inma             = r_port_real.port_inma,
                port_cias             = r_port_real.port_cias,
                port_mtva             = r_port_real.port_mtva,
                port_sf_fond          = r_port_real.port_sf_fond,
                port_usua             = r_port_real.port_usua,
                port_feccre           = r_port_real.port_feccre,
                port_ceco             = r_port_real.port_ceco,
                port_etco             = r_port_real.port_etco,
                port_vali_cupo        = r_port_real.port_vali_cupo,
                port_prom_marg        = r_port_real.port_prom_marg,
                port_renta            = r_port_real.port_renta,
                port_porc_comi        = r_port_real.port_porc_comi
          where port_port = p_port_simu
            and port_tipo = 'S';
          --
       end if;
       --
     close c_port_real;
     --
    exception
       when others then
         raise_application_error(-20803, 'Error de en ins_port, = ' || sqlerrm);
  end ins_port;
  --
  --
  --
  procedure ins_titu ( p_port_real           in    number,
                       p_port_simu           in    number,
                       p_fecha               in    date  ) is
    --
    cursor c_titu_real is
    select titu_port,      titu_titu,       titu_tppa,        titu_feem,    titu_vano,
           titu_vtasa_neg, titu_vtasa_nom,  titu_feco,        titu_tirc,    titu_vaco,
           titu_fvto,      titu_nude,       titu_tasa_valora, titu_tpta,    titu_tasa,
           titu_vtasa,     titu_ptasa,      titu_puntos,      titu_conf,    titu_feve,
           titu_vave,      titu_marg_cal,   titu_marg_act,    titu_inco,    titu_inan,
           titu_pamo,      titu_pada,       titu_damo,        titu_dado,    titu_cons,
           titu_tirv,      titu_nego,       titu_rend,        titu_esta,    titu_auxi_emis,
           titu_auxi_comp, titu_auxi_admi,  titu_auxi_vend,   titu_pepg,    titu_moda,
           titu_fpag,      titu_mone,       titu_usua_trdr,   titu_feccre,  titu_titu_titu,
           titu_repo,      titu_vmerc_repo, titu_oper,        titu_cdcv,    titu_reg_flu,
           titu_fech_lim,  titu_accn,       titu_deri,        titu_clin,    port_tipo
      from pi_ttitu, pi_tport
     where port_port = titu_port
       and titu_port = p_port_real
       and ( titu_esta in ( 'ACT', 'REP' )
             or ( titu_esta = 'VEN' and titu_feve = p_fecha ) )
     order by titu_Titu;
    --
    cursor c_repo_simu ( pc_Repo  integer ) is
    select repo_repo
      from pi_trepo
     where repo_port = p_port_simu
       and repo_repo = pc_Repo;
    --
    r_repo_simu     c_repo_simu%rowtype;
    --
    --  Hace una Replica de un titulo Real y lo Copia en uno de un portafolio Simulado
    --
    cursor c_port_simu is
    select port_port
      from pi_tport
     where port_port = p_port_simu;
    --
    r_port_simu  c_port_simu%rowtype;
    --
  begin
    --
    --
    open  c_port_simu;
    fetch c_port_simu into r_port_simu;
    if ( c_port_simu%notfound ) then
      raise_application_error(-20804, 'Codigo de Portafolio NO EXISTE.');
    end if;
    close c_port_simu;
    --
    --
    for i in c_titu_real loop
      --
      if ( i.port_tipo = 'S' ) then
        raise_application_error(-20805, 'Portafolio Origen : ' || to_char(i.titu_port)|| ' es de Simulacion.  Seleccione el Portafolio Origen Tipo R-Real ');
      end if;
      --
      open c_repo_simu ( i.titu_Repo );
      fetch c_repo_simu into r_repo_simu;
      --
      if ( i.titu_repo is null or c_repo_simu%found ) then
        --
        begin
          --
          Insert into pi_ttitu
            ( titu_port,        titu_titu,        titu_tppa,          titu_feem,      titu_vano,
              titu_vtasa_neg,   titu_vtasa_nom,   titu_feco,          titu_tirc,      titu_vaco,
              titu_fvto,        titu_nude,        titu_tasa_valora,   titu_tpta,      titu_tasa,
              titu_vtasa,       titu_ptasa,       titu_puntos,        titu_conf,      titu_feve,
              titu_vave,        titu_marg_cal,    titu_marg_act,      titu_inco,      titu_inan,
              titu_pamo,        titu_pada,        titu_damo,          titu_dado,      titu_cons,
              titu_tirv,        titu_nego,        titu_rend,          titu_esta,      titu_auxi_emis,
              titu_auxi_comp,   titu_auxi_admi,   titu_auxi_vend,     titu_pepg,      titu_moda,
              titu_fpag,        titu_mone,        titu_usua_trdr,     titu_feccre,    titu_titu_titu,
              titu_repo,        titu_vmerc_repo,  titu_oper,          titu_cdcv,      titu_reg_flu,
              titu_fech_lim,    titu_accn,        titu_deri,          titu_clin )
          values
            ( p_port_simu,      i.titu_titu,      i.titu_tppa,        i.titu_feem,    i.titu_vano,
              i.titu_vtasa_neg, i.titu_vtasa_nom, i.titu_feco,        i.titu_tirc,    i.titu_vaco,
              i.titu_fvto,      i.titu_nude,      i.titu_tasa_valora, i.titu_tpta,    i.titu_tasa,
              i.titu_vtasa,     i.titu_ptasa,     i.titu_puntos,      i.titu_conf,    i.titu_feve,
              i.titu_vave,      i.titu_marg_cal,  i.titu_marg_act,    i.titu_inco,    i.titu_inan,
              i.titu_pamo,      i.titu_pada,      i.titu_damo,        i.titu_dado,    i.titu_cons,
              i.titu_tirv,      i.titu_nego,      i.titu_rend,        i.titu_esta,    i.titu_auxi_emis,
              i.titu_auxi_comp, i.titu_auxi_admi, i.titu_auxi_vend,   i.titu_pepg,    i.titu_moda,
              i.titu_fpag,      i.titu_mone,      i.titu_usua_trdr,   i.titu_feccre,  NULL,        ---(*)
              i.titu_repo,      i.titu_vmerc_repo,i.titu_oper,        i.titu_cdcv,    i.titu_reg_flu,
              i.titu_fech_lim,  i.titu_accn,      i.titu_deri,        i.titu_clin );
              --
           --
           -- (*) Como numero de titulo referenciado podria venir: Titulo que se fracciono, o Numero de
           --     Titulo comprado como una Simulacion, pero que posteriormente se confirmo.
           --
           --
           --
           exception
             when others then
               raise_application_error(-20805, 'Error insertando titulo : ' || i.titu_Titu || ' : ' || sqlerrm);
        end;
        --
      end if;
      --
      close c_repo_simu;
      --
      --  Insercion de Rendimientos de Acciones
      --
      Ins_Rnac ( p_port_real, i.titu_titu, p_port_simu );
      --
      --
      --  Insercion de Flujos
      --
      Ins_Fluj ( p_port_real, i.titu_titu, p_port_simu );
      --
      --  Insercion de Rendimiento en Acciones
      --
      Ins_Valo ( p_port_real, i.titu_titu, p_port_simu );
      --
      --  Insercion de Clases en Titulos
      --
      Ins_Clti ( p_port_real, i.titu_titu, p_port_simu );
      --
    end Loop c_titu_real;
    --
    --
    exception
      when others then
        raise_application_error(-20806, 'Error de en ins_titu, = ' || sqlerrm);
  end ins_titu;
  --
  --
  --
  procedure ins_orin ( p_port_real           in    number,
                        p_port_simu           in    number  ) is
    --
    cursor c_orin_real is
    select orin_port,  orin_orin, orin_tpop, orin_auxi_terc,
           orin_fecha, orin_valor, orin_stat, orin_observa,
           orin_proc,  orin_usua, orin_feccre, port_tipo
      from pi_torin, pi_tport
     where port_port = orin_port
       and orin_port = p_port_real
       and orin_stat in ('I')
       and exists ( select 'x'
                      from pi_topoi, pi_toper, pi_ttitu
                     where opoi_Port = p_port_Real
                       and opoi_OrIn = orin_OrIn
                       and oper_Oper = opoi_Oper
                       and oper_Port = opoi_Port
                       and titu_Titu = oper_Titu
                       and titu_Port = p_port_Simu );  --- Ya DEBE Existir el titulo en el Portafolio de Simulacion.
    --
    --
    --  Hace una Replica de las Orden de Inversion de un portafolio
    --  y lo Copia en una de un Portafolio Simulado
    --
    --
    r_orin_real           c_orin_real%rowtype;
    --
    cursor c_port_simu  is
    select port_port
      from pi_tport
     where port_port = p_port_simu;
    --
    r_port_simu         c_port_simu%rowtype;
    --
  begin
    --
    open  c_port_simu;
    fetch c_port_simu into r_port_simu;
    if ( c_port_simu%notfound ) then
      raise_application_error(-20808, 'No Existe Portafolio : ' || p_port_simu );
    end if;
    close c_port_simu;
    --
    open c_orin_real;
    Loop
        fetch c_orin_real into r_orin_real;
        --
        exit when (c_orin_real%notfound);
        --
        if ( r_orin_real.port_tipo = 'S' ) then
         raise_application_error(-20810, 'Portafolio Origen : ' || to_char(r_orin_real.orin_port)|| ' es de Simulacion.  Seleccione el Portafolio Origen Tipo R-Real ');
        end if;
        --
        Insert into pi_torin
          ( orin_port, orin_orin, orin_tpop, orin_auxi_terc,
            orin_fecha, orin_valor, orin_stat, orin_observa,
            orin_proc, orin_usua, orin_feccre )
           values
          ( p_port_simu, r_orin_real.orin_orin, r_orin_real.orin_tpop,
            r_orin_real.orin_auxi_terc, r_orin_real.orin_fecha,
            r_orin_real.orin_valor, r_orin_real.orin_stat, r_orin_real.orin_observa,
            r_orin_real.orin_proc, r_orin_real.orin_usua, r_orin_real.orin_feccre  );
        --
        --  Insercion Estados de Ordenes de Inversion
        --
        Ins_stoi ( p_port_real, r_orin_real.orin_orin,  p_port_simu );
        --
        --  Insercion de Operaciones Relacionadas
        --
        Ins_opoi ( p_port_real, r_orin_real.orin_orin,  p_port_simu );
        --
      End Loop;
      --
    close c_orin_real;
    --
  exception
     when others then
       raise_application_error(-20812, 'Error de en ins_orin, = ' || sqlerrm);
  end ins_orin;
  --
  --
  --
  procedure ins_opoi ( p_port_real           in    number,
                       p_orin_real           in    number,
                       p_port_simu           in    number  ) is
    --
    v_Error   varchar2(500);
    --
    cursor c_opoi_real is
    select opoi_port, opoi_orin, opoi_oper
      from pi_topoi
     where opoi_orin = p_orin_real
       and opoi_port = p_port_real;
    --
    --  Hace una Replica de las Operaciones de Ordenes de Pagos y lo Copia en una de un portafolio Simulado
    --
    --
    r_opoi_real   c_opoi_real%rowtype;
    --
    e_ins_opoi    exception;
    --
  begin
    --
    for i in c_opoi_real loop
      --
      Ins_Oper ( p_port_real, i.opoi_oper, p_port_simu );
      --
      begin
        --
        Insert into pi_topoi
          ( opoi_port, opoi_orin, opoi_oper )
        values
          ( p_port_simu, i.opoi_orin, i.opoi_oper );
        --
        exception
          when others then
            v_Error := 'Insertando en PI_TOPOI. OrIn='|| i.opoi_orin || ' Oper='|| i.opoi_Oper || ' : ' || sqlerrm;
            raise e_ins_opoi;

      end;
      --
    End Loop c_opoi_real;
    --
    exception
      when e_ins_opoi then
        raise_application_error(-20814, v_Error);
      when others then
        raise_application_error(-20814, 'Error de en ins_opoi, = ' || sqlerrm);
  end ins_opoi;
  --
  --
  --
  procedure ins_oper ( p_port_real           in    number,
                       p_oper_real           in    number,
                       p_port_simu           in    number  ) is
    --
    cursor c_oper_real is
    select oper_port,   oper_oper,   oper_titu,   oper_fech,
           oper_valor,  oper_conf,   oper_tpop,   oper_vare,
           oper_tesor,  oper_user,   oper_vcon,   oper_gpyg,
           oper_siaf,   oper_contab, oper_feccre, oper_usua,
           oper_mvac_nromov, port_tipo
      from pi_toper, pi_tport
     where port_port = oper_port
       and oper_port = p_port_real
       and oper_oper = p_oper_real;
    --
    cursor c_oper_simu is
    select oper_oper
      from pi_toper
     where oper_port = p_port_simu
       and oper_oper = p_oper_real;
    --
    --  Hace una Replica de una Operacion de Una Orden de Inv. de un Portafolio
    --  y lo Copia en una de un portafolio Simulado
    --
    --
    v_oper_simu           pi_toper.oper_oper%type;
    r_oper_real           c_oper_real%rowtype;
    --
    cursor c_titu_simu ( pc_Titu  integer ) is
    select titu_titu
      from pi_ttitu
     where titu_port = p_port_simu
       and titu_titu = pc_Titu;
    --
    r_titu_simu         c_titu_simu%rowtype;
    --
  begin
    --
    for i in c_oper_real loop
      --
      open c_oper_simu;
      fetch c_oper_simu into v_oper_simu;
      if ( c_oper_simu%notfound ) then
        --
        open  c_titu_simu ( i.oper_Titu );
        fetch c_titu_simu into r_titu_simu;
        if ( c_titu_simu%found ) then
          --
          begin
            --
            insert into pi_toper
              ( oper_port,   oper_oper,     oper_titu,     oper_fech,   oper_valor,      oper_conf,
                oper_tpop,   oper_vare,     oper_tesor,    oper_user,   oper_vcon,       oper_gpyg,
                oper_siaf,   oper_contab,   oper_feccre,   oper_usua,   oper_mvac_nromov )
            values
              ( p_port_Simu, i.oper_oper,   i.oper_titu,   i.oper_fech, i.oper_valor,    i.oper_conf,  -- Tenia oper_Port
                i.oper_tpop, i.oper_vare,   i.oper_tesor,  i.oper_user, i.oper_vcon,     i.oper_gpyg,
                i.oper_siaf, i.oper_contab, i.oper_feccre, i.oper_usua, i.oper_mvac_nromov  );
            --
            exception
              when dup_val_on_index then
                null;  ---- Ok.
          end;
          --
        end if;
        --
        close c_titu_simu;
        --
      end if;
      --
      close c_oper_simu;
      --
    end loop c_oper_real;
    --
  exception
     when others then
       raise_application_error(-20818, 'Error de en ins_oper, = ' || sqlerrm);
  end ins_oper;
  --
  --
  --
  procedure ins_rnac ( p_port_real           in    number,
                       p_titu_real           in    number,
                       p_port_simu           in    number  ) is
    --
    cursor c_rnac_real is select  rnac_port, rnac_fecha, rnac_auxi_emis, rnac_tpo_accion,
                            rnac_valor, rnac_rend, rnac_cant, rnac_tot_rend,
                            rnac_titu, rnac_tppa, port_tipo
                         from  pi_trnac, pi_tport
                         where port_port = rnac_port
                         and   rnac_port = p_port_real
                         and   rnac_titu = p_titu_real;
    --
    --  Hace una Replica de una Rendimientos de Valoracion de Acciones de un titulo
    --  y lo Copia en una de un portafolio Simulado
    --
    --
    r_rnac_real           c_rnac_real%rowtype;
    --
    cursor c_port_simu  is select port_port
                           from   pi_tport
                           where  port_port = p_port_simu;
    --
    r_port_simu         c_port_simu%rowtype;
    --
  begin
    --
    open  c_port_simu;
      --
      fetch c_port_simu into r_port_simu;
      --
      if ( c_port_simu%notfound ) then
         raise_application_error(-20820, 'No Se Puede Sobre-Escribir el Portafolio Real, = ' || to_char(p_port_simu));
      end if;
      --
    close c_port_simu;
    --
    open c_rnac_real;
      --
      loop
        fetch c_rnac_real into r_rnac_real;
        --
        exit when ( c_rnac_real%notfound );
          --
          Insert into pi_trnac
            ( rnac_port, rnac_fecha, rnac_auxi_emis, rnac_tpo_accion,
              rnac_valor, rnac_rend, rnac_cant, rnac_tot_rend,
              rnac_titu, rnac_tppa )
             values
            ( p_port_simu, r_rnac_real.rnac_fecha, r_rnac_real.rnac_auxi_emis,
              r_rnac_real.rnac_tpo_accion, r_rnac_real.rnac_valor, r_rnac_real.rnac_rend,
              r_rnac_real.rnac_cant, r_rnac_real.rnac_tot_rend,   r_rnac_real.rnac_titu,
              r_rnac_real.rnac_tppa  );
         --
      end loop;
      --
    close c_rnac_real;
    --
  exception
     when others then
       raise_application_error(-20822, 'Error de en ins_rnac, = ' || sqlerrm);
  end ins_rnac;
  --
  --
  --
  procedure ins_nuac ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnuac
    ( nuac_port, nuac_accn )
    select p_port_simu, nuac_accn
    from   pi_tnuac
    where  nuac_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20824, 'Error de en ins_nuac, = ' || sqlerrm);
  end ins_nuac;
  --
  --
  --
  procedure ins_nudr ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnudr
    ( nudr_port, nudr_deri )
    select p_port_simu, nudr_deri
    from   pi_tnudr
    where  nudr_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20826, 'Error de en ins_nudr, = ' || sqlerrm);
  end ins_nudr;
  --
  --
  --
  procedure ins_numa ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnuma
    ( numa_port, numa_nromov )
    select p_port_simu, numa_nromov
    from   pi_tnuma
    where  numa_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20828, 'Error de en ins_numa, = ' || sqlerrm);
  end ins_numa;
  --
  --
  --
  procedure ins_nuoi ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnuoi
    ( nuoi_port, nuoi_orin, nuoi_vigen )
    select p_port_simu, nuoi_orin, nuoi_vigen
    from   pi_tnuoi
    where  nuoi_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20830, 'Error de en ins_nuoi, = ' || sqlerrm);
  end ins_nuoi;
  --
  --
  --
  procedure ins_nuop ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnuop
    ( nuop_port, nuop_oper )
    select p_port_simu, nuop_oper
    from   pi_tnuop
    where  nuop_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20832, 'Error de en ins_nuop, = ' || sqlerrm);
  end ins_nuop;
  --
  --
  --
  procedure ins_nurd ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnurd
    ( nurd_port, nurd_redn )
    select p_port_simu, nurd_redn
    from   pi_tnurd
    where  nurd_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20834, 'Error de en ins_nurd, = ' || sqlerrm);
  end ins_nurd;
  --
  --
  --
  procedure ins_nurp ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnurp
    ( nurp_port, nurp_repo )
    select p_port_simu, nurp_repo
    from   pi_tnurp
    where  nurp_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20836, 'Error de en ins_nurp, = ' || sqlerrm);
  end ins_nurp;
  --
  --
  --
  procedure ins_nuti ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnuti
    ( nuti_port, nuti_titu )
    select p_port_simu, nuti_titu
    from   pi_tnuti
    where  nuti_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20838, 'Error de en ins_nuti, = ' || sqlerrm);
  end ins_nuti;
  --
  --
  --
  procedure ins_nuts ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
  begin
    --
    insert into pi_tnuts
    ( nuts_port, nuts_titu )
    select p_port_simu, nuts_titu
    from   pi_tnuts
    where  nuts_port = p_port_real;
    --
  exception
     when others then
       raise_application_error(-20840, 'Error de en ins_nuts, = ' || sqlerrm);
  end ins_nuts;
  --
  --
  --
  procedure ins_valo ( p_port_real           in    number,
                       p_titu_real           in    number,
                       p_port_simu           in    number  ) is
   --
   cursor c_valo_real is select  valo_port, valo_titu, valo_fecha, valo_line, valo_merc,
                            valo_t365, valo_damo, valo_dado, valo_pamo,
                            valo_pada, valo_inco, valo_inan, valo_rend, valo_inte,
                            valo_dura, valo_rend_line
                         from  pi_tvalo, pi_tport
                         where port_port = valo_port
                         and   valo_port = p_port_real
                         and   valo_titu = p_titu_real;
   --
   --  Hace una Replica de una Rendimientos de Valoracion de Acciones de un titulo
   --  y lo Copia en una de un portafolio Simulado
   --
   --
   r_valo_real           c_valo_real%rowtype;
   --
   cursor c_port_simu  is select port_port
                          from   pi_tport
                          where  port_port = p_port_simu;
   --
   r_port_simu         c_port_simu%rowtype;
   --
  begin
    --
    open  c_port_simu;
      --
      fetch c_port_simu into r_port_simu;
      --
      if ( c_port_simu%notfound ) then
         raise_application_error(-20842, 'No Se Puede Sobre-Escribir el Portafolio Real, = ' || to_char(p_port_simu));
      end if;
      --
    close c_port_simu;
    --
    open c_valo_real;
      Loop
        --
        fetch c_valo_real into r_valo_real;
        --
        exit when ( c_valo_real%notfound );
        --
        Insert into pi_tvalo
          ( valo_port, valo_titu, valo_fecha, valo_line, valo_merc,
            valo_t365, valo_damo, valo_dado, valo_pamo,
            valo_pada, valo_inco, valo_inan, valo_rend, valo_inte,
            valo_dura, valo_rend_line )
           values
          ( p_port_simu, r_valo_real.valo_titu, r_valo_real.valo_fecha, r_valo_real.valo_line,
            r_valo_real.valo_merc, r_valo_real.valo_t365, r_valo_real.valo_damo,
            r_valo_real.valo_dado, r_valo_real.valo_pamo, r_valo_real.valo_pada,
            r_valo_real.valo_inco, r_valo_real.valo_inan, r_valo_real.valo_rend,
            r_valo_real.valo_inte, r_valo_real.valo_dura, r_valo_real.valo_rend_line  );
        --
      end loop;
    close c_valo_real;
    --
  exception
     when others then
       raise_application_error(-20844, 'Error de en ins_valo, = ' || sqlerrm);
  end ins_valo;
  --
  --
  --
  procedure ins_clti ( p_port_real           in    number,
                       p_titu_real           in    number,
                       p_port_simu           in    number  ) is
    --
    --  Hace una Replica de una Rendimientos de Valoracion de Acciones de un titulo
    --  y lo Copia en una de un portafolio Simulado
    --
    --
    --
  begin
    --
    insert into pi_tclti
    ( clti_port, clti_titu, clti_consec, clti_fecha, clti_fecfin, clti_clin,
      clti_usua, clti_usua_auto, clti_feccre )
    select  p_port_simu, clti_titu, clti_consec, clti_fecha, clti_fecfin, clti_clin,
            clti_usua,   clti_usua_auto, clti_feccre
    from pi_tclti
    where clti_port = p_port_real
    and   clti_titu = p_titu_real;
    --
  exception
     when others then
       raise_application_error(-20846, 'Error de en ins_clti, = ' || sqlerrm);
  end ins_clti;
  --
  --
  --
  procedure ins_redn ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
   --  Hace una Replica de las Redenciones de un Titulo
   --  y lo Copia en una de un portafolio Simulado
   --
   --
   cursor c_redn_real is select  redn_redn, redn_fecha, redn_tipo, redn_valor, redn_stat,
                          redn_prorroga, redn_usua, redn_feccre, redn_titu,
                          redn_auxi_terc, redn_fluj, redn_repo, redn_vcapi, redn_vinte,
                          redn_vreca, redn_observa
                         from  pi_tredn
                         where redn_port = p_port_real
                         and   redn_stat in ('I','A');
   --
   --
   r_redn_real           c_redn_real%rowtype;
   --
   --
   --
  begin
    --
    open c_redn_real;
      --
      Loop
        fetch c_redn_real into r_redn_real;
        exit when (c_redn_real%notfound);
          --
          insert into pi_tredn
          ( redn_port, redn_redn, redn_fecha, redn_tipo, redn_valor, redn_stat,
            redn_prorroga, redn_usua, redn_feccre, redn_titu, redn_auxi_terc,
            redn_fluj, redn_repo, redn_vcapi, redn_vinte, redn_vreca, redn_observa )
           values
          ( p_port_simu, r_redn_real.redn_redn, r_redn_real.redn_fecha, r_redn_real.redn_tipo,
            r_redn_real.redn_valor, r_redn_real.redn_stat,
            r_redn_real.redn_prorroga, r_redn_real.redn_usua, r_redn_real.redn_feccre,
            r_redn_real.redn_titu, r_redn_real.redn_auxi_terc,
            r_redn_real.redn_fluj, r_redn_real.redn_repo, r_redn_real.redn_vcapi,
            r_redn_real.redn_vinte, r_redn_real.redn_vreca, r_redn_real.redn_observa );
           --
           ins_strd ( p_port_real, r_redn_real.redn_redn, p_port_simu );
           --
           ins_oprd ( p_port_real, r_redn_real.redn_redn, p_port_simu );
           --
      End Loop;
      --
    close c_redn_real;
    --
  exception
     when others then
       raise_application_error(-20848, 'Error de en ins_redn, = ' || sqlerrm);
  end ins_redn;
  --
  procedure ins_fluj ( p_port_real           in    number,
                       p_titu_real           in    number,
                       p_port_simu           in    number  ) is
   --
   --  Hace una Replica de los Flujos de un Titulo
   --  y lo Copia en una de un portafolio Simulado
   --
   --
  begin
    --
    insert into pi_tfluj
    ( fluj_port, fluj_titu, fluj_fluj, fluj_fech, fluj_clas, fluj_stat, fluj_amor )
    select p_port_simu, fluj_titu, fluj_fluj, fluj_fech, fluj_clas, fluj_stat, fluj_amor
    from  pi_tfluj
    where fluj_port = p_port_real
    and   fluj_titu = p_titu_real;
    --
  exception
     when others then
       raise_application_error(-20850, 'Error de en ins_fluj, = ' || sqlerrm);
  end ins_fluj;
  --
  procedure ins_strd ( p_port_real           in    number,
                       p_redn_real           in    number,
                       p_port_simu           in    number  ) is
   --
   --  Hace una Replica de los Estados de las Redenciones de un Titulo
   --  y lo Copia en una de un portafolio Simulado
   --
   --
  begin
    --
    insert into pi_tstrd
    ( strd_port, strd_redn, strd_stat, strd_fecha, strd_observa, strd_usua, strd_feccre )
    select   p_port_simu, strd_redn, strd_stat, strd_fecha, strd_observa,
             strd_usua,   strd_feccre
    from  pi_tstrd
    where strd_port = p_port_real
    and   strd_redn = p_redn_real;
    --
  exception
     when others then
       raise_application_error(-20852, 'Error de en ins_strd, = ' || sqlerrm);
  end ins_strd;
  --
  --
  --
  --
  procedure ins_repo ( p_port_real           in    number,
                       p_port_simu           in    number  ) is
   --
   --  Hace una Replica de los Repos de un Portafolio
   --  y lo Copia en una de un portafolio Simulado
   --
   --
   e_Repo   exception;
   v_Error  varchar2(500);
   --
   cursor c_repo_real is
   select repo_port,      repo_repo,      repo_tipo,    repo_tppa,
          repo_fech_ini,  repo_fech_fin,  repo_valor,   repo_auxi_enti,
          repo_porc_gara, repo_vgarantia, repo_vtasa,   repo_fpag,
          repo_stat,      repo_usua,      repo_feccre
     from pi_trepo
    where repo_port =  p_port_real
      and repo_stat in ('A','F','C');
   --
   r_repo_real          c_repo_real%rowtype;
   --
  begin
    --
    for i in c_repo_real loop
      --
      begin
        --
        insert into pi_trepo
          ( repo_port,       repo_repo,    repo_tipo,        repo_tppa,        repo_fech_ini,
            repo_fech_fin,   repo_valor,   repo_auxi_enti,   repo_porc_gara,   repo_vgarantia,
            repo_vtasa,      repo_fpag,    repo_stat,        repo_usua,        repo_feccre )
        values
          ( p_port_simu,     i.repo_repo,  i.repo_tipo,      i.repo_tppa,      i.repo_fech_ini,
            i.repo_fech_fin, i.repo_valor, i.repo_auxi_enti, i.repo_porc_gara, i.repo_vgarantia,
            i.repo_vtasa,    i.repo_fpag,  i.repo_stat,      i.repo_usua,      i.repo_feccre );
        --
        exception
          when others then
            v_Error := 'Insertando en PI_TREPO: ' || sqlerrm;
            raise e_Repo;
      end;
      --
      ins_strp ( p_port_real, i.repo_repo, p_port_simu );
      --
    end loop c_repo_real;
    --
    exception
      when e_Repo then
        raise_application_error(-20853, 'Error de en ins_repo, = ' || v_Error );
      when others then
        raise_application_error(-20854, 'Error de en ins_repo, = ' || sqlerrm );
    --
  end ins_repo;
  --
  --
  --
  --
  procedure ins_strp ( p_port_real           in    number,
                       p_repo_real           in    number,
                       p_port_simu           in    number  ) is
   --
   --  Hace una Replica de los Estados de Repos de un Portafolio
   --  y lo Copia en una de un Portafolio Simulado
   --
   --
  begin
    --
    insert into pi_tstrp
    ( strp_port, strp_repo, strp_stat, strp_fecha, strp_observa, strp_usua,
      strp_feccre )
    select  p_port_simu, p_repo_real, strp_stat, strp_fecha, strp_observa, strp_usua,
            strp_feccre
    from  pi_tstrp
    where strp_port = p_port_real
    and   strp_repo = p_repo_real;
    --
  exception
     when others then
       raise_application_error(-20856, 'Error de en ins_strp, = ' || sqlerrm);
  end ins_strp;
  --
  --
  --
  procedure ins_oprd ( p_port_real           in    number,
                       p_redn_real           in    number,
                       p_port_simu           in    number  ) is
    --
    --  Hace una Replica de las Operaciones de las Redenciones
    --  y lo Copia en una de un portafolio Simulado
    --
    cursor c_oprd_real is
    select oprd_port, oprd_redn, oprd_oper
      from pi_toprd
     where oprd_port = p_port_real
       and oprd_redn = p_redn_real;
    --
  begin
    --
    --  Insercion de la Operacion de Redencion
    --
    for i in c_oprd_real loop
      --
      Ins_Oper ( p_port_real, i.oprd_oper, p_port_simu );
      --
      begin
        --
        insert into pi_toprd
          ( oprd_port,   oprd_redn,   oprd_oper )
        values
          ( p_port_simu, i.oprd_redn, i.oprd_oper );
        --
        exception
          when dup_val_on_index then
            null;   -------------------  Se puede presentar, pero estaria bien.
        --
      end;
    --
    End Loop;
    --
    --
  exception
     when others then
       raise_application_error(-20858, 'Error de en ins_oprd, = ' || sqlerrm);
  end ins_oprd;
  --
  --
  --
  procedure ins_stoi ( p_port_real           in    number,
                       p_orin_real           in    number,
                       p_port_simu           in    number  ) is
   --
   --  Hace una Replica de los Estados las Ordenes de Inversion de un Portafolio
   --  y lo Copia en una de un Portafolio Simulado
   --
   --
  begin
    --
    insert into pi_tstoi
    ( stoi_port, stoi_orin, stoi_stat, stoi_fecha, stoi_observa, stoi_usua,
      stoi_feccre )
    select  p_port_simu, p_orin_real, stoi_stat, stoi_fecha, stoi_observa, stoi_usua,
            stoi_feccre
    from  pi_tstoi
    where stoi_port = p_port_real
    and   stoi_orin = p_orin_real;
    --
  exception
     when others then
       raise_application_error(-20860, 'Error de en ins_stoi, = ' || sqlerrm);
  end ins_stoi;
  --
  --
  --
  --
  procedure proc_info ( p_port_real           in    number,
                        p_fecha               in    date,
                        p_port_simu           in    number  ) is
   --
   --  Proceso de Copia de Portafolio
   --
   --
  begin
    --
    --  Eliminar Datos Relacionados
    --
    elim_info (  p_port_simu );
    --
    --  Insercion Ordenes de Portafolio
    --
    ins_port ( p_port_real, p_port_simu );
    --
    --  Insercion Ordenes de Repos
    --
    ins_repo ( p_port_real, p_port_simu );
    --
    --  Insercion Ordenes de Titulos
    --
    ins_titu ( p_port_real, p_port_simu, p_fecha );
    --
    --  Insercion Ordenes de Redenciones, Estados de Redencion y Operaciones Relacionadas
    --
    ins_redn ( p_port_real, p_port_simu );
    --
    --  Insercion Ordenes de Inversion, Estados de Ordenes de Inversion, Operaciones
    --  Relacionadas a las Ordenes de Inversion
    --
    ins_orin ( p_port_real, p_port_simu );
    --
    --  Insercion de Numeraciones Utilizada en Portafolios
    --
    ins_nuac ( p_port_real, p_port_simu );
    --
    ins_numa ( p_port_real, p_port_simu );
    --
    ins_nudr ( p_port_real, p_port_simu );
    --
    ins_nuoi ( p_port_real, p_port_simu );
    --
    ins_nuop ( p_port_real, p_port_simu );
    --
    ins_nurd ( p_port_real, p_port_simu );
    --
    ins_nurp ( p_port_real, p_port_simu );
    --
    ins_nuti ( p_port_real, p_port_simu );
    --
    ins_nuts ( p_port_real, p_port_simu );
    --
    -- Valores de Tasas, Monedas, Indices, Betas, Tasas Implicitas.
    --
    Ins_VATA ( p_port_Simu );
    --
    Ins_VAMO ( p_port_Simu );
    --
    Ins_VAIN ( p_port_Simu );
    --
    Ins_BTIN ( p_port_Simu );
    --
    Ins_VTIM ( p_port_Simu );
    --
    -- Emisores por Portafolio y Tipos de Papel por Emisor y por Portafolio
    --
    Ins_EMPO ( p_port_real, p_port_simu );
    --
    Ins_PAEM ( p_port_real, p_port_simu );
    --
    -- Retenciones por Portafolio
    --
    Ins_RTPR ( p_port_real, p_port_simu );
    --
    -- Usuarios Autorizadores por Portafolio.
    --
    Ins_UAPO ( p_port_real, p_port_simu );
    --
    --
  exception
     when others then
       raise_application_error(-20862, 'Error de en proc_info, = ' || sqlerrm);
  end proc_info;
  --
  --
  --
  procedure Ins_VATA ( p_port_Simu     integer ) is
    --
    -- Copia Valores Reales de Tasas a Valores Simulados.
    --
    v_Fecha   date;
    --
    cursor c_titu is
    select min(titu_FeEm) titu_FeEm
      from pi_ttitu
     where titu_Port = p_port_Simu;
    --
    cursor c_tasa is
    select vata_Tasa, vata_Fecha, vata_Peri_ini, vata_Peri_Fin
      from pi_tvata
     where vata_Tipo  =  'R'    ---- Valores Reales
       and vata_Fecha >= v_Fecha
    minus
    select vata_Tasa, vata_Fecha, vata_Peri_ini, vata_Peri_Fin
      from pi_tvata
     where vata_Tipo = 'S';   ---- Valores de Simulacion
    --
    cursor c_vata ( pc_Tasa varchar2, pc_Fecha date, pc_Peri_ini integer, pc_Peri_Fin integer ) is
    select vata_Valor
      from pi_tvata
     where vata_Tasa      = pc_Tasa
       and vata_Fecha     = pc_Fecha
       and vata_Peri_Ini  = pc_Peri_Ini
       and vata_Peri_Fin  = pc_Peri_Fin
       and vata_Tipo      = 'R';
    --
    v_Valor  pi_tvata.vata_Valor%Type;
    --
  begin
    --
    open c_titu;
    fetch c_titu into v_Fecha;
    close c_titu;
    --
    v_Fecha := v_Fecha - 60;
    --
    --
    for i in c_tasa loop
      --
      open c_vata( i.vata_Tasa, i.vata_Fecha, i.vata_Peri_Ini, i.vata_Peri_Fin );
      fetch c_vata into v_Valor;
      close c_vata;
      --
      begin
        --
        insert into pi_tvata
          ( vata_Tasa,   vata_Fecha,   vata_Peri_Ini,   vata_Peri_Fin,   vata_Valor, vata_Tipo )
        values
          ( i.vata_Tasa, i.vata_Fecha, i.vata_Peri_Ini, i.vata_Peri_Fin, v_Valor,    'S' );
        --
        exception
          when others then
            raise_application_error(-20864, 'Error insertando en PI_TVATA: ' || sqlerrm);
      end;
      --
    end loop c_tasa;
    --
  end Ins_VATA;
  --
  --
  --
  procedure Ins_VAMO ( p_port_Simu     integer ) is
    --
    -- Copia Valores Reales de Monedas a Valores Simulados.
    --
    v_Fecha   date;
    --
    cursor c_titu is
    select min(titu_FeEm) titu_FeEm
      from pi_ttitu
     where titu_Port = p_port_Simu;
    --
    cursor c_Mone is
    select vamo_Mone, vamo_Fecha
      from pi_tvamo
     where vamo_Tipo  =  'R'    ---- Valores Reales
       and vamo_Fecha >= v_Fecha
    union
    select vamo_Mone, min(vamo_Fecha)
      from pi_tvamo
     where vamo_Valor = 1
     group by vamo_Mone
    minus
    select vamo_Mone, vamo_Fecha
      from pi_tvamo
     where vamo_Tipo = 'S';   ---- Valores de Simulacion
    --
    cursor c_vamo ( pc_Mone varchar2, pc_Fecha date ) is
    select vamo_Valor
      from pi_tvamo
     where vamo_Mone      = pc_Mone
       and vamo_Fecha     = pc_Fecha
       and vamo_Tipo      = 'R';
    --
    v_Valor  pi_tvamo.vamo_Valor%Type;
    --
  begin
    --
    open c_titu;
    fetch c_titu into v_Fecha;
    close c_titu;
    --
    v_Fecha := v_Fecha - 60;
    --
    for i in c_Mone loop
      --
      open c_VAMO( i.vamo_Mone, i.vamo_Fecha );
      fetch c_VAMO into v_Valor;
      close c_VAMO;
      --
      begin
        --
        insert into pi_tvamo
          ( vamo_Mone,   vamo_Fecha,   vamo_Valor, vamo_Tipo )
        values
          ( i.vamo_Mone, i.vamo_Fecha, v_Valor,    'S' );
        --
        exception
          when others then
            raise_application_error(-20866, 'Error insertando en pi_tvamo: ' || sqlerrm);
      end;
      --
    end loop c_Mone;
    --
  end Ins_VAMO;
  --
  --
  --
  procedure Ins_VAIN ( p_port_Simu     integer ) is
    --
    -- Copia Valores Reales de Indices a Valores Simulados.
    --
    v_Fecha   date;
    --
    cursor c_titu is
    select min(titu_FeEm) titu_FeEm
      from pi_ttitu
     where titu_Port = p_port_Simu;
    --
    cursor c_Inva is
    select vain_Inva, vain_Fecha, vain_Fecha_Vto
      from pi_tvain
     where vain_Tipo  =  'R'    ---- Valores Reales
       and vain_Fecha >= v_Fecha
    minus
    select vain_Inva, vain_Fecha, vain_Fecha_Vto
      from pi_tvain
     where vain_Tipo = 'S';   ---- Valores de Simulacion
    --
    cursor c_vain ( pc_Inva varchar2, pc_Fecha date, pc_Fecha_Vto date ) is
    select vain_Valor
      from pi_tvain
     where vain_Inva      = pc_Inva
       and vain_Fecha     = pc_Fecha
       and vain_Fecha_Vto = pc_Fecha_Vto
       and vain_Tipo      = 'R';
    --
    v_Valor  pi_tvain.vain_Valor%Type;
    --
  begin
    --
    open c_titu;
    fetch c_titu into v_Fecha;
    close c_titu;
    --
    v_Fecha := v_Fecha - 60;
    --
    --
    for i in c_Inva loop
      --
      open c_vain( i.vain_Inva, i.vain_Fecha, i.vain_Fecha_Vto );
      fetch c_vain into v_Valor;
      close c_vain;
      --
      begin
        --
        insert into pi_tvain
          ( vain_Inva,   vain_Fecha,   vain_Fecha_Vto,    vain_Valor, vain_Tipo )
        values
          ( i.vain_Inva, i.vain_Fecha, i.vain_Fecha_Vto, v_Valor,    'S' );
        --
        exception
          when others then
            raise_application_error(-20868, 'Error insertando en pi_tvain: ' || sqlerrm);
      end;
      --
    end loop c_Inva;
    --
  end Ins_VAIN;
  --
  --
  --
  procedure Ins_BTIN ( p_port_Simu     integer ) is
    --
    -- Copia Valores Reales de Betas a Valores Simulados.
    --
    v_Fecha   date;
    --
    cursor c_titu is
    select min(titu_FeEm) titu_FVto
      from pi_ttitu
     where titu_Port = p_port_Simu;
    --
    cursor c_Inva is
    select btin_Inva, btin_Fecha
      from pi_tbtin
     where btin_Tipo  =  'R'    ---- Valores Reales
       and btin_Fecha >= v_Fecha
    minus
    select btin_Inva, btin_Fecha
      from pi_tbtin
     where btin_Tipo = 'S';   ---- Valores de Simulacion
    --
    cursor c_btin ( pc_Inva varchar2, pc_Fecha date ) is
    select btin_b_1, btin_b_2, btin_b_3, btin_b_4
      from pi_tbtin
     where btin_Inva      = pc_Inva
       and btin_Fecha     = pc_Fecha
       and btin_Tipo      = 'R';
    --
    r_bt   c_btin%RowType;
    --
  begin
    --
    open c_titu;
    fetch c_titu into v_Fecha;
    close c_titu;
    --
    v_Fecha := v_Fecha - 60;
    --
    --
    for i in c_Inva loop
      --
      open c_btin( i.btin_Inva, i.btin_Fecha );
      fetch c_btin into r_bt;
      close c_btin;
      --
      begin
        --
        insert into pi_tbtin
          ( btin_Inva,   btin_Fecha,   btin_b_1,      btin_b_2,      btin_b_3,      btin_b_4,      btin_Tipo )
        values
          ( i.btin_Inva, i.btin_Fecha, r_bt.btin_b_1, r_bt.btin_b_2, r_bt.btin_b_3, r_bt.btin_b_4, 'S' );
        --
        exception
          when others then
            raise_application_error(-20870, 'Error insertando en pi_tbtin: ' || sqlerrm);
      end;
      --
    end loop c_Inva;
    --
  end Ins_BTIN;
  --
  --
  --
  procedure Ins_VTIM ( p_port_Simu     integer ) is
    --
    -- Copia Valores Reales de Tasas Implicitas a Valores Simulados.
    --
    v_Fecha   date;
    --
    cursor c_titu is
    select min(titu_FeEm) titu_FeEm
      from pi_ttitu
     where titu_Port = p_port_Simu;
    --
    cursor c_tasa is
    select vtim_Tasa, vtim_Fecha, vtim_Peri_ini, vtim_Peri_Fin
      from pi_tvtim
     where vtim_Tipo  =  'R'    ---- Valores Reales
       and vtim_Fecha >= v_Fecha
    minus
    select vtim_Tasa, vtim_Fecha, vtim_Peri_ini, vtim_Peri_Fin
      from pi_tvtim
     where vtim_Tipo = 'S';   ---- Valores de Simulacion
    --
    cursor c_vtim ( pc_Tasa varchar2, pc_Fecha date, pc_Peri_ini integer, pc_Peri_Fin integer ) is
    select vtim_Valor
      from pi_tvtim
     where vtim_Tasa      = pc_Tasa
       and vtim_Fecha     = pc_Fecha
       and vtim_Peri_Ini  = pc_Peri_Ini
       and vtim_Peri_Fin  = pc_Peri_Fin
       and vtim_Tipo      = 'R';
    --
    v_Valor  pi_tvtim.vtim_Valor%Type;
    --
  begin
    --
    open c_titu;
    fetch c_titu into v_Fecha;
    close c_titu;
    --
    v_Fecha := v_Fecha - 60;
    --
    --
    for i in c_tasa loop
      --
      open c_vtim( i.vtim_Tasa, i.vtim_Fecha, i.vtim_Peri_Ini, i.vtim_Peri_Fin );
      fetch c_vtim into v_Valor;
      close c_vtim;
      --
      begin
        --
        insert into pi_tvtim
          ( vtim_Tasa,   vtim_Fecha,   vtim_Peri_Ini,   vtim_Peri_Fin,   vtim_Valor, vtim_Tipo )
        values
          ( i.vtim_Tasa, i.vtim_Fecha, i.vtim_Peri_Ini, i.vtim_Peri_Fin, v_Valor,    'S' );
        --
        exception
          when others then
            raise_application_error(-20872, 'Error insertando en pi_tvtim: ' || sqlerrm);
      end;
      --
    end loop c_tasa;
    --
  end Ins_VTIM;
  --
  --
  --
  procedure Ins_EMPO ( p_port_Real     integer,
                       p_port_Simu     integer ) is
    --
    -- Copia Emisores por Portafolio
    -- Portafolio Real a Portafolio de Simulacion.
    --
    --
    cursor c_empo is
    select empo_auxi_Emis, empo_Porc_Inv
      from pi_tempo
     where empo_port  = p_port_Real;
    --
    --
  begin
    --
    --
    for i in c_empo loop
      --
      begin
        --
        insert into pi_tempo
          ( empo_Port,   empo_auxi_Emis,   empo_Porc_Inv )
        values
          ( p_port_Simu, i.empo_auxi_Emis, i.empo_Porc_Inv );
        --
        exception
          when others then
            raise_application_error(-20874, 'Error insertando en pi_tempo: ' || sqlerrm);
      end;
      --
    end loop c_empo;
    --
  end Ins_EMPO;
  --
  --
  --
  procedure Ins_PAEM ( p_port_Real     integer,
                       p_port_Simu     integer ) is
    --
    -- Copia Tipos de Papel por Emisores y por Portafolio
    -- Portafolio Real a Portafolio de Simulacion.
    --
    --
    cursor c_paem is
    select paem_auxi_Emis, paem_TpPa
      from pi_tpaem
     where paem_port  = p_port_Real;
    --
    --
  begin
    --
    --
    for i in c_paem loop
      --
      begin
        --
        insert into pi_tpaem
          ( paem_Port,   paem_auxi_Emis,   paem_TpPa )
        values
          ( p_port_Simu, i.paem_auxi_Emis, i.paem_TpPa );
        --
        exception
          when others then
            raise_application_error(-20876, 'Error insertando en pi_tpaem: ' || sqlerrm);
      end;
      --
    end loop c_paem;
    --
  end Ins_PAEM;
  --
  --
  --
  procedure Ins_RTPR ( p_port_Real     integer,
                       p_port_Simu     integer ) is
    --
    -- Copia Parametrizacion de Retenciones por Portafolio
    -- Portafolio Real a Portafolio de Simulacion.
    --
    --
    cursor c_rtpr is
    select rtpr_Mad_Ini, rtpr_Mad_Fin, rtpr_Porc
      from pi_trtpr
     where rtpr_port  = p_port_Real;
    --
  begin
    --
    --
    for i in c_rtpr loop
      --
      begin
        --
        insert into pi_trtpr
          ( rtpr_Port,   rtpr_Mad_Ini,   rtpr_Mad_Fin,   rtpr_Porc )
        values
          ( p_port_Simu, i.rtpr_Mad_Ini, i.rtpr_Mad_Fin, i.rtpr_Porc );
        --
        exception
          when others then
            raise_application_error(-20878, 'Error insertando en pi_trtpr: ' || sqlerrm);
      end;
      --
    end loop c_rtpr;
    --
  end Ins_RTPR;
  --
  --
  --
  procedure Ins_UAPO ( p_port_Real     integer,
                       p_port_Simu     integer ) is
    --
    -- Copia Usuarios Autorizadores por Portafolio
    -- Portafolio Real a Portafolio de Simulacion.
    --
    --
    cursor c_uapo is
    select uapo_Usua
      from pi_tuapo
     where uapo_port  = p_port_Real;
    --
  begin
    --
    --
    for i in c_uapo loop
      --
      begin
        --
        insert into pi_tuapo
          ( uapo_Port,   uapo_Usua )
        values
          ( p_port_Simu, i.uapo_Usua );
        --
        exception
          when others then
            raise_application_error(-20880, 'Error insertando en pi_tuapo: ' || sqlerrm);
      end;
      --
    end loop c_uapo;
    --
  end Ins_UAPO;
  --
  --
  --
  procedure elim_info (  p_port_simu           in    number  ) is
   --
   --  Proceso de Eliminacion de Portafolio
   --
   --
  begin
    --
    --  Eliminar Datos Relacionados
    --
    delete from pi_tnuac
    where  nuac_port = p_port_simu;
    --
    delete from pi_tnudr
    where  nudr_port = p_port_simu;
    --
    delete from pi_tnuma
    where  numa_port = p_port_simu;
    --
    delete from pi_tnuoi
    where  nuoi_port = p_port_simu;
    --
    delete from pi_tnuop
    where  nuop_port = p_port_simu;
    --
    delete from pi_tnurd
    where  nurd_port = p_port_simu;
    --
    delete from pi_tnurp
    where  nurp_port = p_port_simu;
    --
    delete from pi_tnuti
    where  nuti_port = p_port_simu;
    --
    delete from pi_tnuts
    where  nuts_port = p_port_simu;
    --
    delete from pi_tstoi
    where  stoi_port = p_port_simu;
    --
    delete from pi_topoi
    where  opoi_port = p_port_simu;
    --
    delete from pi_toprd
    where  oprd_port = p_port_simu;
    --
    delete from pi_topci
    where  opci_port = p_port_simu;
    --
    delete from pi_toper
    where  oper_port = p_port_simu;
    --
    delete from pi_torin
    where  orin_port = p_port_simu;
    --
    delete from pi_tstrd
    where  strd_port = p_port_simu;
    --
    delete from pi_tredn
    where  redn_port = p_port_simu;
    --
    delete from pi_tfluj
    where  fluj_port = p_port_simu;
    --
    delete from pi_tvalo
    where  valo_port = p_port_simu;
    --
    delete from pi_tclti
    where  clti_port = p_port_simu;
    --
    delete from pi_tstrp
    where  strp_port = p_port_simu;
    --
    delete from pi_ttitu
    where  titu_port = p_port_simu;
    --
    delete from pi_trepo
    where  repo_port = p_port_simu;
    --
    delete from pi_trtpr
     where rtpr_Port = p_port_Simu;
    --
    delete from pi_tuapo
     where uapo_Port = p_port_Simu;
    --
    delete from pi_tpaem
     where paem_Port = p_port_Simu;
    --
    delete from pi_tempo
     where empo_Port = p_port_Simu;
    --
    commit;
    --
  exception
     when others then
       raise_application_error(-20899, 'Error en PI_QSIMU = ' || sqlerrm);
  end elim_info;
  --
END PI_QSIMU; -- Package Body pi_qsimu
