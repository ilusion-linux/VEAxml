
/* Drop Tables */

DROP TABLE [elemento];
DROP TABLE [formato_namespace];
DROP TABLE [formato];
DROP TABLE [estado];
DROP TABLE [faceta_valor_admitido];
DROP TABLE [facetas_tipo];
DROP TABLE [faceta];
DROP TABLE [namespace];
DROP TABLE [tipo];
DROP TABLE [tipo_clasificacion];
DROP TABLE [tipo_faceta];
DROP TABLE [tipo_interno];
DROP TABLE [valor];




/* Create Tables */

-- Estados en que se puede encontra los tipos de archivos soportado por veaXML
--
-- Implementado, Descripcion
-- No implementado, Descripcion
--
-- Descontinuado, Descripcion
CREATE TABLE [estado]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[estado] text NOT NULL UNIQUE
);


-- Tabla para almacenar los formatos que soporta veaXML.
--
-- XML
-- XSD
-- DTD
CREATE TABLE [formato]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[descripcion] text NOT NULL UNIQUE,
	[id_estado] integer NOT NULL,
	FOREIGN KEY ([id_estado])
	REFERENCES [estado] ([id])
);


-- Primitive Datatypes
-- Other Built-in Datatypes
CREATE TABLE [tipo_clasificacion]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[clasificacion] text NOT NULL UNIQUE
);


-- Tipo interno, utilizado en java, para la verificacion de valores:
--
-- Entero positivo
--
-- String
--
-- Tipo base
--
-- Boolean
--
-- Decimal
--
-- Date
--
-- Time
--
-- DateTime
--
-- Mes+Anio
--
-- Anio
--
-- Mes+Dia
--
-- Dia
--
-- Mes
--
-- Periodo
--
-- URI
--
-- Entero
--
-- Entero Negativo
--
-- Entero No Positivo
--
-- Long
--
-- Short
--
-- Byte
--
-- Long unsigned
--
-- Int unsigned
--
-- Short unsigned
--
-- Byte unsigned
--
-- Periodo Anio+Mes
--
-- Periodo Dia
CREATE TABLE [tipo_interno]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[tipo_interno] text NOT NULL UNIQUE
);


-- 3.3 Primitive Datatypes
--         3.3.1 string
--         3.3.2 boolean
--         3.3.3 decimal
--         3.3.4 float
--         3.3.5 double
--         3.3.6 duration
--         3.3.7 dateTime
--         3.3.8 time
--         3.3.9 date
--         3.3.10 gYearMonth
--         3.3.11 gYear
--         3.3.12 gMonthDay
--         3.3.13 gDay
--         3.3.14 gMonth
--         3.3.15 hexBinary
--         3.3.16 base64Binary
--         3.3.17 anyURI
--         3.3.18 QName
--         3.3.19 NOTATION
--
-- 3.4 Other Built-in Datatypes
--         3.4.1 normalizedString
--         3.4.2 token
--         3.4.3 language
--         3.4.4 NMTOKEN
--         3.4.5 NMTOKENS
--         3.4.6 Name
--         3.4.7 NCName
--         3.4.8 ID
--         3.4.9 IDREF
--         3.4.10 IDREFS
--         3.4.11 ENTITY
--         3.4.12 ENTITIES
--         3.4.13 integer
--         3.4.14 nonPositiveInteger
--         3.4.15 negativeInteger
--         3.4.16 long
--         3.4.17 int
--         3.4.18 short
--         3.4.19 byte
--         3.4.20 nonNegativeInteger
--         3.4.21 unsignedLong
--         3.4.22 unsignedInt
--         3.4.23 unsignedShort
--         3.4.24 unsignedByte
--         3.4.25 positiveInteger
--         3.4.26 yearMonthDuration
--         3.4.27 dayTimeDuration
--         3.4.28 dateTimeStamp
CREATE TABLE [tipo]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[tipo] text NOT NULL UNIQUE,
	[id_tipo_interno] integer NOT NULL,
	[id_tipo_clasificacion] integer NOT NULL,
	FOREIGN KEY ([id_tipo_clasificacion])
	REFERENCES [tipo_clasificacion] ([id]),
	FOREIGN KEY ([id_tipo_interno])
	REFERENCES [tipo_interno] ([id])
);


-- Elementos o tags que comoponen la definicion del lenguaje(XML, XSD, DTD) a utilizar.
CREATE TABLE [elemento]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[id_formato] integer NOT NULL,
	[elemento] text NOT NULL UNIQUE,
	[id_tipo] integer NOT NULL,
	FOREIGN KEY ([id_formato])
	REFERENCES [formato] ([id]),
	FOREIGN KEY ([id_tipo])
	REFERENCES [tipo] ([id])
);


-- Tipo de facetas:
--
-- 4.3 Constraining Facets
-- 4.2 Facetas Fundamentales
CREATE TABLE [tipo_faceta]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[tipo_faceta] text NOT NULL UNIQUE
);


-- 4.3 Constraining Facets
--         4.3.1 length
--         4.3.2 minLength
--         4.3.3 maxLength
--         4.3.4 pattern
--         4.3.5 enumeration
--         4.3.6 whiteSpace
--         4.3.7 maxInclusive
--         4.3.8 maxExclusive
--         4.3.9 minExclusive
--         4.3.10 minInclusive
--         4.3.11 totalDigits
--         4.3.12 fractionDigits
--         4.3.13 Assertions
--         4.3.14 explicitTimezone
--
-- 4.2 Facetas Fundamentales
-- 		4.2.1 ordenado
-- 		4.2.2 delimitada
-- 		4.2.3 cardinalidad
-- 		4.2.4 numerico
CREATE TABLE [faceta]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[faceta] text NOT NULL UNIQUE,
	[id_tipo_faceta] integer NOT NULL,
	[id_tipo_interno] integer,
	FOREIGN KEY ([id_tipo_interno])
	REFERENCES [tipo_interno] ([id]),
	FOREIGN KEY ([id_tipo_faceta])
	REFERENCES [tipo_faceta] ([id])
);


-- ###Tipos Primitivos###################################################################
-- string
--       whiteSpace = preserve
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- boolean
-- 	pattern
-- 	whiteSpace = collapse
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = finite
-- 	numeric = false
-- float
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = partial
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- double
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = partial
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- decimal
-- 	totalDigits
-- 	fractionDigits
-- 	pattern
-- 	whiteSpace = collapse
-- 	enumeration
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = true
-- duration
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- dateTime
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- time
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- date
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- gYearMonth
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- gYear
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- gMonthDay
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- gDay
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- gMonth
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
-- 	explicitTimezone = optional
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- hexBinary
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- base64Binary
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- anyURI
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- QName
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- NOTATION
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	whiteSpace = collapse
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- ###Tipos Complejoos###################################################################
-- normalizedString
-- 	whiteSpace = replace
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- token
-- 	whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	pattern
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- language
-- 	pattern = [a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*
-- 	whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- NMTOKEN
-- 	pattern = \c+
--        whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- NMTOKENS
-- 	minLength = 1
--        whiteSpace = collapse
-- 	length
-- 	maxLength
-- 	enumeration
-- 	pattern
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- Name
-- 	pattern = \i\c*
--        whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- NCName
-- 	pattern = \i\c* ? [\i-[:]][\c-[:]]*
--        whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- ID
-- 	pattern = \i\c* ? [\i-[:]][\c-[:]]*
--        whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- IDREF
-- 	pattern = \i\c* ? [\i-[:]][\c-[:]]*
--        whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- IDREFS
-- 	minLength = 1
--        whiteSpace = collapse
-- 	length
-- 	maxLength
-- 	enumeration
-- 	pattern
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- ENTITY
-- 	pattern = \i\c* ? [\i-[:]][\c-[:]]*
--        whiteSpace = collapse
-- 	length
-- 	minLength
-- 	maxLength
-- 	enumeration
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- ENTITIES
-- 	minLength = 1
--        whiteSpace = collapse
-- 	length
-- 	maxLength
-- 	enumeration
-- 	pattern
-- 	assertions
--
-- 	ordered = false
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- integer
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
-- 	totalDigits
-- 	enumeration
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = true
-- nonPositiveInteger
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
--        maxInclusive = 0
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = true
-- negativeInteger
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
--        maxInclusive = -1
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = true
-- long
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
--        maxInclusive = 9223372036854775807
--        minInclusive = -9223372036854775808
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- int
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
--        maxInclusive = 2147483647
--        minInclusive = -2147483648
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- short
-- 	fractionDigits = 0
--        whiteSpace = collapse
--        pattern = [\-+]?[0-9]+
--        maxInclusive = 32767
--        minInclusive = -32768
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- byte
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
-- 	maxInclusive = 127
-- 	minInclusive = -128
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- nonNegativeInteger
-- 	fractionDigits = 0
-- 	whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
--        minInclusive = 0
-- 	totalDigits
-- 	enumeration
-- 	maxInclusive
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = true
-- unsignedLong
-- 	fractionDigits = 0
-- 	whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
-- 	maxInclusive = 18446744073709551615
-- 	minInclusive = 0
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- unsignedInt
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
-- 	maxInclusive = 4294967295
-- 	minInclusive = 0
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- unsignedShort
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	attern = [\-+]?[0-9]+
-- 	maxInclusive = 65535
-- 	minInclusive = 0
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- unsignedByte
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
-- 	maxInclusive = 255
-- 	minInclusive = 0
-- 	totalDigits
-- 	enumeration
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = true
-- 	cardinality = finite
-- 	numeric = true
-- positiveInteger
-- 	fractionDigits = 0
--        whiteSpace = collapse
-- 	pattern = [\-+]?[0-9]+
--        minInclusive = 1
-- 	totalDigits
-- 	enumeration
-- 	maxInclusive
-- 	maxExclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = total
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = true
-- yearMonthDuration
-- 	whiteSpace = collapse
-- 	pattern = [^DT]*
-- 	enumeration
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- dayTimeDuration
-- 	whiteSpace = collapse
-- 	pattern = [^YM]*(T.*)?
-- 	enumeration
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
-- dateTimeStamp
-- 	whiteSpace = collapse
--        explicitTimezone = required
-- 	pattern
-- 	enumeration
-- 	maxInclusive
-- 	maxExclusive
-- 	minInclusive
-- 	minExclusive
-- 	assertions
--
-- 	ordered = partial
-- 	bounded = false
-- 	cardinality = countably infinite
-- 	numeric = false
CREATE TABLE [facetas_tipo]
(
	[id_tipo] integer NOT NULL,
	[id_faceta] integer NOT NULL,
	[valor] text,
	FOREIGN KEY ([id_tipo])
	REFERENCES [tipo] ([id]),
	FOREIGN KEY ([id_faceta])
	REFERENCES [faceta] ([id])
);


CREATE TABLE [valor]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[valor] text NOT NULL UNIQUE
);


-- Valores Facetas Fundamentales
-- 	ordenado
-- 		true
-- 		false
-- 	acotada
-- 		true
-- 		false
-- 	cardinalidad
-- 		finite
-- 		countably infinite
-- 	numerico
-- 		true
-- 		false
--
-- Valores Facetas
-- 	length
-- 		Entero positivo
-- 	minLength
-- 		Entero positivo
-- 	maxLength
-- 		Entero positivo
-- 	pattern
-- 		String
-- 	enumeration
-- 		String
-- 	whiteSpace
-- 		preserve
-- 		replace
-- 		collapse
-- 	maxInclusive
-- 		Tipo base
-- 	maxExclusive
-- 		Tipo base
-- 	minExclusive
-- 		Tipo base
-- 	minInclusive
-- 		Tipo base
-- 	totalDigits
-- 		Entero positivo
-- 	fractionDigits
-- 		Entero positivo
-- 	Assertions
-- 		String
-- 	explicitTimezone
-- 		required
-- 		prohibited
-- 		optional
CREATE TABLE [faceta_valor_admitido]
(
	[id_faceta] integer NOT NULL,
	[id_valor] integer NOT NULL,
	FOREIGN KEY ([id_faceta])
	REFERENCES [faceta] ([id]),
	FOREIGN KEY ([id_valor])
	REFERENCES [valor] ([id])
);


-- --Namespaces identificados para archivos XML Schema
--
-- fn obligado a http://www.w3.org/2005/xpath-functions
-- html unido a http://www.w3.org/1999/xhtml
-- my
-- rddl unido a http://www.rddl.org/
-- vc obligado a http://www.w3.org/2007/XMLSchema-versioning
-- xhtml unido a http://www.w3.org/1999/xhtml
-- xlink unido a http://www.w3.org/1999/xlink
-- xml obligado a http://www.w3.org/XML/1998/namespace
-- xs unidos a http://www.w3.org/2001/XMLSchema
-- xsi obligado a http://www.w3.org/2001/XMLSchema-instance
-- xsl unido a http://www.w3.org/1999/XSL/Transform
CREATE TABLE [namespace]
(
	[id] integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	[namespace] text NOT NULL UNIQUE,
	[url] text NOT NULL UNIQUE
);


CREATE TABLE [formato_namespace]
(
	[id_formato] integer NOT NULL,
	[id_namespace] integer NOT NULL,
	FOREIGN KEY ([id_namespace])
	REFERENCES [namespace] ([id]),
	FOREIGN KEY ([id_formato])
	REFERENCES [formato] ([id])
);
