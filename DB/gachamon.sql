drop database if exists gachamon;
create database gachamon;
use gachamon;

create table cliente(
id int primary key auto_increment,
nome varchar(60) not null,
email varchar(60) not null,
senha varchar(60) not null,
premios varchar(60) not null
);

insert into cliente(nome, email, senha)
values("teste1","teste1","teste1"),("teste2","teste2","teste2"),("teste3","teste3","teste3") 

	