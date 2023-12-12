-- TIPOS DE DOCUMENTO
INSERT INTO ferreteria.tipo_documento(id, descripcion) VALUES ('CI', 'Cédula de Identidad paraguaya');
INSERT INTO ferreteria.tipo_documento(id, descripcion) VALUES ('RUC', 'Registro Único de Contribuyente');
INSERT INTO ferreteria.tipo_documento(id, descripcion) VALUES ('PASAPORTE', 'Pasaporte');

-- TIPOS DE CLIENTE
INSERT INTO ferreteria.tipo_cliente (id, descripcion) VALUES ('INDIVIDUAL', 'Persona física');
INSERT INTO ferreteria.tipo_cliente (id, descripcion) VALUES ('EMPRESA', 'Persona jurídica');

-- AGRUPACIONES
INSERT INTO ferreteria.agrupacion (descripcion) VALUES('Electricidad');
INSERT INTO ferreteria.agrupacion (descripcion) VALUES('Pintura');
INSERT INTO ferreteria.agrupacion (descripcion) VALUES('Mampostería');
INSERT INTO ferreteria.agrupacion (descripcion) VALUES('Herramientas');
INSERT INTO ferreteria.agrupacion (descripcion) VALUES('Cerámica y Construcción');
INSERT INTO ferreteria.agrupacion (descripcion) VALUES('Varios');

-- UNIDAD DE MEDIDA
INSERT INTO ferreteria.unidad_medida (id, descripcion) VALUES ('UNI', 'Unidad');