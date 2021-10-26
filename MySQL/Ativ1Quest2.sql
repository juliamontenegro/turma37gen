CREATE DATABASE db_ecommerce ;

USE db_ecommerce ;

CREATE TABLE db_produtos (
	id INT  PRIMARY KEY AUTO_INCREMENT NOT NULL ,
	nome VARCHAR (255) NOT NULL,
	codidoProduto VARCHAR (255),
	validade DATE NOT NULL,
	preco DOUBLE NOT NULL
);

INSERT INTO tb_produtos (nome, codigo, validade, preco) 
VALUES ( "Macarrão", "123" , '2022'-01-01, 300),
( "Feijão" , "456" , '2022-01-02', 700),
( "Arroz" , "789" , '2022-01-03' , 400 ),
( "Cuscuz" , "1010" , '2022-01-04' , 800 ) ;

SELECT  *  FROM tb_produto
WHERE preco <  500 ;

SELECT  *  FROM tb_produto
 WHERE preco >  500 ;
 
 USE db_ecommerce ;
UPDATE tb_produtos SET validade = '2022-01-11' WHERE id_produtos = 2 ;
 
 



