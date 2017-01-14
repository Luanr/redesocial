
CREATE TABLE Disciplina (
cdDisciplina int PRIMARY KEY,
Nome varchar(60)
);

CREATE TABLE Publicacao (
cdPublicacao int PRIMARY KEY,
Conteudo varchar(255),
Data date,
cdUsuario int
);

CREATE TABLE Materia (
cdMateria int PRIMARY KEY,
Nome varchar(50),
cdDisciplina int,
FOREIGN KEY(cdDisciplina) REFERENCES Disciplina (cdDisciplina)
);

CREATE TABLE usuario (
Nome varchar(50),
cdUsuario int PRIMARY KEY,
Senha varchar(40),
Email varchar(50),
Fase varchar(10)
);

CREATE TABLE Duvida (
cdDuvida int PRIMARY KEY,
Conteudo varchar(300),
Data date,
cdUsuario int,
cdMateria int,
FOREIGN KEY(cdUsuario) REFERENCES usuario (cdUsuario),
FOREIGN KEY(cdMateria) REFERENCES Materia (cdMateria)
);

CREATE TABLE Anexo (
cdAnexo int PRIMARY KEY,
Url varchar(50),
Nome varchar(50),
Tipo varchar(10)
);

CREATE TABLE Mensagem (
id_msg int PRIMARY KEY,
nome_usu varchar(50),
mensagem varchar(255)
);

CREATE TABLE Segue (
cdUsuario int,
possui_cdUsuario int
);

CREATE TABLE Segue_materia (
cdUsuario int,
cdMateria int,
FOREIGN KEY(cdUsuario) REFERENCES usuario (cdUsuario),
FOREIGN KEY(cdMateria) REFERENCES Materia (cdMateria)
);

CREATE TABLE Publi_Materia (
cdMateria int,
cdPublicacao int,
FOREIGN KEY(cdMateria) REFERENCES Materia (cdMateria),
FOREIGN KEY(cdPublicacao) REFERENCES Publicacao (cdPublicacao)
);

CREATE TABLE Respondeu (
data date,
hora time,
cdUsuario int,
cdDuvida int,
FOREIGN KEY(cdUsuario) REFERENCES usuario (cdUsuario),
FOREIGN KEY(cdDuvida) REFERENCES Duvida (cdDuvida)
);

CREATE TABLE Anexos (
cdAnexo int,
cdDuvida int,
FOREIGN KEY(cdAnexo) REFERENCES Anexo (cdAnexo),
FOREIGN KEY(cdDuvida) REFERENCES Duvida (cdDuvida)
);

CREATE TABLE Usuario_Mensagem (
id_msg int,
cdUsuario int,
FOREIGN KEY(id_msg) REFERENCES Mensagem (id_msg)
FOREIGN KEY(cdUsuario) REFERENCES usuario (cdUsuario)
);

ALTER TABLE Publicacao ADD FOREIGN KEY(cdUsuario) REFERENCES usuario (cdUsuario)
