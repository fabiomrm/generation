CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT,
    tipo VARCHAR(255) NOT NULL,
    descricao VARCHAR(1000) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_cursos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    departamento VARCHAR(255) NOT NULL,
    preco DOUBLE NOT NULL,
    id_categoria BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (tipo, descricao) VALUES ('backend', 'curso de programação backend');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('frontend', 'curso de programação frontend');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('fullstack', 'curso de programação backend e frontend');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('mobile', 'curso de programação mobile');
INSERT INTO tb_categorias (tipo, descricao) VALUES ('ciência de dados', 'curso de ciência de dados');



INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso Java', 'Udemy', 500, 1);
INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso C#', 'Udemy', 350, 1);
INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso SQL', 'Coursera',700, 5);
INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso Angular', 'Alura', 1800, 2);
INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso React', 'DevTo', 1250, 2);
INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso MERN Stack', 'Udemy', 730, 3);
INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso React Native', 'Alura', 2000, 4);
INSERT INTO tb_cursos (nome, departamento, preco, id_categoria) VALUES ('Curso R para Data Science', 'Free Code Camp', 10, 5);




SELECT * FROM tb_cursos WHERE preco > 500;
SELECT * FROM tb_cursos WHERE preco BETWEEN 500 AND 1000;
SELECT * FROM tb_cursos WHERE nome LIKE '%J%';

SELECT * FROM tb_cursos INNER JOIN tb_categorias
ON tb_cursos.id_categoria = tb_categorias.id;

SELECT * FROM tb_cursos INNER JOIN tb_categorias
ON tb_cursos.id_categoria = tb_categorias.id
WHERE tb_categorias.tipo = 'backend';
