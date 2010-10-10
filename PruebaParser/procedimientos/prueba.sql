procedure updatecourse
   ( name_in in varchar2 )
is
    cnumber number;

    cursor c1 is
    select course_number
      from courses_tbl
      where course_name = name_in;

begin
hola(hola,mane);
	
open c1;
fetch c1 into cnumber;

if c1%notfound then
     cnumber := 9999;
end if;

insert into student_courses
( course_name,
  course_number)
values ( name_in,
                cnumber );

commit;

close c1;

exception
when others then
      raise_application_error(-20001,'an error was encountered - '||sqlcode||' -error- '||sqlerrm);
end;