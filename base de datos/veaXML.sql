
/* Drop Tables */

DROP TABLE [propiedades_elemento];
DROP TABLE [elemento];
DROP TABLE [formato];
DROP TABLE [valores_admitidos];
DROP TABLE [propiedad];
DROP TABLE [tipo];
DROP TABLE [valor];




/* Create Tables */

-- Tabla para almacenar los formatos que soporta veaXML.
-- 
-- 1 XML
-- 2 XSD
-- 3 DTD
CREATE TABLE [formato]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[descripcion] text NOT NULL UNIQUE
);


-- Elementos o tags que comoponen la definicion del lenguaje(XML, XSD, DTD) a utilizar.
CREATE TABLE [elemento]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[id_formato] integer NOT NULL,
	[elemento] text NOT NULL UNIQUE,
	FOREIGN KEY ([id_formato])
	REFERENCES [formato] ([id])
);


-- Tipo permitido para las propiedades existentes.
CREATE TABLE [tipo]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[tipo] text NOT NULL UNIQUE
);


-- Propiedades validades para los elementos del lenguaje(XML, XSD, DTD).
CREATE TABLE [propiedad]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[id_propiedad] integer NOT NULL,
	[propiedad] text NOT NULL UNIQUE,
	FOREIGN KEY ([id_propiedad])
	REFERENCES [tipo] ([id])
);


-- Asignacion de las propiedades permitidas para cada elemento.
CREATE TABLE [propiedades_elemento]
(
	[id_elemento] integer NOT NULL,
	[id_propiedad] integer NOT NULL,
	FOREIGN KEY ([id_elemento])
	REFERENCES [elemento] ([id]),
	FOREIGN KEY ([id_propiedad])
	REFERENCES [propiedad] ([id])
);


CREATE TABLE [valor]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[valor] text NOT NULL UNIQUE
);


CREATE TABLE [valores_admitidos]
(
	[id_propiedad] integer NOT NULL,
	[id_valor] integer NOT NULL,
	FOREIGN KEY ([id_propiedad])
	REFERENCES [propiedad] ([id]),
	FOREIGN KEY ([id_valor])
	REFERENCES [valor] ([id])
);



