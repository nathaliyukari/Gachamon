drop database if exists gachamon;
create database gachamon;
use gachamon;

create table cliente(
id int primary key auto_increment,
nome varchar(60) not null,
email varchar(60) not null,
senha varchar(60) not null,
saldo int not null
);

select * from cliente where email = "eike@gmail.com";

	