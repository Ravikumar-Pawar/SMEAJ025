create database smejdbc;

use smejdbc;

create table user_details(
username varchar(30) primary key,
firstname varchar(30) not null,
lastname varchar(30) not null,
acc_type varchar(15) not null,
ph_no varchar(10) not null,
city varchar(20) not null,
dob date not null,
pass_word varchar(30) not null,
acc_no int auto_increment,
key(acc_no)
);

alter table user_details auto_increment = 10000000;

insert into user_details(username,firstname,lastname,acc_type,ph_no,city,dob,pass_word) values('Antony','Antony','R','Savings','0987654321','Chennai','2000-07-06','dummy');

select * from user_details;