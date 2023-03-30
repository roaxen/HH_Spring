drop database if exists HH;
CREATE DATABASE HH;
use HH;

create table aboutus(
id int primary key auto_increment,
nombre varchar(255),
apellido1 varchar(255),
apellido2 varchar(255),
descripcion text,
imagen blob 
);
INSERT INTO aboutus VALUES ('1','Alejandro','Pico','Perez','El que ni sabe ni entiende',null);
INSERT INTO aboutus VALUES ('2','Manuel','albarez','Perez','El que ni sabe ni entiende',null);


-- --------------------------------------- entidades
create table usuario(
email varchar(50) primary key,
clave varchar(32),
nombre varchar(50),
apellidos varchar(50),
fecha_nac date,
ciudad varchar(50)
);

INSERT INTO usuario (email, clave, nombre, apellidos, fecha_nac, ciudad)
VALUES ('admin', '202cb962ac59075b964b07152d234b70', 'Manuel', 'Alvarez Duran ', '1993-09-06', 'Barcelona');


create table tipolugar(
id_tipolugar int primary key,
descripcion varchar(50)
);
INSERT INTO tipolugar (id_tipolugar, descripcion)
VALUES 
(1,'Baños Publicos '),
(2,'Fuentes'),
(3, 'Albergues'),
(4, 'Comedor'),
(5, 'Hospital'),
(6, 'CAP (Centro Atencion Primaria)'),
(7, 'Iglesias'),
(8, 'Narcosalas (S.Consumo Supervisado)'),
(99,'Otros');



create table lugar(
id_lugar int primary key auto_increment,
id_tipolugar int(50),
ubicacion varchar(50),
email_responsable varchar(50),
telefono int,
valoracion int,
descripcion text,
constraint fk_lugarusuario foreign key (email_responsable) references usuario(email),
constraint fk_lugar_tipolugar foreign key (id_tipolugar) references tipolugar(id_tipolugar)
);
/*
create table ofertaempleo(
id_oferta int,
email_creador varchar(50),
titulo varchar(50),
lugar varchar(50),
mensaje varchar(50),
primary key(id_oferta),
constraint fk_ofertaemail foreign key (email_creador) references usuario (email)
);
*/

create table favoritos(
email varchar(50),
id_lugar int,
primary key (email,id_lugar),
constraint buscanusuario foreign key (email) references usuario(email),
constraint buscanlugar foreign key (id_lugar) references lugar(id_lugar)
);

/*
create table valoran(
email varchar(50),
id_lugar int,
fecha_valoracion date,
puntuacion int,
descripcion varchar(50),
primary key (email,id_lugar,fecha_valoracion),
constraint fk_valoran_email foreign key (email) references usuario(email),
constraint fk_valoran_lugar foreign key (id_lugar) references lugar(id_lugar)
);

create table hablan(
email varchar(50),
email_oferta varchar(50),
fecha_conversacion date,
mensaje text,
primary key (email, email_oferta, fecha_conversacion),
constraint fk_hablan_email foreign key (email) references usuario(email),
constraint fk_hablan_creador foreign key (email_oferta) references usuario(email)
);

create table consultar(
email_usuario varchar(50),
id_oferta int,
fecha_consulta date,
primary key(email_usuario,id_oferta,fecha_consulta),
constraint consultarusuario foreign key(email_usuario) references usuario(email),
constraint consultarofertaempleo foreign key (id_oferta) references ofertaempleo(id_oferta)
);
*/
