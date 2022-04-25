CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT,
    tipo VARCHAR(255) NOT NULL,
    descricao VARCHAR(1000) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    marca VARCHAR(255) NOT NULL,
    preco DOUBLE NOT NULL,
    id_categoria BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (tipo, descricao) VALUES ('analgésico', 'alívio de dor');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('antibiótico', 'lida com bactérias');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('anti-inflamatório', 'lida com inflamações');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('cosmético', 'lida com problemas dermatológicos');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('outros', 'não se encaixa nas outras categorias');

INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('aspirina', 'bayer', 30, 1);
INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('dipirona', 'EMS Corpo', 22, 1);
INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('ibuprofeno', 'Eurofarma', 52, 1);
INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('amoxicilina', 'Bayer', 32, 2);
INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('cloxacilina', 'Eurofarma', 12, 2);
INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('flancox', 'EMS Corpo', 12.33, 3);
INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('prednisona', 'Eurofarma', 21, 3);
INSERT INTO tb_produtos (nome, marca, preco, id_categoria) VALUES ('chocolate', 'cacau show', 32, 5);

SELECT * FROM tb_produtos WHERE preco > 30;
SELECT * FROM tb_produtos WHERE preco BETWEEN 30 AND 33;
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.id_categoria = tb_categorias.id;

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.id_categoria = tb_categorias.id
WHERE tb_categorias.tipo = 'analgésico';
