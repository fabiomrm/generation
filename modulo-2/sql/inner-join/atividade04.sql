CREATE DATABASE db_cidade_dos_vegetais;

USE db_cidade_dos_vegetais;

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

INSERT INTO tb_categorias (tipo, descricao) VALUES ('legume', 'legumes frescos');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('fruta', 'frutas frescas');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('tubérculo', 'tubérculos/caules');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('raiz', 'raízes/bolbos');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('outros', 'não se encaixa nas outras categorias');

INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('maçã', 'loja do campo', 10, 2);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('goiaba', 'loja do campo', 5, 2);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('manga', 'armazém das produtoras', 12, 2);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('batata-doce', 'armazém das produtoras', 15, 4);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('macaxeira', 'produção da ocupação', 12, 4);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('chuchu', 'produção da ocupação', 20, 1);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('quiabo', 'abcd', 23, 1);
INSERT INTO tb_produtos (nome, fornecedor, preco, id_categoria) VALUES ('inhame', 'abcd', 16, 3);

SELECT * FROM tb_produtos WHERE preco > 11;
SELECT * FROM tb_produtos WHERE preco BETWEEN 11 AND 23;
SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.id_categoria = tb_categorias.id;

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.id_categoria = tb_categorias.id
WHERE tb_categorias.tipo = 'fruta';
