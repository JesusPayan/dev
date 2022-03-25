use restaurantdb;

/*create table product(product_id int auto_increment primary key not null, product_name varchar(45),product_description varchar(200), product_cost decimal not null, unit_price decimal not null, product_category_id int not null, supplier_id int not null) */

create table products(product_id int auto_increment primary key not null,
product_name varchar(45),
product_description varchar(200),
product_cost decimal not null,
unit_price decimal not null, 
product_category_id int not null
);

create table orders(
order_id int auto_increment primary key not null, 
order_description varchar(300), 
order_cost decimal,
order_type varchar(30)
);
create table order_details(
orders_id int auto_increment primary key not null,
order_id int not  null,
product_id int not null,
order_type varchar(30),
order_detail varchar(300),
order_discount decimal,
order_date date,
order_status varchar(30)
);
create table customers(
customer_id int auto_increment primary key not null,
customer_name varchar (45),
customer_adress varchar (45),
customer_phone varchar (45)
);
create table delivers(
shipper_id int auto_increment primary key not null,
shipper_name varchar (45),
product_id int not null
);
