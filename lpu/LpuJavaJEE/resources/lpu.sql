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
where roll_num = 4 ;

select * from employees e
where e.department_id is null

select * from departments;

select count(*) from employees;

select * from employees e JOIN departments d ON  e.department_id = d.department_id
where d.department_name = 'IT'
and e.manager_id = d.manager_id
and e.first_name = 'Bruce' ;

-- select all employees adn there deparment names.
select e.employee_id, e.first_name, d.department_name,e.department_id, d.department_id 
from employees e  LEFT JOIN departments d ON  e.department_id = d.department_id 
UNION
select e.employee_id, e.first_name, d.department_name,e.department_id, d.department_id 
from employees e  RIGHT JOIN departments d ON  e.department_id = d.department_id 

select e.employee_id, e.first_name, d.department_name from employees e 
LEFT JOIN departments d ON  e.department_id = d.department_id ;

select e.employee_id, e.first_name, d.department_name from employees e RIGHT JOIN departments d ON  e.department_id = d.department_id ;


select e.employee_id, e.department_id, d.department_id from employees e RIGHT JOIN departments d ON  e.department_id = d.department_id
and e.employee_id is null;

-- select first_name and department name of employees who joined after 2017.
-- select all the employees of department Marketing
-- select all the deparments where there are no employees
-- select all the employees which have no department.
-- select department name when department id in, 
  -- between, and then department name like
  
 -- 27 Jan - find max salary of employees in each department .
  
  select department_name  from departments d
  where d.department_name like 'ad%';
  
  select department_name,d.department_id  from departments d
  where d.department_id in (10,40,80);

select department_name,d.department_id  from departments d
  where d.department_id between 40 and 80;
  
  
select e.employee_id, e.employee_id, d.department_id, d.department_name from employees e Left JOIN departments d
ON e.department_id = d.department_id

group by department_id,d.department_name
having count(e.employee_id) < 10 
and max(e.employee_id) < 200

order by d.department_id, d.department_name

  

