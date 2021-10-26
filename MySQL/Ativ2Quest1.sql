
CREATE DATABASE db_generation_game_online ;
USE db_generation_game_online ;

CREATE TABLE tb_classe (
	id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    codigo VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_personagem (
	id_personagem INT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL, 
    poder_defesa INT,
    poder_ataque INT,
    velocidade INT,
    fk_id INT,
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (fk_id) REFERENCES tb_classe (id)
);

INSERT INTO tb_classe (nome, codigo) VALUES 
	("Caçador", "C1"),
    ("Cavaleiro", "C2"),
    ("Mestre", "C3"),
    ("Assassino", "C4"),
    ("Feiticeiro", "C5") ;

SELECT * FROM tb_classe ;    

INSERT INTO tb_personagem (nome, poder_defesa, poder_ataque, velocidade, fk_id) VALUES
	("Tommy", 5599, 9000, 8, 3),
    ("John", 1400, 1860, 9, 2),
    ("Arthur", 6500, 7000, 7, 4),
    ("Mike", 7500, 8600, 6, 1),
    ("Chase", 1200, 1300, 4, 5) ; 
    
SELECT * FROM tb_personagem WHERE poder_ataque > 2000 ;

SELECT * FROM tb_personagem WHERE poder_defesa > 1000 AND poder_defesa < 2000 ;

SELECT * FROM tb_personagem WHERE nome LIKE 'c%' ; 
    
SELECT * FROM tb_classe INNER JOIN tb_personagem ON tb_personagem.fk_id = tb_classe.id WHERE id =  2 ; 
    



