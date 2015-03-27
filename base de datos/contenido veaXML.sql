--Estados
insert into estado(estado) values('Implementado', 'Descripcion');
insert into estado(estado) values('No implementado', 'Descripcion');
insert into estado(estado) values('Descontinuado', 'Descripcion');

--Formatos de Documento
insert into formato(descripcion) values('XML', );
insert into formato(descripcion) values('XSD');
insert into formato(descripcion) values('DTD');

--Tipos Primmitivos
insert into tipo_primitivo(tipo_primitivo) values("string");
insert into tipo_primitivo(tipo_primitivo) values("boolean");
insert into tipo_primitivo(tipo_primitivo) values("decimal");
insert into tipo_primitivo(tipo_primitivo) values("float");
insert into tipo_primitivo(tipo_primitivo) values("double");
insert into tipo_primitivo(tipo_primitivo) values("duration");
insert into tipo_primitivo(tipo_primitivo) values("dateTime");
insert into tipo_primitivo(tipo_primitivo) values("time");
insert into tipo_primitivo(tipo_primitivo) values("date");
insert into tipo_primitivo(tipo_primitivo) values("gYearMonth");
insert into tipo_primitivo(tipo_primitivo) values("gYear");
insert into tipo_primitivo(tipo_primitivo) values("gMonthDay");
insert into tipo_primitivo(tipo_primitivo) values("gDay");
insert into tipo_primitivo(tipo_primitivo) values("gMonth");
insert into tipo_primitivo(tipo_primitivo) values("hexBinary");
insert into tipo_primitivo(tipo_primitivo) values("base64Binary");
insert into tipo_primitivo(tipo_primitivo) values("anyURI");
insert into tipo_primitivo(tipo_primitivo) values("QName");
insert into tipo_primitivo(tipo_primitivo) values("NOTATION");

insert into tipo_primitivo(tipo_primitivo) values("normalizedString");
insert into tipo_primitivo(tipo_primitivo) values("token");
insert into tipo_primitivo(tipo_primitivo) values("language");
insert into tipo_primitivo(tipo_primitivo) values("NMTOKEN");
insert into tipo_primitivo(tipo_primitivo) values("NMTOKENS");
insert into tipo_primitivo(tipo_primitivo) values("Name");
insert into tipo_primitivo(tipo_primitivo) values("NCName");
insert into tipo_primitivo(tipo_primitivo) values("ID");
insert into tipo_primitivo(tipo_primitivo) values("IDREF");
insert into tipo_primitivo(tipo_primitivo) values("IDREFS");
insert into tipo_primitivo(tipo_primitivo) values("ENTITY");
insert into tipo_primitivo(tipo_primitivo) values("ENTITIES");
insert into tipo_primitivo(tipo_primitivo) values("integer");
insert into tipo_primitivo(tipo_primitivo) values("nonPositiveInteger");
insert into tipo_primitivo(tipo_primitivo) values("negativeInteger");
insert into tipo_primitivo(tipo_primitivo) values("long");
insert into tipo_primitivo(tipo_primitivo) values("int");
insert into tipo_primitivo(tipo_primitivo) values("short");
insert into tipo_primitivo(tipo_primitivo) values("byte");
insert into tipo_primitivo(tipo_primitivo) values("nonNegativeInteger");
insert into tipo_primitivo(tipo_primitivo) values("unsignedLong");
insert into tipo_primitivo(tipo_primitivo) values("unsignedInt");
insert into tipo_primitivo(tipo_primitivo) values("unsignedShort");
insert into tipo_primitivo(tipo_primitivo) values("unsignedByte");
insert into tipo_primitivo(tipo_primitivo) values("positiveInteger");
insert into tipo_primitivo(tipo_primitivo) values("yearMonthDuration");
insert into tipo_primitivo(tipo_primitivo) values("dayTimeDuration");
insert into tipo_primitivo(tipo_primitivo) values("dateTimeStamp");

--Tipo de Facetas
insert into tipo_faceta(tipo_faceta) values('Facetas');
insert into tipo_faceta(tipo_faceta) values('Facetas Fundamentales');

--Tipos internos
insert into tipo_interno(tipo_interno) values('Entero positivo');
insert into tipo_interno(tipo_interno) values('String');
insert into tipo_interno(tipo_interno) values('Tipo base');
insert into tipo_interno(tipo_interno) values('');

--Facetas tipo: Facetas Fundamentales
insert into faceta(faceta, 	id_tipo_faceta) values('ordenado', 2);
insert into faceta(faceta, 	id_tipo_faceta) values('delimitada', 2);
insert into faceta(faceta, 	id_tipo_faceta) values('cardinalidad', 2);
insert into faceta(faceta, 	id_tipo_faceta) values('numerico', 2);
--Facetas tipo: Facetas
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('length',			1, 1);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('minLength',		1, 1);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('maxLength',		1, 1);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('pattern',			1, 2);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('enumeration', 		1, 2);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('whiteSpace',		1, null);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('maxInclusive', 	1, 3);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('maxExclusive', 	1, 3);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('minExclusive', 	1, 3);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('minInclusive', 	1, 3);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('totalDigits', 		1, 1);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('fractionDigits', 	1, 1);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('Assertions', 		1, 2);
insert into faceta(faceta, 	id_tipo_faceta, id_tipo_interno) values('explicitTimezone', 1, null);

--Valores
insert into valor(valor) values('true');
insert into valor(valor) values('false');
insert into valor(valor) values('finite');
insert into valor(valor) values('countably infinite');
insert into valor(valor) values('preserve');
insert into valor(valor) values('replace');
insert into valor(valor) values('collapse');
insert into valor(valor) values('required');
insert into valor(valor) values('prohibited');
insert into valor(valor) values('optional');

--Facetas fundamentales
--Ordenado: finite|countably infinite
insert into faceta_valor_admitido(id_faceta, id_valor) values(1, 1);
insert into faceta_valor_admitido(id_faceta, id_valor) values(1, 2);
--Delimitada: true|false
insert into faceta_valor_admitido(id_faceta, id_valor) values(2, 1);
insert into faceta_valor_admitido(id_faceta, id_valor) values(2, 2);
--Cardinalidad: true|false
insert into faceta_valor_admitido(id_faceta, id_valor) values(3, 3);
insert into faceta_valor_admitido(id_faceta, id_valor) values(3, 4);
--Numerico: true|false
insert into faceta_valor_admitido(id_faceta, id_valor) values(4, 1);
insert into faceta_valor_admitido(id_faceta, id_valor) values(4, 2);
--Facetas
--WhiteSpace
insert into faceta_valor_admitido(id_faceta, id_valor) values(10, 5);
insert into faceta_valor_admitido(id_faceta, id_valor) values(10, 6);
insert into faceta_valor_admitido(id_faceta, id_valor) values(10, 7);
--ExplicitTimezone
insert into faceta_valor_admitido(id_faceta, id_valor) values(18, 8);
insert into faceta_valor_admitido(id_faceta, id_valor) values(18, 9);
insert into faceta_valor_admitido(id_faceta, id_valor) values(18, 10);
