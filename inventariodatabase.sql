/*
SQLyog Professional v13.1.1 (32 bit)
MySQL - 10.1.10-MariaDB : Database - inventariodatabase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`inventariodatabase` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `inventariodatabase`;

/*Table structure for table `entrada_t` */

DROP TABLE IF EXISTS `entrada_t`;

CREATE TABLE `entrada_t` (
  `id_entrada_t` int(50) NOT NULL AUTO_INCREMENT,
  `cantidad_t` int(50) NOT NULL,
  `descripcion_t` varchar(50) NOT NULL,
  `fecha_t` date NOT NULL,
  `hora_t` time NOT NULL,
  `id_inventario` int(50) NOT NULL,
  PRIMARY KEY (`id_entrada_t`),
  KEY `id_inventario` (`id_inventario`),
  CONSTRAINT `entrada_t_ibfk_1` FOREIGN KEY (`id_inventario`) REFERENCES `inventario_salont` (`id_inventario_t`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `entrada_t` */

insert  into `entrada_t`(`id_entrada_t`,`cantidad_t`,`descripcion_t`,`fecha_t`,`hora_t`,`id_inventario`) values 
(1,4,'donacion','2019-10-02','05:00:00',1);

/*Table structure for table `inventario_salont` */

DROP TABLE IF EXISTS `inventario_salont`;

CREATE TABLE `inventario_salont` (
  `id_inventario_t` int(50) NOT NULL AUTO_INCREMENT,
  `cantidad_t` int(50) DEFAULT NULL,
  `id_producto_t` int(50) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id_inventario_t`),
  KEY `id_producto_t` (`id_producto_t`),
  CONSTRAINT `inventario_salont_ibfk_1` FOREIGN KEY (`id_producto_t`) REFERENCES `producto_salonteatro` (`id_producto_t`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `inventario_salont` */

insert  into `inventario_salont`(`id_inventario_t`,`cantidad_t`,`id_producto_t`,`fecha`) values 
(1,4,4,'2019-10-02'),
(2,4,5,'2019-10-03');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `num_doc` int(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  PRIMARY KEY (`num_doc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`num_doc`,`nombre`,`correo`,`contraseña`) values 
(1,'1','1','1'),
(1002160694,'Alvaro sa','e@gamil.com','111');

/*Table structure for table `producto_salonteatro` */

DROP TABLE IF EXISTS `producto_salonteatro`;

CREATE TABLE `producto_salonteatro` (
  `id_producto_t` int(50) NOT NULL AUTO_INCREMENT,
  `nombre_ot` varchar(50) NOT NULL,
  `referencia_ot` varchar(50) NOT NULL,
  `descripcion_t` varchar(50) NOT NULL,
  `tipo_t` varchar(50) NOT NULL,
  PRIMARY KEY (`id_producto_t`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `producto_salonteatro` */

insert  into `producto_salonteatro`(`id_producto_t`,`nombre_ot`,`referencia_ot`,`descripcion_t`,`tipo_t`) values 
(4,'microfono','44','negro','inalia'),
(5,'12','12','12','12'),
(6,'microfono','44','negro','inali');

/*Table structure for table `salida_t` */

DROP TABLE IF EXISTS `salida_t`;

CREATE TABLE `salida_t` (
  `id_salida_t` int(50) NOT NULL AUTO_INCREMENT,
  `cantidad_t` int(50) NOT NULL,
  `descripcion_t` varchar(50) NOT NULL,
  `fecha_t` date NOT NULL,
  `hora_t` time NOT NULL,
  `id_inventario` int(50) NOT NULL,
  PRIMARY KEY (`id_salida_t`),
  KEY `salida_t_ibfk_1` (`id_inventario`),
  CONSTRAINT `salida_t_ibfk_1` FOREIGN KEY (`id_inventario`) REFERENCES `inventario_salont` (`id_inventario_t`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `salida_t` */

insert  into `salida_t`(`id_salida_t`,`cantidad_t`,`descripcion_t`,`fecha_t`,`hora_t`,`id_inventario`) values 
(1,4,'robo','2019-10-17','04:00:00',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
