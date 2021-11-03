create database db_pizzaria_legal ; 
use db_pizzaria_legal ;

create table tb_categoria (
id_categoria int auto_increment,
tamanho enum ('Pequena', 'Média', 'Grande'),
tipo_massa enum ('Tradicional', 'Especial'),
primary key (id_categoria)
);

create table tb_pizza (
id_pizza int auto_increment,
sabor varchar (255) not null,
borda enum ('Catupiry', 'Cheddar', 'Sem borda'),
recheio boolean not null, 
valor double not null,
fk_id_categoria int, 
primary key (id_pizza), 
foreign key (fk_id_categoria) references tb_categoria (id_categoria)
); 

insert into tb_categoria (tamanho, tipo_massa) values 
("Grande", "Especial"),
("Média", "Tradicional"), 
("Pequena", "Especial"),
("Média", "Especial"), 
("Grande", "Tradicional") ;

select * from tb_categoria ;

insert into tb_pizza (sabor, borda, recheio, valor) values
("Calabresa", "Cheddar", 1, 35.00), 
("Mussarela", "Cheddar", 0, 27.90),
("Marguerita", "Catupiry", 1, 46.90),
("Portuguesa", "Catupiry", 0, 31.00), 
("Cartola", "Sem borda", 0, 47.00),
("Romeu e Julieta", "Sem borda", 1, 50.00) ;

select * from tb_pizza where valor > 45.00 ; 

select * from tb_pizza where valor > 29.00 and valor < 60.00 ; 

select * from tb_pizza where sabor like 'c%' ; 

select * from tb_categoria inner join tb_pizza on tb_pizza.fk_id_pizza = tb_categoria.id_categoria ; 

postagemselect * from tb_categoria inner join tb_pizza on tb_pizza.fk_id_pizza = tb_categoria.id_categoria where id_categoria = 1 ;