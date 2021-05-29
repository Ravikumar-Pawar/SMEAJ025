create database userDetailsDB;

use userDetailsDB;

create table user_Details(
username varchar(30) primary key,	
firstname varchar(30) not null,
lastname varchar(30) not null,
acctype varchar(15) not null,
phno varchar(10) not null,
city varchar(20) not null,
dob date not null,
password varchar(30) not null,
accno int auto_increment,
key(accno)
);

alter table user_Details auto_increment = 10000000;

insert into user_Details(username,firstname,lastname,acctype,phno,city,dob,password) values('Dia','Dia','S','Savings','9876543210','Chennai','2000-07-11','password');

select * from user_Details;
