
-- Comenzamos con CRUD: creatte(insertar), read(leer), update(actualizar), delete(eliminar)
-- Listar los estudiantes (read)
SELECT * FROM estudiantes.estudiantes2022;
-- Insertar estudiante
INSERT INTO estudiantes.estudiantes2022(nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "261254684", "jperez@gmail.com");
-- Update estudiantes
UPDATE estudiantes.estudiantes2022 SET nombre="Juan Carlos", apellido="Garcia" WHERE idestudiantes= 1;
-- Delete estudiante
DELETE FROM estudiantes.estudiantes2022 WHERE idestudiantes2022 = 6;
-- veremos como cambiar el id, pero no es aconsejable, nunca se hace
-- para ello borramos los id que nos queden
-- pra modificar el idestudiantes2022 y comience en 1 usamos el siguiente codigo
-- Puede llegar a hacerse en un comienzo o cuando se esta iniciando la tabla, pero no se hace 
ALTER TABLE estudiantes.estudiantes2022 AUTO_INCREMENT = 1;



