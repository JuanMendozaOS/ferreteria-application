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

-- PRODUCTOS
INSERT INTO ferreteria.producto (agrupacion_id, porcentaje_ganancia, precio_compra, precio_venta, stock_minimo, proveedor_id, descripcion, nombre, unidad_medida_id, tipo_iva) VALUES(1, 10, 3150, 3500, 10, 1, 'Cable Tipo 6-A 3M', 'Cable Coaxial', 'UNI', 10);
INSERT INTO ferreteria.producto (agrupacion_id, porcentaje_ganancia, precio_compra, precio_venta, stock_minimo, proveedor_id, descripcion, nombre, unidad_medida_id, tipo_iva) VALUES(2, 25, 2250, 3000, 2, 2, 'Balde de pintura Roja Arcoiris 1L', 'Pintura Roja', 'UNI', 5);

-- FACTURAS
INSERT INTO ferreteria.factura (fecha, importe_total_comprobante, importe_total_exenta, importe_total_iva10, importe_total_iva5, cliente_id, condicion_pago) VALUES(current_date, 10000, 0, 7000, 3000, 1, 'CONTADO');

-- DETALLES FACTURA
INSERT INTO ferreteria.factura_detalle (cantidad, importe_total_exenta, importe_total_iva10, importe_total_iva5, item, precio_unitario, factura_id, producto_id) VALUES(2, 0, 7000, 0, 1, 3500, 1, 1);
INSERT INTO ferreteria.factura_detalle (cantidad, importe_total_exenta, importe_total_iva10, importe_total_iva5, item, precio_unitario, factura_id, producto_id) VALUES(1, 0, 0, 3000, 2, 3000, 1, 2);
