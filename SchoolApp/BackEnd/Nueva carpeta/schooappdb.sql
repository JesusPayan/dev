create database schoolardb;
use schoolardb;

create table app_user(
user_id int primary key not null auto_increment, 
user_code varchar(8) unique not null,
user_name varchar(45) not null, 
last_name varchar(45)not null,
user_role varchar(30) not null, 
user_password varchar(10)not null,
created_date datetime not null,
updated_date datetime 
);
#drop table user;
select * from app_user;
