CREATE DATABASE firstdb;
use firstdb;

Create table students (
roll_num int,
student_name varchar(50),
course_id int,
PRIMARY KEY (roll_num)
);

insert into students values (1,'Monu', 21);
insert into students values (2,'Sonu', 22);
insert into students values (3,'Name3', 23);
insert into students values (4,'Monu', 23);
insert into students values (5,'Monu', 25);


select * from students 
where roll_num = 2;


select * from students 
where student_name = 'Monu'
and (course_id = 25
OR course_id = 23);


delete from students
where roll_num = 5;


update students
set course_id = 24, student_name = 'MonuNew'
where roll_num = 4


