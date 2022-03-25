select * from app_user;
insert into app_user(user_code,user_name,last_name,user_role,user_password, created_date,updated_date)
			values('JPa','Je','Hdez','User','123456',now(),now());
drop table app_user;