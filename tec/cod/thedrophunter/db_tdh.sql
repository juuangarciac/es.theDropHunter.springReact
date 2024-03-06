CREATE DATABASE IF NOT EXISTS db_tdh_project;
USE db_tdh_project;

CREATE TABLE IF NOT EXISTS user (
	id int not null primary key auto_increment,
	name varchar(50) not null,
    lastname varchar(100)  not null,
    birthday date not null,
	email varchar(100) not null,
	password varchar(255) not null
);

CREATE TABLE IF NOT EXISTS enterprise (
	id int not null primary key auto_increment, 
    name varchar(100) not null,
    email varchar(100) not null,
    password varchar (255) not null
    
);

CREATE TABLE IF NOT EXISTS product (
	id int not null primary key auto_increment,
    name varchar(255) not null,
    price int not null,
    description varchar(500) not null,
	photo varchar(255),
    id_enterprise int not null,
	foreign key (id_enterprise) references enterprise(id)
);