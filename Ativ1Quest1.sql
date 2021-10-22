USE db_rh;

CREATE TABLE funcionarios_rh (
	id_funcionario INT AUTO_INCREMENT,
    nome VARCHAR (255),
	email VARCHAR(255),
    cargo VARCHAR(255),
    salario DOUBLE NULL,
    PRIMARY KEY(id_funcionario)
); 

INSERT INTO tb_funcionarios(nome,email,cargo,salario) VALUES
("Júlia","julia@gmail.com","Gerente",10000.00),
("João","Joao@gmail.com","Diretor Financeiro",7500.00),
("André","andre@gmail.com","Contador",5000.00),
("Maria","maria@gmail.com","Paisagista",1.800),
("Ana","ana@gmail.com","Arquiteta",7000)
;

SELECT * FROM tb_funcionarios WHERE salario>2000;

SELECT * FROM tb_funcionarios WHERE salario<2000;

USE db_rh;
UPDATE tb_funcionarios SET salario = 1200.00 WHERE id_funcionario= 2;