CREATE DATABASE db_construindo_vidas;

USE db_construindo_vidas;

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT,
    tipo VARCHAR(255) NOT NULL,
    descricao VARCHAR(1000) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    fornecedor VARCHAR(255) NOT NULL,
    preco DOUBLE NOT NULL,
    id_categoria BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (tipo, descricao) VALUES ('hidráulica', 'encanamentos hidráulicos');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('elétrica', 'fiação elétrica');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('alvenaria', 'materiais de alvenaria tradicional');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('dry wall', 'gesso acartonado');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('aço', 'ferragens para obra');

INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('joelho 25"', 'tupan', 1, 1);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('joelho 1"', 'tupan', 1.25, 1);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('T 1.1/4"', 'amarzém coral', 5.12, 1);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('eletroduto 1"', 'tupan', 1, 2);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('aco 3/4"', 'leroy merlin', 25, 5);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('aco 10mm', 'leroy merlin', 150, 5);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('tijolo refratário', 'casa do abrasivo', 56, 3);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('placa drywall', 'casa do gesso', 36, 4);



SELECT * FROM tb_produtos WHERE preco > 70;
SELECT * FROM tb_produtos WHERE preco BETWEEN 70 AND 150;
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.id_categoria = tb_categorias.id;

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.id_categoria = tb_categorias.id
WHERE tb_categorias.tipo = 'elétrica';
