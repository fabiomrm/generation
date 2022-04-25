# ATIVIDADE 02

# Ex. 01 - CRIA BANCO DE DADOS
CREATE DATABASE db_ecommerce;

# USA O BANCO DE DADOS
USE db_ecommerce;

# Ex. 02 - CRIA TABELA DE FUNCIONÁRIO COM 05 ATRIBUTOS
CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DOUBLE NOT NULL,
    categoria VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    fornecedor VARCHAR(255),
    PRIMARY KEY (id)
);

# Ex. 03 - INSIRA 05 DADOS NESTA TABELA
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Caneta", 1.20, "escritorio", "caneta azul", "Atacado dos Presentes");
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Bolsa", 77.90, "escolar", "bolsa escolar", "Atacado 10");
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Caderno", 35.42, "escolar", "caderno banda BTS", "Lojas Americanas");
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Ensaio sobre a cegueira", 55.99, "livro", "livro josé saramago", "Amazon");
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Trilogia Fundacao", 200.22, "livro", "trilogia livro isaac asimov", "Submarino");
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Teclado Casio CTK 3500", 1200, "musica", "teclado casio cor rosa", "Alibaba");
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Xbox One", 3500, "jogos", "xbox one novo com 2 jogos", "Microsoft");
INSERT INTO tb_produtos (nome, preco, categoria, descricao, fornecedor) VALUES
("Teclado mecânico", 1200, "eletronicos", "teclado mecânico alloy", "Alloy");

# Ex. 04 - TODOS PRODUTOS COM VALOR MAIOR 500
SELECT * FROM tb_produtos p WHERE p.preco > 500;

# Ex. 05 - TODES COLABORES COM SALÁRIO MENOR QUE 500
SELECT * FROM tb_produtos p WHERE p.preco < 500;

# Ex. 06 - ATUALIZAR ALGUM REGISTRO DA TABELA
UPDATE tb_produtos p SET p.preco = "2000" WHERE p.id =7;

# Ex. 07 - SALVAR E SUBIR NO GITHUB
