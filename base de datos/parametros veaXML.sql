--Propiedades
insert into propiedad(propiedad, valor) values('programa.ejecucion_primera', '0');
--0 Si
--1 No
insert into propiedad(propiedad, valor) values('ventana.maximizada', '0');
--0 Si
--1 No
insert into propiedad(propiedad, valor) values('ventana.posicion.x', null);
insert into propiedad(propiedad, valor) values('ventana.posicion.y', null);
insert into propiedad(propiedad, valor) values('ventana.ancho', null);
insert into propiedad(propiedad, valor) values('ventana.alto', null);
insert into propiedad(propiedad, valor) values('programa.look_and_feel', 'Aluminium');
insert into propiedad(propiedad, valor) values('programa.tema', 'Default');
insert into propiedad(propiedad, valor) values('programa.idioma', 'es');
insert into propiedad(propiedad, valor) values('programa.actualizacion', 'automatica');
--automatica
--manual
insert into propiedad(propiedad, valor) values('programa.estado', 'abierto');
--abierto
--cerrado
    --si programa esta iniciando y encuentra el estado en abierto signifia que el
    --programa por alguna razon se cerro de forma inesperada

--Abiertos
insert into abiertos(documento) values(null);

--Historial
insert into historial(documento, accion) values(null, null);
