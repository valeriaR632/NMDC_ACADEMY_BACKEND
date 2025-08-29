USE `NMDC-Proyect`;

SHOW TABLES;

SELECT * FROM Usuario; 

INSERT INTO Usuario
VALUES (null, "Valeria", "Rojas", "2338273612", "valee@gmail.com"),
(null, "Lilia", "Cárdenas", "1263525162", "lili@gmail.com"),
(null, "Kassandra", "Negrete", "1372649727", "kass@gmail.com"),
(null, "María", "Moreno", "28482737273", "mari@gmail.com"),
(null, "Sofía", "Meza", "18472648276", "sofi@gmail.com");

DELETE FROM Usuario
WHERE idUsuario BETWEEN 6 AND 10;


SELECT * FROM Maestros;

ALTER TABLE Maestros
ADD COLUMN turno VARCHAR (100) NOT NULL;

INSERT INTO Maestros
VALUES (null, "Pablo","López", "326472746", "@pabloL", "Vespertino"), 
(null, "Indigo","Valenzuela", "6555384736", "@indigoV", "Fin de semana"), 
(null, "Zhevia","Kings", "8827462535", "@zheviakings", "Vespertino"), 
(null, "Kardan","Muñoz", "9987736453", "@kardanMuñoz", "Vespertino"),
(null, "Kennybyaa","A", "8765463746", "@kennybyaa", "Vespertino");

SELECT * FROM Clases;


INSERT INTO Clases
VALUES (null, "lunes de 18:00 a 19:30 hrs", "Hip-Hop", 15, 1),
(null, "Sábado y domingo de 11:00 a 12:15 hrs.", "Hip-Hop", 15, 2),
(null, "Jueves de 19:30 a 21:00 hrs.", "Heels", "15", 3),
(null, "Sábado de 12:15 a 13:30 hrs.", "Heels", "15", 3), 
(null, "Jueves de 18:00 a 19:00 hrs.", "Jazz", "15", 4),
(null, "Sábado de 13:39 a 14:45 hrs.", "Jazz", "15", 4);

SELECT * FROM Pago;

INSERT INTO Pago
VALUES (null, 130, "suelta", "2024-05-12 10:15:03");

INSERT INTO Pago
VALUES (null, 700, "anual", "2024-05-23 12:10:03"),
(null, 130, "suelta", "2024-06-1 13:50:00"),
(null, 700, "anual", "2025-01-12 11:23:03"),
(null, 130, "suelta", "2025-01-12 16:15:04"),
(null, 700, "anual", "2025-02-14 16:00:03");
-- ------------------incripcion marca error
SELECT * FROM Inscripcion;
INSERT INTO Inscripcion
VALUES(null,1,2,"inscrito","2024-05-12 10:15:03",1);

DELETE FROM Inscripcion
WHERE idInscripcion =1;

INSERT INTO Inscripcion
VALUES (NULL, 1, 1, "inscrito", "2024-05-12 10:15:03", 1);
INSERT INTO Inscripcion
VALUES (NULL, 1, 1, "inscrito", "2024-05-12 10:15:03", 1);

