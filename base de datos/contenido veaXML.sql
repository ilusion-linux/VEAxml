--Estados
insert into estado(estado) values('Implementado', 'Descripcion');
insert into estado(estado) values('No implementado', 'Descripcion');
insert into estado(estado) values('Descontinuado', 'Descripcion');

--Formatos de Documento
insert into formato(descripcion) values('XML', 2);
insert into formato(descripcion) values('XSD', 2);
insert into formato(descripcion) values('DTD', 2);

--Namespace
insert into namespace(namespace, url) values('fn',      'http://www.w3.org/2005/xpath-functions');
insert into namespace(namespace, url) values('html',    'http://www.w3.org/1999/xhtml');
insert into namespace(namespace, url) values('my',      null);
insert into namespace(namespace, url) values('rddl',    'http://www.rddl.org/');
insert into namespace(namespace, url) values('vc',      'http://www.w3.org/2007/XMLSchema-versioning');
insert into namespace(namespace, url) values('xhtml',   'http://www.w3.org/1999/xhtml');
insert into namespace(namespace, url) values('xlink',   'http://www.w3.org/1999/xlink');
insert into namespace(namespace, url) values('xml',     'http://www.w3.org/XML/1998/namespace');
insert into namespace(namespace, url) values('xs',      'http://www.w3.org/2001/XMLSchema');
insert into namespace(namespace, url) values('xsi',     'http://www.w3.org/2001/XMLSchema-instance');
insert into namespace(namespace, url) values('xsl',     'http://www.w3.org/1999/XSL/Transform');

--Formatos Namespace
insert into formato_namespace(id_formato, id_namespace) select 2, n.namespace from namespace n;

--Tipos internos
insert into tipo_interno(tipo_interno) values('Entero positivo');
insert into tipo_interno(tipo_interno) values('String');
insert into tipo_interno(tipo_interno) values('Tipo base');
insert into tipo_interno(tipo_interno) values('Boolean');
insert into tipo_interno(tipo_interno) values('Decimal');
insert into tipo_interno(tipo_interno) values('Date');
insert into tipo_interno(tipo_interno) values('Time');
insert into tipo_interno(tipo_interno) values('DateTime');
insert into tipo_interno(tipo_interno) values('Mes+Anio');
insert into tipo_interno(tipo_interno) values('Anio');
insert into tipo_interno(tipo_interno) values('Mes+Dia');
insert into tipo_interno(tipo_interno) values('Dia');
insert into tipo_interno(tipo_interno) values('Mes');
insert into tipo_interno(tipo_interno) values('Periodo');
insert into tipo_interno(tipo_interno) values('URI');
insert into tipo_interno(tipo_interno) values('Entero');
insert into tipo_interno(tipo_interno) values('Entero Negativo');
insert into tipo_interno(tipo_interno) values('Entero No Positivo');
insert into tipo_interno(tipo_interno) values('Long');
insert into tipo_interno(tipo_interno) values('Short');
insert into tipo_interno(tipo_interno) values('Byte');
insert into tipo_interno(tipo_interno) values('Long unsigned');
insert into tipo_interno(tipo_interno) values('Int unsigned');
insert into tipo_interno(tipo_interno) values('Short unsigned');
insert into tipo_interno(tipo_interno) values('Byte unsigned');
insert into tipo_interno(tipo_interno) values('Periodo Anio+Mes');
insert into tipo_interno(tipo_interno) values('Periodo Dia');

--Clase de tipos
insert into tipo_clasificacion(clasificacion) values('Primitive Datatypes');
insert into tipo_clasificacion(clasificacion) values('Other Built-in Datatypes');

--Tipos
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("string",			   2, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("boolean",		   4, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("decimal",		   5, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("float",			   5, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("double",			   5, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("duration",          14, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("dateTime",		   8, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("time",			   7, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("date",			   6, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("gYearMonth",		   9, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("gYear"			   10, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("gMonthDay",         11, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("gDay",              12, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("gMonth",            13, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("hexBinary",         2, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("base64Binary",      2, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("anyURI",            15, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("QName",             2, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("NOTATION",          2, 1);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("normalizedString",  2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("token",             2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("language",          2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("NMTOKEN",           2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("NMTOKENS",          2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("Name",              2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("NCName",            2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("ID",                2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("IDREF",             2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("IDREFS",            2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("ENTITY",            2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("ENTITIES",          2, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("integer",           16, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("nonPositiveInteger",18, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("negativeInteger",   17, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("long",              19, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("int",               16, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("short",             20, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("byte",              21, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("nonNegativeInteger",1, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("unsignedLong",      22, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("unsignedInt",       23, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("unsignedShort",     24, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("unsignedByte",      25, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("positiveInteger",   26, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("yearMonthDuration", 27, 2);
insert into tipo(tipo, id_tipo_interno, id_tipo_clasificacion) values("dayTimeDuration",   8, 2);

--Tipo de Facetas
insert into tipo_faceta(tipo_faceta) values('Constraining Facets');
insert into tipo_faceta(tipo_faceta) values('Facetas Fundamentales');

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

--Tipos con facetas validas
insert into facetas_tipo(id_tipo, id_face, valor) values();
