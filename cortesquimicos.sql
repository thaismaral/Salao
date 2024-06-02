create database salaocortesquimicos;
use salaocortesquimicos;
create table salaocortesquimicos(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);
describe salaocortesquimicos;

insert into salaocortesquimicos(iduser,usuario,fone,login,senha)
values(3,'Jéssica Monteiro','9990-1311','jessmonteiro','123456');

select * from salaocortesquimicos;

insert into salaocortesquimicos(iduser,usuario,fone,login,senha)
values(9,'Thais Amaral','1234-8888','thaisam','1234');

select * from salaocortesquimicos;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(50),
fonecli varchar(50) not null,
emailcli varchar(50)
);

describe tbclientes;

insert into tbclientes(idcli,nomecli,endcli,fonecli,emailcli)
values(11,'Marina','Rua da Gloria,205','9999-9999','M@gmail.com');

select * from tbclientes;

create table serviços(
serviço int primary key auto_increment,
data_serviços timestamp default current_timestamp,
cabelo varchar (100), 
unhas varchar(100),
pele varchar(100),
profissional varchar(50),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

describe servicos;

insert into serviços(cabelo,unhas,pele,profissional,valor,idcli)
values('Corte','Esmalte','limpeza de pele','Rubia',12.50,11);

select * from serviços;

select
O.serviço,cabelo,unhas,pele,profissional,valor,
C.nomecli,fonecli
from serviços as O
inner join tbclientes  as C
on (O.idcli = C.idcli);

 
