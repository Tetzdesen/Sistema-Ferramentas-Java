create database ferramentas;

use ferramentas;

create table Ferramentas(
        codigo int not null primary key,
        nome varchar(50) not null,
        preco decimal(7,3) not null,
        data_cadastro date not null,
        estoque int not null
        );
select * from Ferramentas;

