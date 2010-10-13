select object_name, object_type
     from user_objects
    where object_type in ( 'PROCEDURE', 'FUNCTION','PACKAGE', 'PACKAGE BODY' );
    
    select *
     from user_objects
    where object_type in ( 'PROCEDURE' )
    AND UPPER(OBJECT_NAME)=UPPER('PI_QSIMU');
    
    
    SELECT * FROM all_source WHERE upper(name)=upper('PI_QSIMU') ORDER BY line;
    
    
    SELECT text FROM all_source WHERE upper(name)=upper('PI_QSIMU') 
    AND TYPE in ( 'PROCEDURE' , 'FUNCTION','PACKAGE BODY')
    ORDER BY line;
    
      SELECT text FROM all_source WHERE 
   TYPE='PROCEDURE'
      AND 
      NAME='PI_QSIMU'
      
    ORDER BY line;
    
    select * from all_procedures
    where owner = 'VU_SFI'
    AND upper(OBJECT_NAME) =upper('in_pestado_act_ant_sig');
    
      select * from all_procedures
    where owner = 'VU_SFI'
    and procedure_name is null;
    
    SELECT * FROM user_objects
    WHERE UPPER(OBJECT_NAME) = UPPER('AD_FSOLI_CLIE_clie')