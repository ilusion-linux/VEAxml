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
