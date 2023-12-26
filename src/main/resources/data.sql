-- TIPOS DE CLIENTE
INSERT INTO ferreteria.tipo_cliente(id, descripcion) VALUES ('INDIVIDUAL', 'Persona física');
INSERT INTO ferreteria.tipo_cliente(id, descripcion) VALUES ('EMPRESA', 'Persona jurídica');

-- TIPOS DE DOCUMENTO
INSERT INTO ferreteria.tipo_documento(id, descripcion) VALUES ('CI', 'Cédula de Identidad paraguaya');
INSERT INTO ferreteria.tipo_documento(id, descripcion) VALUES ('RUC', 'Registro Único de Contribuyente');
INSERT INTO ferreteria.tipo_documento(id, descripcion) VALUES ('PASAPORTE', 'Pasaporte');

-- AGRUPACIONES
INSERT INTO ferreteria.agrupacion(descripcion) VALUES('Electricidad');
INSERT INTO ferreteria.agrupacion(descripcion) VALUES('Pintura');
INSERT INTO ferreteria.agrupacion(descripcion) VALUES('Mampostería');
INSERT INTO ferreteria.agrupacion(descripcion) VALUES('Herramientas');
INSERT INTO ferreteria.agrupacion(descripcion) VALUES('Cerámica y Construcción');
INSERT INTO ferreteria.agrupacion(descripcion) VALUES('Varios');

-- UNIDAD DE MEDIDA
INSERT INTO ferreteria.unidad_medida(id, descripcion) VALUES ('UNI', 'Unidad');
INSERT INTO ferreteria.unidad_medida(id, descripcion) VALUES ('KG', 'Kilogramos');

-- PROVEEDOR
INSERT INTO ferreteria.proveedor(nombre) VALUES ('MECHANIC');
INSERT INTO ferreteria.proveedor(nombre) VALUES ('RIDGID');

-- CLIENTES
INSERT INTO ferreteria.cliente (direccion, numero_celular, numero_documento, razon_social, telefono, tipo_cliente_id, tipo_documento_id) VALUES('Perú 218', '0981 111 222', '4390233', 'JUAN MENDOZA', '021 0983 3213', 'INDIVIDUAL', 'CI');
INSERT INTO ferreteria.cliente (direccion, numero_celular, numero_documento, razon_social, telefono, tipo_cliente_id, tipo_documento_id) VALUES('María Auxiliadora', '0981 999 123', '6034544', 'FRANCO PORTILLO', '021 2332 2323', 'INDIVIDUAL', 'CI');