create database project ;
use project ;
create table employess(sno int auto_increment not null primary key , sname varchar (200), age int, desingnaton varchar(200));
insert into employess (sname , age ,desingnaton )value('kam',2,'ja');
select*from employess;
select age from employess ;
drop table employess ;
create table employess (sno int auto_increment not null primary key ,sname varchar(200),age int , designaton varchar (250),salary int );
insert into employess (sname , age , designaton , salary ) values ('kamalesh',28,'java ',50000);

select*from employess;
select*from employess where salary>25000;
select sname from employess where salary<20000;
select sname , salary from employess where designaton = 'software developer ';
select sname , designaton , salary from employee where age = 21 ;

update employess set salary = 19000 where designaton = 'backend support';
delete from employee where age = 19 ;
SET SQL_SAFE_UPDATES = 0;

select*from  employee;
select max(salary)as newdata from employee ;
select count(salary)from employee ;
select cound(sname) from employee where age=21 ;



