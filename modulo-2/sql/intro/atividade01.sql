# ATIVIDADE 01

# Ex. 01 - CRIA BANCO DE DADOS
CREATE DATABASE db_servico_rh;

# USA O BANCO DE DADOS
USE db_servico_rh;

# Ex. 02 - CRIA TABELA DE FUNCIONÁRIO COM 05 ATRIBUTOS
CREATE TABLE tb_funcionarios (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade INT NOT NULL,
    genero VARCHAR(255),
    departamento VARCHAR(255) NOT NULL,
    salario DOUBLE NOT NULL,
    PRIMARY KEY (id)
);

# Ex. 03 - INSIRA 05 DADOS NESTA TABELA
INSERT INTO tb_funcionarios (nome, idade, genero, departamento, salario) VALUES
("Joana", 34, "mulher cis", "contabilidade", 3210.21);
INSERT INTO tb_funcionarios (nome, idade, genero, departamento, salario) VALUES
("Carlos", 24, "homem trans", "desenvolvimento mobile", 2570.22);
INSERT INTO tb_funcionarios (nome, idade, genero, departamento, salario) VALUES
("Pedro", 54, "nao-binario", "recursos humanos", 3210.12);
INSERT INTO tb_funcionarios (nome, idade, genero, departamento, salario) VALUES
("Luiza", 42, "mulher cis", "administracao", 7120.00);
INSERT INTO tb_funcionarios (nome, idade, genero, departamento, salario) VALUES
("Fernanda", 37, "mulher cis", "marketing", 12000);

# Ex. 04 - TODES COLABORADORES COM SALÁRIO > 3000
SELECT * FROM tb_funcionarios f WHERE f.salario > 3000;

# Ex. 05 - TODES COLABORES COM SALÁRIO MENOR QUE 4500
SELECT * FROM tb_funcionarios f WHERE f.salario < 4500;

# Ex. 06 - ATUALIZAR ALGUM REGISTRO DA TABELA
UPDATE tb_funcionarios f SET f.nome = "Marina" WHERE f.id =1;

# Ex. 07 - SALVAR E SUBIR NO GITHUB
