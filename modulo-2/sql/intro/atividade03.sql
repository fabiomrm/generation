# ATIVIDADE 03

# Ex. 01 - CRIA BANCO DE DADOS
CREATE DATABASE db_escola;

# USA O BANCO DE DADOS
USE db_escola;

# Ex. 02 - CRIA TABELA DE ESTUDANTES COM 05 ATRIBUTOS
CREATE TABLE tb_estudantes (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade BIGINT NOT NULL,
    matricula VARCHAR(255) NOT NULL,
    nota DOUBLE,
    curso VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

# Ex. 03 - INSIRA 08 DADOS NESTA TABELA
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Joana", 23, "112321123", 8.45, "letras");
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Paula", 33, "999888666", 7.25, "matemática");
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Pedro", 54, "123321456", 9.00, "sociologia");
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Karla", 19, "1312344224", 6.65, "química");
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Luana", 18, "2389138291", 6.65, "química");
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Leonardo", 32, "932748923", 7.25, "física");
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Débora", 27, "1111111111", 2.23, "biologia");
INSERT INTO tb_estudantes (nome, idade, matricula, nota, curso) VALUES
("Pietra", 44, "2121212121", 8.82, "geografia");

SELECT * FROM tb_estudantes;
# Ex. 04 - TODES ESTUDANTES COM NOTA MAIOR QUE 7
SELECT * FROM tb_estudantes e WHERE e.nota > 7;

# Ex. 05 - TODES ESTUDANTES COM NOTA MENOR QUE 7
SELECT * FROM tb_estudantes e WHERE e.nota < 7;

# Ex. 06 - ATUALIZAR ALGUM REGISTRO DA TABELA
UPDATE tb_estudantes e SET e.nota = 8.2 WHERE e.id =4;

SELECT * FROM tb_estudantes
# Ex. 07 - SALVAR E SUBIR NO GITHUB
