/*
SQLyog Community Edition- MySQL GUI v8.04 
MySQL - 5.0.37-community-nt : Database - training9
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`training9` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `training9`;

/*Table structure for table `userdata` */

DROP TABLE IF EXISTS `userdata`;

CREATE TABLE `userdata` (
  `userName` varchar(20) default NULL,
  `userPassword` varchar(20) default NULL,
  `userCity` varchar(20) default NULL,
  `userAge` decimal(10,0) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userdata` */

insert  into `userdata`(`userName`,`userPassword`,`userCity`,`userAge`) values ('Gaurav','12345','indore','21'),('ram','123','dhar','20'),('shyam','123456','ujjain','25'),('john','1234','indore','22');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
