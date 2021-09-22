CREATE DATABASE  IF NOT EXISTS `ınventorymanagementsystem` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ınventorymanagementsystem`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: ınventorymanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `idInventory` int NOT NULL AUTO_INCREMENT,
  `Company_name` varchar(45) NOT NULL,
  `Company_Branch` varchar(45) NOT NULL,
  `Company_Location` varchar(45) NOT NULL,
  `Company_Slogan` text NOT NULL,
  PRIMARY KEY (`idInventory`),
  UNIQUE KEY `Company_name_UNIQUE` (`Company_name`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (0,'NESTLE','FOOD','Switzerland','Eat well, live happy'),(1,'TUKAS','FOOD','Turkey','Lezzetin en dogal hali'),(2,'COCA-COLA','BEVERAGE','USA','Open a Cover to Happiness'),(3,'LIPTON','BEVERAGE','Scotland','Drink positive'),(4,'ADIDAS','SPORTSWEAR','Germany','Impossible is Nothing'),(5,'NIKE','SPORTSWEAR','USA','Just Do It'),(6,'LG','ELECTRONIC','South Korea','Life\'s Good'),(7,'HP','ELECTRONIC','USA','Make it Matter'),(8,'HEAD&SHOULDERS','PERSONAL CARE','USA','Live head first'),(9,'ARIEL','PERSONAL CARE','UK','Wash and refresh'),(13,'Kunduz','Kunduz','Kunduz','KunduzKemir'),(14,'Klimacılık','BeyazKlima','Japan','ÜflerimUlen'),(15,'Beaverlar','Beaver','Beaver','Beaver');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `idOrder` int NOT NULL AUTO_INCREMENT,
  `Order_count` int NOT NULL,
  `OrderDate` varchar(255) NOT NULL,
  `OrderDescription` varchar(255) DEFAULT NULL,
  `id_inventory` int NOT NULL,
  PRIMARY KEY (`idOrder`),
  KEY `fk_Order_User1_idx` (`id_inventory`),
  CONSTRAINT `fk_Order_User1` FOREIGN KEY (`id_inventory`) REFERENCES `user` (`Inventory_idInventory`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (0,2,'2020-12-19','two chocolate with  pistachios',0),(1,5,'2020-12-23','five canned pickles',1),(2,7,'2020-12-29','seven light cola',2),(3,6,'2020-12-31','six cold tea',3),(4,2,'2021-01-05','two sneakers',4),(5,3,'2021-01-07','three airmax sneaker',5),(6,1,'2021-01-10','lg AI television',6),(7,2,'2021-01-12','HP HD screen',7),(8,5,'2021-01-12','Head&sh hair shampoo',8),(9,2,'2021-01-14','Ariel detergant with lavender',9),(10,1,'2021-01-10','chocolate good',0),(11,2,'2021-01-10','chocolate goodx2',0),(12,3,'2021-01-10','chocolateeee',0),(13,4,'2021-01-10','Yummy milk',0);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `idProducts` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Price` double NOT NULL,
  `Category` text NOT NULL,
  `Quantity` int NOT NULL,
  `Inventory_idInventory` int NOT NULL,
  PRIMARY KEY (`idProducts`,`Inventory_idInventory`),
  UNIQUE KEY `idProducts_UNIQUE` (`idProducts`),
  KEY `fk_Products_Inventory1_idx` (`Inventory_idInventory`),
  CONSTRAINT `fk_Products_Inventory1` FOREIGN KEY (`Inventory_idInventory`) REFERENCES `inventory` (`idInventory`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (3,'Ice Tea','cold tea',3.75,'BEVERAGE',29,3),(4,'Runfalcon Sneaker','orthopedic running shoes',553.67,'SPORTSWEAR',18,4),(5,'Airmax sneaker','basketball and walking shoes',679.25,'SPORTSWEAR',9,5),(6,'Nanocell AI TV','3d speakers and 4k image quality',7000.25,'ELECTRONIC',5,6),(7,'HP 25X SCREEN','full hd image quality and gaming performance',1725.47,'ELECTRONIC',7,7),(8,'Coconut Anti Dandruff','naturally flavored hair shampoo',18.23,'PERSONAL CARE',31,8),(9,'Ariel Lemon Detargent','dissolves dirt with its dense molecules',24.56,'PERSONAL CARE',13,9),(10,'Damak','chocolateeee',63.947437,' FOOD',3,0),(11,'Nesquick','Yummy milk',75.81584,' FOOD',4,0);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `idUser` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `birthdate` date NOT NULL,
  `address` text NOT NULL,
  `Inventory_idInventory` int NOT NULL,
  PRIMARY KEY (`idUser`,`Inventory_idInventory`),
  UNIQUE KEY `idUser_UNIQUE` (`idUser`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `fk_User_Inventory1_idx` (`Inventory_idInventory`),
  CONSTRAINT `fk_User_Inventory1` FOREIGN KEY (`Inventory_idInventory`) REFERENCES `inventory` (`idInventory`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (0,'admin','admin','efe123@yahoo.com','1997-12-07','Karabaglar',0),(1,'serkan123','lifeguard2016','lifeguard23@gmail.com','1999-09-06','Gumuldur',1),(2,'beaverkun','meseagaci69','beaverkun@outlook.com','1998-11-22','Balcova',2),(3,'bariszan49','bdemirel4961','bydemirel@hotmail.com','1998-12-09','Bayrakli',3),(4,'tomhanks21','tomhanks4236','tomh32@hotmail.com','1956-07-09','California',4),(5,'johnnydepp','johnnydepp21','pocjs@gmail.com','1963-06-09','Kentucky',5),(6,'keanureeves','keanureeves77','johnnysilverhand@gmail.com','1964-09-02','Beirut',6),(7,'keiraknightley','keirakn378','keiraknight@hotmail.com','1985-03-26','Teddington',7),(8,'margotrobbie','mgrob432','margorob@gmail.com','1990-07-02','Dalby',8),(9,'scarlettjohanson','scj2315','scjhavenger@outlook.com','1984-11-22','New York',9),(10,'Gokay','Gokay1903','g@gmail.com','1998-11-22','Izmır',13),(11,'Efe368','Efe368++','efeklima@gmail.com','1997-12-07','Asya',14),(12,'beaverchan','Gokay1903','gmail@gmail.com','1998-11-22','Izmır',15);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-10 17:07:15
