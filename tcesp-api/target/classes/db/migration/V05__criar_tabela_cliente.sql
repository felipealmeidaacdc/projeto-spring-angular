CREATE TABLE cliente (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50),
	cpf VARCHAR(30)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (nome, email, cpf) values ('João Silva', 'carlos@gmail.com',  '40009125850');

