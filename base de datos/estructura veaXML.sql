/*
Schema component is the generic term for the building blocks that make up the abstract data model of the schema. [Definition:]
An XSD schema is a set of ·schema components·. There are several kinds of schema component, falling into three groups.
The primary schema components, which may (type definitions) or must (element and attribute declarations) have names, are as follows:

Simple type definitions
Complex type definitions
Attribute declarations
Element declarations

The secondary schema components, are as follows:

Attribute group definitions
Identity-constraint definitions
Type alternatives
Assertions
Model group definitions
Notation declarations

Finally, the "helper" schema components provide small parts of other schema components; they are dependent on their context:

Annotations
Model groups
Particles
Wildcards
Attribute Uses
*/
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

--Formatos Namespaces
insert into formato_namespace(id_formato, id_namespace) select 2, n.namespace from namespace n;

--Valores
-- insert into valor(valor) values('total');
-- insert into valor(valor) values('partial');
-- insert into valor(valor) values('true');
-- insert into valor(valor) values('false');
-- insert into valor(valor) values('finite');
-- insert into valor(valor) values('countably infinite');
-- insert into valor(valor) values('preserve');
-- insert into valor(valor) values('replace');
-- insert into valor(valor) values('collapse');
-- insert into valor(valor) values('required');
-- insert into valor(valor) values('prohibited');
-- insert into valor(valor) values('optional');
insert into valor(valor) values('qualified');
insert into valor(valor) values('unqualified');
insert into valor(valor) values('unbounded');
insert into valor(valor) values('all');
insert into valor(valor) values('extension');
insert into valor(valor) values('restriction');
insert into valor(valor) values('substitution');
insert into valor(valor) values('none');
insert into valor(valor) values('interleave');
insert into valor(valor) values('suffix');
insert into valor(valor) values('0');
insert into valor(valor) values('1');
insert into valor(valor) values('list');
insert into valor(valor) values('union');

--Componente
insert into componente(componente, id_tipo, lista) values('id',                     27,  1);
insert into componente(componente, id_tipo, lista) values('default',                1,   1);
insert into componente(componente, id_tipo, lista) values('fixed',                  1,   1);
insert into componente(componente, id_tipo, lista) values('form',                   null,1);
insert into componente(componente, id_tipo, lista) values('ref',                    18,  1);
insert into componente(componente, id_tipo, lista) values('targetNamespace',        17,  1);
insert into componente(componente, id_tipo, lista) values('use',                    null,1);
insert into componente(componente, id_tipo, lista) values('inheritable',            2,   1);
insert into componente(componente, id_tipo, lista) values('abstract',               2,   1);
insert into componente(componente, id_tipo, lista) values('default',                1,   1);
insert into componente(componente, id_tipo, lista) values('fixed',                  1,   1);
insert into componente(componente, id_tipo, lista) values('nillable',               2,   1);
insert into componente(componente, id_tipo, lista) values('maxOccurs',              39,  1);
insert into componente(componente, id_tipo, lista) values('maxOccurs',              null,1);
insert into componente(componente, id_tipo, lista) values('minOccurs',              39,  1);
insert into componente(componente, id_tipo, lista) values('block',                  null,1);
insert into componente(componente, id_tipo, lista) values('block',                  null,0);
insert into componente(componente, id_tipo, lista) values('final',                  null,1);
insert into componente(componente, id_tipo, lista) values('final',                  null,0);
insert into componente(componente, id_tipo, lista) values('substitutionGroup',      48,  0);
insert into componente(componente, id_tipo, lista) values('block',                  null,1);
insert into componente(componente, id_tipo, lista) values('block',                  null,0);
insert into componente(componente, id_tipo, lista) values('mixed',                  1,   1);
insert into componente(componente, id_tipo, lista) values('defaultAttributesApply', 1,   1);
insert into componente(componente, id_tipo, lista) values('base',                   18,  1);
insert into componente(componente, id_tipo, lista) values('mode',                   18,  1);
insert into componente(componente, id_tipo, lista) values('maxOccurs',              null,0);
insert into componente(componente, id_tipo, lista) values('minOccurs',              null,0);
insert into componente(componente, id_tipo, lista) values('final',                  null,1);
insert into componente(componente, id_tipo, lista) values('final',                  null,0);
insert into componente(componente, id_tipo, lista) values('itemType',               49,  0);
insert into componente(componente, id_tipo, lista) values('memberTypes',            49,  1);

--Componente Valor Admitido
--form: qualified | unqualified
insert into componente_valor_admitido(id_componente, id_valor) values(4, 13);
insert into componente_valor_admitido(id_componente, id_valor) values(4, 14);
--default: optional | prohibited | required
insert into componente_valor_admitido(id_componente, id_valor) values(7, 12);
insert into componente_valor_admitido(id_componente, id_valor) values(7, 11);
insert into componente_valor_admitido(id_componente, id_valor) values(7, 10);
--maxOccurs: unbounded
insert into componente_valor_admitido(id_componente, id_valor) values(14, 15);
--block (#all | List of (extension | restriction | substitution))
insert into componente_valor_admitido(id_componente, id_valor) values(15, 16);
insert into componente_valor_admitido(id_componente, id_valor) values(16, 17);
insert into componente_valor_admitido(id_componente, id_valor) values(16, 18);
insert into componente_valor_admitido(id_componente, id_valor) values(16, 19);
--final: (#all | List of (extension | restriction))
insert into componente_valor_admitido(id_componente, id_valor) values(17, 16);
insert into componente_valor_admitido(id_componente, id_valor) values(18, 17);
insert into componente_valor_admitido(id_componente, id_valor) values(18, 18);
--block: (#all | List of (extension | restriction))
insert into componente_valor_admitido(id_componente, id_valor) values(21, 16);
insert into componente_valor_admitido(id_componente, id_valor) values(22, 17);
insert into componente_valor_admitido(id_componente, id_valor) values(22, 18);
--mode: (none | interleave | suffix)
insert into componente_valor_admitido(id_componente, id_valor) values(26, 20);
insert into componente_valor_admitido(id_componente, id_valor) values(26, 21);
insert into componente_valor_admitido(id_componente, id_valor) values(26, 22);
--maxOccurs: 1
insert into componente_valor_admitido(id_componente, id_valor) values(27, 23);
--minOccurs: (0 | 1)
insert into componente_valor_admitido(id_componente, id_valor) values(28, 23);
insert into componente_valor_admitido(id_componente, id_valor) values(28, 24);
--final: (#all | List of (list | union | restriction | extension))
insert into componente_valor_admitido(id_componente, id_valor) values(29, 16);
insert into componente_valor_admitido(id_componente, id_valor) values(30, 25);
insert into componente_valor_admitido(id_componente, id_valor) values(30, 26);
insert into componente_valor_admitido(id_componente, id_valor) values(30, 17);
insert into componente_valor_admitido(id_componente, id_valor) values(30, 18);

--Estructura
insert into estructura(name, type, anyAttribute) values('attribute',        0, 0);
insert into estructura(name, type, anyAttribute) values('element',          0, 0);
insert into estructura(name, type, anyAttribute) values('complexType',      1, 0);
insert into estructura(name, type, anyAttribute) values('simpleContent',    1, 0);
insert into estructura(name, type, anyAttribute) values('restriction',      1, 0);
insert into estructura(name, type, anyAttribute) values('extension',        1, 0);
insert into estructura(name, type, anyAttribute) values('complexContent',   1, 0);
insert into estructura(name, type, anyAttribute) values('openContent',      1, 0);
insert into estructura(name, type, anyAttribute) values('attributeGroup',   0, 0);
insert into estructura(name, type, anyAttribute) values('group',            0, 0);
insert into estructura(name, type, anyAttribute) values('all',              1, 0);
insert into estructura(name, type, anyAttribute) values('choice',           1, 0);
insert into estructura(name, type, anyAttribute) values('sequence',         1, 0);
insert into estructura(name, type, anyAttribute) values('simpleType',       1, 0);
insert into estructura(name, type, anyAttribute) values('list',             1, 0);
insert into estructura(name, type, anyAttribute) values('union',            1, 0);
insert into estructura(name, type, anyAttribute) values('any',              1, 0);

--Estructa Componentes
--attribute
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 1,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 2,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 3,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 4,      'optional');
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 5,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 6,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 7,      'false');
insert into estructura_componentes(id_estructura, id_componente, default) values(1, 8,      null);
--element
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 9,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 10,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 11,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 4,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 1,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 12,     'false');
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 5,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 6,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 13,     '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 14,     '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 15,     '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 16,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 17,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 18,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 19,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(2, 20,     null);
--complexType
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 9,      'false');
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 21,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 22,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 18,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 19,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 1,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 23,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(3, 24,     'true');
--simpleContent
insert into estructura_componentes(id_estructura, id_componente, default) values(4, 1,      null);
--restriction
insert into estructura_componentes(id_estructura, id_componente, default) values(5, 25,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(5, 1,      null);
--extension
insert into estructura_componentes(id_estructura, id_componente, default) values(6, 25,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(6, 1,      null);
--complexContent
insert into estructura_componentes(id_estructura, id_componente, default) values(7, 25,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(7, 1,      null);
--openContent
insert into estructura_componentes(id_estructura, id_componente, default) values(8, 1,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(8, 26,     'interleave');
--attributeGroup
insert into estructura_componentes(id_estructura, id_componente, default) values(9, 1,      null);
insert into estructura_componentes(id_estructura, id_componente, default) values(9, 5,      null);
--group
insert into estructura_componentes(id_estructura, id_componente, default) values(10, 1,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(10, 13,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(10, 14,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(10, 15,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(10, 15,    null);
insert into estructura_componentes(id_estructura, id_componente, default) values(10, 5,     null);
--all
insert into estructura_componentes(id_estructura, id_componente, default) values(11, 27,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(11, 28,    '1');
--choice
insert into estructura_componentes(id_estructura, id_componente, default) values(12, 1,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(12, 13,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(12, 14,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(12, 15,    '1');
--sequence
insert into estructura_componentes(id_estructura, id_componente, default) values(13, 1,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(13, 13,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(13, 14,    '1');
insert into estructura_componentes(id_estructura, id_componente, default) values(13, 15,    '1');
--simpleType
insert into estructura_componentes(id_estructura, id_componente, default) values(14, 1,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(14, 29,    null);
insert into estructura_componentes(id_estructura, id_componente, default) values(14, 30,    null);
--list
insert into estructura_componentes(id_estructura, id_componente, default) values(15, 1,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(15, 31,    null);
--union
insert into estructura_componentes(id_estructura, id_componente, default) values(16, 1,     null);
insert into estructura_componentes(id_estructura, id_componente, default) values(16, 32,    null);
--any
insert into estructura_componentes(id_estructura, id_componente, default) values(17, 1,    null);
insert into estructura_componentes(id_estructura, id_componente, default) values(17, 1,    null);
--
--
--
--

/*
<attribute
  default = string
  fixed = string
  form = (qualified | unqualified)
  id = ID
  name = NCName
  ref = QName
  targetNamespace = anyURI
  type = QName
  use = (optional | prohibited | required) : optional
  inheritable = boolean
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, simpleType?)
</attribute>
*/

/*
<element
  abstract = boolean : false
  block = (#all | List of (extension | restriction | substitution))
  default = string
  final = (#all | List of (extension | restriction))
  fixed = string
  form = (qualified | unqualified)
  id = ID
  maxOccurs = (nonNegativeInteger | unbounded)  : 1
  minOccurs = nonNegativeInteger : 1
  name = NCName
  nillable = boolean : false
  ref = QName
  substitutionGroup = List of QName
  targetNamespace = anyURI
  type = QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, ((simpleType | complexType)?, alternative*, (unique | key | keyref)*))
</element>
*/

/*
<simpleType
  final = (#all | List of (list | union | restriction | extension))
  id = ID
  name = NCName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (restriction | list | union))
</simpleType>
<restriction
  base = QName
  id = ID
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (simpleType?, (minExclusive | minInclusive | maxExclusive | maxInclusive | totalDigits | fractionDigits | length | minLength | maxLength | enumeration | whiteSpace | pattern | assertion | explicitTimezone | {any with namespace: ##other})*))
</restriction>
<list
  id = ID
  itemType = QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, simpleType?)
</list>
<union
  id = ID
  memberTypes = List of QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, simpleType*)
</union>
*/

/*
<complexType
  abstract = boolean : false
  block = (#all | List of (extension | restriction))
  final = (#all | List of (extension | restriction))
  id = ID
  mixed = boolean
  name = NCName
  defaultAttributesApply = boolean : true
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (simpleContent | complexContent | (openContent?, (group | all | choice | sequence)?, ((attribute | attributeGroup)*, anyAttribute?), assert*)))
</complexType>
    <simpleContent
      id = ID
      {any attributes with non-schema namespace . . .}>
      Content: (annotation?, (restriction | extension))
    </simpleContent>
            <restriction
              base = QName
              id = ID
              {any attributes with non-schema namespace . . .}>
              Content: (annotation?, (simpleType?, (minExclusive | minInclusive | maxExclusive | maxInclusive | totalDigits | fractionDigits | length | minLength | maxLength | enumeration | whiteSpace | pattern | assertion | {any with namespace: ##other})*)?, ((attribute | attributeGroup)*, anyAttribute?), assert*)
            </restriction>
            <extension
              base = QName
              id = ID
              {any attributes with non-schema namespace . . .}>
              Content: (annotation?, ((attribute | attributeGroup)*, anyAttribute?), assert*)
            </extension>
    <complexContent
      id = ID
      mixed = boolean
      {any attributes with non-schema namespace . . .}>
      Content: (annotation?, (restriction | extension))
    </complexContent>
            <restriction
              base = QName
              id = ID
              {any attributes with non-schema namespace . . .}>
              Content: (annotation?, openContent?, (group | all | choice | sequence)?, ((attribute | attributeGroup)*, anyAttribute?), assert*)
            </restriction>
            <extension
              base = QName
              id = ID
              {any attributes with non-schema namespace . . .}>
              Content: (annotation?, openContent?, ((group | all | choice | sequence)?, ((attribute | attributeGroup)*, anyAttribute?), assert*))
            </extension>
                    <openContent
                      id = ID
                      mode = (none | interleave | suffix) : interleave
                      {any attributes with non-schema namespace . . .}>
                      Content: (annotation?, any?)
                    </openContent>
    <attributeGroup
      id = ID
      ref = QName
      {any attributes with non-schema namespace . . .}>
      Content: (annotation?)
    </attributeGroup>
*/

/*
<attributeGroup
  id = ID
  name = NCName
  ref = QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, ((attribute | attributeGroup)*, anyAttribute?))
</attributeGroup>
*/

/*
<group
  id = ID
  maxOccurs = (nonNegativeInteger | unbounded)  : 1
  minOccurs = nonNegativeInteger : 1
  name = NCName
  ref = QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (all | choice | sequence)?)
</group>
*/

/*
Model group
<all
  id = ID
  maxOccurs = (0 | 1) : 1
  minOccurs = (0 | 1) : 1
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (element | any | group)*)
</all>
<choice
  id = ID
  maxOccurs = (nonNegativeInteger | unbounded)  : 1
  minOccurs = nonNegativeInteger : 1
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (element | group | choice | sequence | any)*)
</choice>
<sequence
  id = ID
  maxOccurs = (nonNegativeInteger | unbounded)  : 1
  minOccurs = nonNegativeInteger : 1
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (element | group | choice | sequence | any)*)
</sequence>
*/

/*
<any
  id = ID
  maxOccurs = (nonNegativeInteger | unbounded)  : 1
  minOccurs = nonNegativeInteger : 1
  namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) )
  notNamespace = List of (anyURI | (##targetNamespace | ##local))
  notQName = List of (QName | (##defined | ##definedSibling))
  processContents = (lax | skip | strict) : strict
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</any>
*/

/*
<anyAttribute
  id = ID
  namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) )
  notNamespace = List of (anyURI | (##targetNamespace | ##local))
  notQName = List of (QName | ##defined)
  processContents = (lax | skip | strict) : strict
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</anyAttribute>
*/

/*
<unique
  id = ID
  name = NCName
  ref = QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (selector, field+)?)
</unique>
<key
  id = ID
  name = NCName
  ref = QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (selector, field+)?)
</key>
<keyref
  id = ID
  name = NCName
  ref = QName
  refer = QName
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (selector, field+)?)
</keyref>
<selector
  id = ID
  xpath = a subset of XPath expression, see below
  xpathDefaultNamespace = (anyURI | (##defaultNamespace | ##targetNamespace | ##local))
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</selector>
<field
  id = ID
  xpath = a subset of XPath expression, see below
  xpathDefaultNamespace = (anyURI | (##defaultNamespace | ##targetNamespace | ##local))
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</field>
*/

/*
<alternative
  id = ID
  test = an XPath expression
  type = QName
  xpathDefaultNamespace = (anyURI | (##defaultNamespace | ##targetNamespace | ##local))
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, (simpleType | complexType)?)
</alternative>
*/

/*
<assert
  id = ID
  test = an XPath expression
  xpathDefaultNamespace = (anyURI | (##defaultNamespace | ##targetNamespace | ##local))
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</assert>
*/

/*
<notation
  id = ID
  name = NCName
  public = token
  system = anyURI
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</notation>
*/

/*
<annotation
  id = ID
  {any attributes with non-schema namespace . . .}>
  Content: (appinfo | documentation)*
</annotation>
<appinfo
  source = anyURI
  {any attributes with non-schema namespace . . .}>
  Content: ({any})*
</appinfo>
<documentation
  source = anyURI
  xml:lang = language
  {any attributes with non-schema namespace . . .}>
  Content: ({any})*
</documentation>
*/

/*
<schema
  attributeFormDefault = (qualified | unqualified) : unqualified
  blockDefault = (#all | List of (extension | restriction | substitution))  : ''
  defaultAttributes = QName
  xpathDefaultNamespace = (anyURI | (##defaultNamespace | ##targetNamespace | ##local))  : ##local
  elementFormDefault = (qualified | unqualified) : unqualified
  finalDefault = (#all | List of (extension | restriction | list | union))  : ''
  id = ID
  targetNamespace = anyURI
  version = token
  xml:lang = language
  {any attributes with non-schema namespace . . .}>
  Content: ((include | import | redefine | override | annotation)*, (defaultOpenContent, annotation*)?, ((simpleType | complexType | group | attributeGroup | element | attribute | notation), annotation*)*)
</schema>
<defaultOpenContent
  appliesToEmpty = boolean : false
  id = ID
  mode = (interleave | suffix) : interleave
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?, any)
</defaultOpenContent>
*/

/*
<include
  id = ID
  schemaLocation = anyURI
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</include>
*/

/*
<redefine
  id = ID
  schemaLocation = anyURI
  {any attributes with non-schema namespace . . .}>
  Content: (annotation | (simpleType | complexType | group | attributeGroup))*
</redefine>
*/

/*
<override
  id = ID
  schemaLocation = anyURI
  {any attributes with non-schema namespace . . .}>
  Content: (annotation | (simpleType | complexType | group | attributeGroup | element | attribute | notation))*
</override>
*/

/*
<import
  id = ID
  namespace = anyURI
  schemaLocation = anyURI
  {any attributes with non-schema namespace . . .}>
  Content: (annotation?)
</import>
*/
