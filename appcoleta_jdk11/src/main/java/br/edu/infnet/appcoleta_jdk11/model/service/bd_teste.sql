-- Apaga as tabelas caso já existam
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS solicitante;
DROP TABLE IF EXISTS residuooleo;

-- Cria a tabela USUARIO
CREATE TABLE usuario (
    usuarioid INT AUTO_INCREMENT PRIMARY KEY,
    usuarionome VARCHAR(120),
    usuarioemail VARCHAR(120) NOT NULL,
    usuariosenha VARCHAR(60) NOT NULL
);

-- Cria a tabela SOLICITANTE
CREATE TABLE solicitante (
    solicitanteid INT AUTO_INCREMENT PRIMARY KEY,
    solicitantenome VARCHAR(120),
    solicitantecpf VARCHAR(20) NOT NULL,
    solicitanteemail VARCHAR(120) NOT NULL
);

-- Cria a tabela RESIDUO_OLEO
CREATE TABLE residuooleo (
    residuooleoid INT AUTO_INCREMENT PRIMARY KEY,
    residuooleonome VARCHAR(255) NOT NULL,
    residuooleocodigo INT,
    residuooleoobservacao VARCHAR(255),
    residuooleovolume FLOAT(10,4) NOT NULL,
    residuooleoislimpo BOOLEAN,
    residuooleotipo ENUM('Automotivo', 'Cozinha', 'Hidraulico', 'Outro', 'Termico') NOT NULL
);

-- Insere dados de exemplo na tabela usuario
INSERT INTO usuario (usuarionome, usuarioemail, usuariosenha) VALUES
    ('Patrick Oliveira', 'patrick.noliveira@al.infnet.edu.br', '123'),
    ('Fabio Guilherme', 'fabio.guilherme@prof.infnet.edu.br', 'fabio_guilherme'),
  	('Beto Teste', 'beto@teste.com', 'teste');
  	
-- Atualiza dados de exemplo na tabela usuario
UPDATE usuario SET usuariosenha = 'teste123456' WHERE usuarioemail = 'beto@teste.com';