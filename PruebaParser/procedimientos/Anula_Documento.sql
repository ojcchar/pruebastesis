PROCEDURE Anula_Documento
            (p_docu        IN  NUMBER,
             p_fecha       IN  DATE,
             p_observacion IN  VARCHAR2,
             p_msg         OUT VARCHAR2) IS
v_cias             FA_TDOCU.docu_cias%TYPE;
v_tipomov          FA_TDOCU.docu_tpmv%TYPE;
v_auxidocu         FA_TDOCU.docu_auxi%TYPE;
v_etar             FA_TDOCU.docu_etde%TYPE;
v_area             FA_TDOCU.docu_depe%TYPE;
v_vlrneto          FA_TDOCU.docu_vlrneto%TYPE;
v_finanaut         FA_TTPMV.tpmv_finanaut%TYPE;
v_rqpf             FA_TRQPF.rqpf_rqpf%TYPE;
v_tpdo_cau         FA_TPFAC.pfac_tpdo_ppto_cau%TYPE;
v_nivel            GE_TCIAS.cias_nivel%TYPE;
v_tpco_gen         GE_TTPCO.tpco_tpco%TYPE;
v_tpco_esp         GE_TTPCO.tpco_tpco%TYPE;
v_tpco_anul        GE_TTPCO.tpco_tpco%TYPE;
v_tpco_gen_anul    GE_TTPCO.tpco_tpco%TYPE;
v_NroCom           SC_TCTCO.ctco_nrocom%TYPE;
v_NroComAnt        SC_TCTCO.ctco_nrocom%TYPE;
v_fecmov           SC_TCTCO.ctco_fecmov%TYPE;
v_fecmovant        SC_TCTCO.ctco_fecmov%TYPE;
v_fecMovG          SC_TCTCO.ctco_fecmovg%TYPE;
v_acta             PP_TDOCU.docu_acta%TYPE;
v_tpmv_anul        PP_TTPMV.tpmv_tpmv%TYPE;
v_fecha            DATE;
v_Feccom           DATE;
v_renglndcpc       INTEGER;
v_vigdocu          NUMBER;
v_mes              NUMBER;
v_rengln           INTEGER;
v_cont             INTEGER;
--v_nrodoc           number;
V_Nrodoc           PP_TDOCU.docu_nrodoc%TYPE;
v_natuop           VARCHAR2(1);
v_paso             VARCHAR2(255);
--
v_mvco_descri      SC_TMVCO.mvco_descri%TYPE;                                     -- Soli 2680

v_docu_nrodoc         FA_TDOCU.docu_nrodoc%TYPE;
v_ctamayo                 SC_TMVCO.mvco_mayo%TYPE;

v_descri         FA_TMOVI.movi_descri%TYPE;
v_cuenta_caracter INTEGER;
--
--
CURSOR c_movctb(p_cias NUMBER, p_tpco NUMBER, p_nrocom NUMBER, p_fecmov NUMBER) IS
     SELECT mvco_mayo, mvco_auxi, mvco_descri,                                                  -- 2410
         mvco_ceco, mvco_tporan, mvco_area, mvco_mayoad,                                     -- 2410
         mvco_etct, mvco_etco, mvco_etad, mvco_etar, mvco_rengln, SUM ( mvco_mtoren ) mvco_mtoren        -- 2410
  FROM   SC_TMVCO, FA_TDCPC                                                                  -- 2410
  WHERE  mvco_cias     = dcpc_cias                                                           -- 2410
  AND    mvco_tpco     = dcpc_tpco                                                           -- 2410
  AND    mvco_fecmov   = dcpc_fecmov                                                         -- 2410
  AND    mvco_nrocom   = dcpc_nrocom                                                         -- 2410
  AND    dcpc_docu     = p_docu                                                              -- 2410
  AND    dcpc_procgene IN ( 'F', 'R' )                                                       -- 2410
  AND    dcpc_tpco IS NOT NULL                                                               -- 2410
  AND    dcpc_nrocom IS NOT NULL                                                             -- 2410
  AND    dcpc_estado = 'A'                                                                   -- 2410
  GROUP BY mvco_etct, mvco_mayo, mvco_auxi, mvco_descri, mvco_etar, mvco_area,
           mvco_etco, mvco_ceco, mvco_etad, mvco_mayoad, mvco_tporan,mvco_rengln  ;                                                                                          -- 2410
  --
CURSOR c_movppto(p_cias NUMBER, p_vigdocu NUMBER, p_tpdo VARCHAR2, p_nrodoc VARCHAR2, p_acta NUMBER) IS
  SELECT movi_vigencia, movi_area, movi_impu, movi_tpmv, movi_mes,
         movi_valor, movi_feccre, movi_user, movi_recu
  FROM   PP_TMOVI
  WHERE  movi_cias = p_cias
  AND    movi_vigdocu = p_vigdocu
  AND    movi_tpdo = p_tpdo
  AND    movi_nrodoc = p_nrodoc
  AND    movi_acta = p_acta;

CURSOR c_docppto IS
  SELECT dcpc_cias, dcpc_vigdocu, dcpc_tpdo, dcpc_nrodoc, dcpc_acta
  FROM   FA_TDCPC p
  WHERE  dcpc_docu = p_docu
  AND    dcpc_procgene = 'F'
  AND    dcpc_tpdo IS NOT NULL
  AND    dcpc_nrodoc IS NOT NULL;
BEGIN
  v_fecmov:=TO_CHAR(p_fecha,'yyyymm');
  v_feccom:=p_fecha;
  v_paso:='Trae informacion del documento de facturacion';
  BEGIN
    SELECT docu_cias, docu_fecha, docu_auxi, docu_etde, docu_depe, docu_tpmv, docu_vlrneto, docu_nrodoc
    INTO   v_cias, v_fecha, v_auxidocu, v_etar, v_area, v_tipomov, v_vlrneto,v_docu_nrodoc
    FROM   FA_TDOCU
    WHERE  docu_docu = p_docu;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      p_msg:='El documento no existe';
      RETURN;
    WHEN OTHERS THEN
      p_msg:=SQLERRM;
      RETURN;
  END;
  v_paso:='Trae requerimiento de la empresa';
  BEGIN
    SELECT rqem_rqpf
    INTO   v_rqpf
    FROM   fa_vrqem
    WHERE  rqem_cias = v_cias;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      p_msg:='No existe el requerimiento';
      RETURN;
    WHEN OTHERS THEN
      p_msg:=SQLERRM;
      RETURN;
  END;
  v_paso:='Trae informacion del tipo de movimiento de facturacion';
  BEGIN
    SELECT tpmv_finanaut
    INTO   v_finanaut
    FROM   FA_TTPMV
    WHERE  tpmv_tpmv = v_tipomov;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      p_msg:='El tipo de movimiento no existe';
      RETURN;
    WHEN OTHERS THEN
      p_msg:=SQLERRM;
      RETURN;
  END;
  IF v_finanaut = 'S' THEN
    v_paso:='Trae informacion de los documentos financieros';
    BEGIN
      SELECT dcpc_cias, dcpc_tpco, dcpc_nrocom, dcpc_fecmov
      INTO   v_cias, v_tpco_gen, v_nrocomant, v_fecmovant
      FROM   FA_TDCPC p
      WHERE  dcpc_docu = p_docu
      AND    dcpc_procgene = 'F'
      AND    dcpc_tpco IS NOT NULL
      AND    dcpc_nrocom IS NOT NULL
      AND    dcpc_estado = 'A';
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        p_msg:='El documento no existe';
        RETURN;
      WHEN OTHERS THEN
        p_msg:=SQLERRM;
        RETURN;
    END;
    v_paso:='Trae informacion del comprobante';
    BEGIN
      SELECT ctco_nivel, ctco_tpcog
      INTO   v_nivel, v_tpco_esp
      FROM   SC_TCTCO
      WHERE  ctco_cias = v_cias
      AND    ctco_tpco = v_tpco_gen
      AND    ctco_nrocom = v_Nrocomant
      AND    ctco_fecmov = v_fecmovant;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        p_msg:='El encabezado del comprobante no existe';
        RETURN;
      WHEN OTHERS THEN
        p_msg:=SQLERRM;
        RETURN;
    END;
    v_paso:='Trael el comprobante de anulacion';
    BEGIN
      SELECT tpco_tpco_anul
      INTO   v_tpco_anul
      FROM   GE_TTPCO
      WHERE  tpco_tpco = v_tpco_esp;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        p_msg:='El tipo de comprobante especifico no existe';
        RETURN;
      WHEN OTHERS THEN
        p_msg:=SQLERRM;
        RETURN;
    END;
    --
    BEGIN
      --
      SELECT tpco_clase
        INTO v_tpco_gen_anul
        FROM GE_TTPCO
       WHERE tpco_tpco = v_tpco_anul;
      --
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        p_msg:='El tipo de comprobante anulacion no existe para el especifico '||v_tpco_anul;
        RETURN;
      WHEN OTHERS THEN
        p_msg:=SQLERRM;
        RETURN;
    END;
    --
    v_paso:='Genera el numero del comprobante';
    Numerar_Comp(v_cias, /*v_tpco_anul*/ v_tpco_gen_anul, v_fecmov, v_NroCom, v_FecMovG);
	v_paso:='Inserta el encabezado del comprobante';
    Fa_Qfinan.ins_enc_ctb(v_cias, /*v_tpco_anul */ v_tpco_gen_anul , v_NroCom, v_Feccom, v_fecmov, 'I', NULL, NULL, 'A',  -- Soli 2391
      SYSDATE, USER, SYSDATE, v_nivel, v_FecMovG, v_tpco_anul, v_NroCom, NULL, p_msg);
    IF p_msg IS NOT NULL THEN
      p_msg:=v_paso||' - '||p_msg;
      RETURN;
    END IF;
    v_paso:='Cursor Movimiento para el comprobante';
    --
    v_rengln:=0;                                                                                  -- 2410

    -- FOR r in c_movctb(v_cias,v_tpco_gen,v_nrocomant,v_fecmovant) LOOP                          --(1)
    FOR r IN c_movctb(v_cias,v_tpco_gen,v_nrocomant, v_fecmovant /*v_fecmov*/) LOOP               -- Soli 2391

    
        /* Valida vigencia del documento para asignar la cuenta contable que le corresponde.
	    Si la vigencia del documento es  anterior a la fecha en que se genera la anulacion se debe asignar la
		cuenta contable perteneciente a la columna pfac_mayo_anu_vigant de la tabla fa_tpfac, de lo contrario
		se asigna la cuenta contable traida de la consulta del cursor                                                                           --2720	*/
       	IF r.mvco_tporan = 'C' THEN
		v_descri:=r.mvco_descri;
		 FOR I IN 1..3 LOOP
     		  v_cuenta_caracter:= INSTR(v_descri,'-',1);
		     v_descri:= LTRIM( SUBSTR( v_descri,v_cuenta_caracter+1),'-');
		 END LOOP;
		 v_cuenta_caracter:= INSTR(v_descri,'-',1);
		 v_descri:=  SUBSTR( v_descri,1,v_cuenta_caracter-1);
		  v_descri:= LTRIM( v_descri,' ');
			IF TO_NUMBER(TO_CHAR(v_fecha,'yyyy')) < TO_NUMBER(TO_CHAR(p_fecha,'yyyy') )THEN
       		    BEGIN
        				SELECT pfac_mayo_anu_vigant INTO v_ctamayo
               			FROM FA_TPFAC, FA_TMOVI
               			WHERE        pfac_tpmv = v_tipomov
               			     AND           pfac_cpto IN (SELECT cpto_cpto FROM FA_TCPTO WHERE cpto_ctbfact='S')
                             AND           DECODE(pfac_natu,'D', pfac_mayo_contr,pfac_mayo_part)= r.mvco_mayo
							 AND           pfac_cpto=movi_cpto
                             AND           movi_docu=p_docu
                              AND         movi_vlrtot=ABS(r.mvco_mtoren)
							  AND         movi_clase IN('F','A','I' )
							  AND         movi_descri=SUBSTR(v_descri,1, LENGTH( movi_descri));
				EXCEPTION
                    WHEN NO_DATA_FOUND  THEN
					    BEGIN
                              SELECT pfac_mayo_part INTO v_ctamayo
                             FROM FA_TPFAC
                             WHERE  pfac_tpmv = v_tipomov
                             AND           pfac_natu =  r.mvco_tporan
                             AND             pfac_mayo_part=r.mvco_mayo
                             AND           pfac_cpto= (  SELECT movi_cpto FROM FA_TMOVI WHERE movi_docu=p_docu
                                                                         AND movi_mayo_part=r.mvco_mayo AND movi_vlrtot=ABS(r.mvco_mtoren) AND movi_clase<>'F' );
                         EXCEPTION
	                     WHEN NO_DATA_FOUND  THEN
     							p_msg:=' Cuenta contable vigencia anterior no se encontro para Cuenta:  '||r.mvco_mayo||'-'||SQLERRM;
                                 RETURN;
						END ;
				    WHEN TOO_MANY_ROWS THEN
					       p_msg:='Mas de un registro localizado  '||SQLERRM;
                             RETURN;
                 		---	v_ctamayo:=r.mvco_mayo;
					WHEN OTHERS THEN
	             			p_msg:='Error en la consulta de cuenta contable vigencia anterior  '||SQLERRM;
                             RETURN;
----							v_ctamayo:=r.mvco_mayo;
				END;

       	   ELSE
       			v_ctamayo:=r.mvco_mayo;
       	    END IF;
		ELSE
			  		v_ctamayo:=r.mvco_mayo;
       	END IF;

      v_rengln := v_rengln + 1;                                                                   -- 2410
      IF r.mvco_tporan='D' THEN
        v_natuop:='C';
      ELSE
        v_natuop:='D';
      END IF;
      v_paso:='Inserta el movimiento del comprobante - credito';

      Fa_Qfinan.ins_mov_ctb(v_cias, /*v_tpco_anul*/  v_tpco_gen_anul , v_NroCom, v_FecMov, r.mvco_rengln ,
       v_ctamayo, r.mvco_auxi, SUBSTR(' Anulacion '||' - '||r.mvco_descri,1,1000),  /*r.mvco_descri,*/ /*r.mvco_fecdoc*/  v_Feccom, r.mvco_mtoren /*0-r.mvco_mtoren*/,                  -- 2410        -- Soli 2680
        r.mvco_ceco, v_natuop, r.mvco_area, r.mvco_mayoad, r.mvco_etct,
        r.mvco_etco, r.mvco_etad, r.mvco_etar, p_msg);
      --
      IF p_msg IS NOT NULL THEN
        p_msg:=v_paso||' - '||p_msg;
        RETURN;
      END IF;
      --
    END LOOP;
    --
    --  Solicitud 2391
    v_paso:='Anulacion Tributarios';
    --
    --
    -- Inserta un Registro con signo Contrario en GE_TACRE
    --
    DECLARE                                                                                             -- Soli 2391
      CURSOR acre IS                                                                                    -- Soli 2391
        SELECT acre_Cias,         acre_Rengln,  acre_Auxi,    acre_TpRet,  acre_Rete,                   -- Soli 2391
               acre_Base,         acre_Iva,     acre_Valor,   acre_ValIC,  acre_ValST,                  -- Soli 2391
               acre_Cert,         acre_OrPa,    acre_VigOrPa, acre_TpLiq,  acre_Clase,                  -- Soli 2391
               acre_Rete_Orig,    acre_VrBruto, acre_Ciud,    acre_tipo_contrato, acre_fecha_contrato,  -- Soli 2391
               acre_num_contrato, acre_porc_cobrado, acre_mayo                                          -- Soli 2391
        FROM  GE_TACRE                                                                                  -- Soli 2391
        WHERE acre_cias   = v_cias                                                                      -- Soli 2391
        AND   acre_tpco   = v_tpco_gen                                                                  -- Soli 2391
        AND   acre_nrocom = v_nrocomant                                                                 -- Soli 2391
        AND   acre_fecmov = v_fecmovant;                                                                -- Soli 2391
    BEGIN                                                                                               -- Soli 2391
      FOR I IN Acre LOOP                                                                                --  Solicitud 2391
        INSERT INTO GE_TACRE                                                                            --  Solicitud 2391
         (acre_Cias,         acre_TpCo,      acre_nroCom,       acre_Rengln,                            --  Solicitud 2391
          acre_FecMov,       acre_Auxi,      acre_TpRet,        acre_Rete,                              --  Solicitud 2391
          acre_Base,         acre_Iva,       acre_Valor,        acre_ValIC,                             --  Solicitud 2391
          acre_ValST,        acre_Cert,      acre_OrPa,         acre_VigOrPa,                           --  Solicitud 2391
          acre_TpLiq,        acre_Clase,     acre_Rete_Orig,    acre_FecCom, acre_mayo,                 --  Solicitud 2391
	      acre_FecCre,	     acre_VrBruto,   acre_Ciud,                                           --  Solicitud 2391
	      acre_tipo_contrato, acre_fecha_contrato, acre_num_contrato,                               --  Solicitud 2391
	     acre_porc_cobrado )                                                                       --  Solicitud 2391
        VALUES                                                                                          --  Solicitud 2391
         ( I.acre_Cias,     v_tpco_gen_anul, v_NroCom,  I.acre_Rengln,                          --  Solicitud 2391
           v_fecmov,  I.acre_Auxi,    I.acre_TpRet,      I.acre_Rete,                                   --  Solicitud 2391
           -I.acre_Base,      -I.acre_Iva,    -I.acre_Valor,     -I.acre_ValIC,                         --  Solicitud 2391
           -I.acre_ValST,     I.acre_Cert,    I.acre_OrPa,       I.acre_VigOrPa,                        --  Solicitud 2391
           I.acre_TpLiq,      I.acre_Clase,   I.acre_Rete_Orig,  v_Feccom, I.acre_mayo,                 --  Solicitud 2391
           TO_CHAR(SYSDATE),  I.acre_VrBruto, I.acre_Ciud,                                              --  Solicitud 2391
	   I.acre_tipo_contrato, I.acre_fecha_contrato, I.acre_num_contrato,                              --  Solicitud 2391
	   I.acre_porc_cobrado );                                                                         --  Solicitud 2391
      END LOOP;
    END;
    --
    v_paso:='Inserta la anulacion';
    --
    BEGIN

       INSERT INTO SC_TANUL (anul_cias, anul_tpco, anul_nrocom, anul_fecmov,                           -- 2391
        anul_tpco_anul, anul_nrocom_anul, anul_fecmov_anul, anul_observ,                              -- 2391
        anul_fecha_anul, anul_feccre, anul_usuario)                                                   -- 2391
      VALUES (v_cias, v_tpco_gen, v_nrocomant, v_fecmovant,                                           -- 2391
        v_tpco_gen_anul /*v_tpco_anul*/, v_NroCom, v_fecmov, SUBSTR('Fact : '||v_docu_nrodoc||' - '||'Fecha : '||TO_CHAR(p_fecha,'dd/mm/rrrr')||' - '||'Proceso de Anulacion '||p_observacion,1,500),                                               -- 2391
        SYSDATE, SYSDATE, USER);                                                                      -- 2391
      --  Solicitud 2391
    EXCEPTION
      WHEN OTHERS THEN
        p_msg:=SQLERRM;
        RETURN;
    END;
    BEGIN
      SELECT NVL(MAX(dcpc_rengln),0)
      INTO   v_renglndcpc
      FROM   FA_TDCPC
      WHERE  dcpc_docu = p_docu;
    END;
    v_paso:='Inserta la relacion con los documentos financieros';
    BEGIN
      INSERT INTO FA_TDCPC (dcpc_docu, dcpc_rengln, dcpc_cias, dcpc_tpco,
        dcpc_nrocom, dcpc_fecmov, dcpc_vigdocu, dcpc_tpdo,
        dcpc_nrodoc, dcpc_acta, dcpc_procgene, dcpc_observ, dcpc_estado,
        dcpc_user, dcpc_feccre, dcpc_usermod, dcpc_fecmod)
      --values (p_docu, v_renglndcpc+1, v_cias, v_tpco_gen,
      VALUES (p_docu, v_renglndcpc+1, v_cias, /*v_tpco_anul */ v_tpco_gen_anul,                             -- Soli 2391
        v_NroCom, v_fecmov, NULL, NULL,
        NULL, NULL, 'A',SUBSTR('Fact : '||v_docu_nrodoc||' - '||'Fecha : '||TO_CHAR(p_fecha,'dd/mm/rrrr')||' - '||'Proceso de Anulacion '||p_observacion,1,255), 'X',
        USER, SYSDATE, NULL, NULL);
    EXCEPTION
      WHEN OTHERS THEN
        p_msg:=SQLERRM;
        RETURN;
    END;
    v_paso:='Trae el documento de presupuesto';
    v_mes:=TO_CHAR(p_fecha,'mm');
    FOR D IN c_docppto LOOP
      v_paso:='Actualiza el documento de presupuesto';
      BEGIN
        UPDATE PP_TDOCU
        SET    docu_anulado = 'S'
        WHERE  docu_cias = D.dcpc_cias
        AND    docu_vigdocu = D.dcpc_vigdocu
        AND    docu_tpdo = D.dcpc_tpdo
        AND    docu_nrodoc = D.dcpc_nrodoc
        AND    docu_acta = D.dcpc_acta;
      EXCEPTION
        WHEN OTHERS THEN
          p_msg:=SQLERRM;
          RETURN;
      END;
      v_rengln:=0;
      BEGIN
        SELECT NVL(MAX(movi_rengln),0)
        INTO   v_rengln
        FROM   PP_TMOVI
        WHERE  movi_cias = D.dcpc_cias
        AND    movi_vigdocu = D.dcpc_vigdocu
        AND    movi_tpdo = D.dcpc_tpdo
        AND    movi_nrodoc = D.dcpc_nrodoc
        AND    movi_acta = D.dcpc_acta;
      END;
      v_paso:='Inserta el movimiento de presupuesto';
      FOR r IN c_movppto(D.dcpc_cias, D.dcpc_vigdocu, D.dcpc_tpdo, D.dcpc_nrodoc, D.dcpc_acta) LOOP
        v_rengln := v_rengln + 1;
        v_paso := 'Determina el tipo de movimiento de anulacion';
        BEGIN
          SELECT tpmv_tpmv_anul
          INTO   v_tpmv_anul
          FROM   PP_TTPMV
          WHERE  tpmv_tpmv = r.movi_tpmv;
        END;
        -- Crea Movimiento de Presupuesto
        BEGIN
          INSERT INTO PP_TMOVI (movi_cias, movi_vigdocu, movi_tpdo, movi_nrodoc,
            movi_acta, movi_rengln, movi_vigencia, movi_area,
            movi_impu, movi_tpmv, movi_mes, movi_valor,
            movi_feccre, movi_user, movi_recu)
          VALUES (D.dcpc_cias, D.dcpc_vigdocu, D.dcpc_tpdo, D.dcpc_nrodoc,
            D.dcpc_acta, v_rengln, D.dcpc_vigdocu, r.movi_area,
            r.movi_impu, v_tpmv_anul, v_mes, r.movi_valor,
            SYSDATE, USER, r.movi_recu);
        EXCEPTION
          WHEN OTHERS THEN
            p_msg:=SQLERRM;
            RETURN;
        END;
      END LOOP;
      BEGIN
        SELECT NVL(MAX(dcpc_rengln),0)
        INTO   v_renglndcpc
        FROM   FA_TDCPC
        WHERE  dcpc_docu = p_docu;
      END;
      v_paso:='Inserta la relacion con los documentos financieros';
      BEGIN
        INSERT INTO FA_TDCPC (dcpc_docu, dcpc_rengln, dcpc_cias, dcpc_tpco,
          dcpc_nrocom, dcpc_fecmov, dcpc_vigdocu, dcpc_tpdo,
          dcpc_nrodoc, dcpc_acta, dcpc_procgene, dcpc_observ, dcpc_estado,
          dcpc_user, dcpc_feccre, dcpc_usermod, dcpc_fecmod)
        VALUES (p_docu, v_renglndcpc+1, D.dcpc_cias, NULL,
          NULL, NULL, D.dcpc_vigdocu, D.dcpc_tpdo,
          D.dcpc_nrodoc, D.dcpc_acta, 'A', SUBSTR('Fact : '||v_docu_nrodoc||' - '||'Fecha : '||TO_CHAR(p_fecha,'dd/mm/rrrr')||' - '||'Proceso de Anulacion '||p_observacion,1,255), 'X',
          USER, SYSDATE, NULL, NULL);
      EXCEPTION
        WHEN OTHERS THEN
          p_msg:=SQLERRM;
          RETURN;
      END;
	END LOOP;
  END IF;
EXCEPTION
  WHEN OTHERS THEN
    p_msg:='FA_QFINAN.DES_CTBPPTO_MOV - '||v_paso||' - '||SQLERRM;
    RETURN;
END;
