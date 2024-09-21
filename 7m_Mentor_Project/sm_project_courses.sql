CREATE DATABASE  IF NOT EXISTS `sm_project` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sm_project`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sm_project
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  `instructor` varchar(250) DEFAULT NULL,
  `experience` varchar(250) DEFAULT NULL,
  `instructor_info` varchar(250) DEFAULT NULL,
  `img` varchar(250) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `postedAt` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'Learn Spring Boot Framework in 100 steps','This is a good course for spring developer','Anil Giri','Ex-Amazon','Corporate experience of 20 years','https://i.pinimg.com/564x/bd/e9/75/bde975558b82fd6c2cb9c8e2a15339fc.jpg',252,'2024-08-14 14:15:55'),(2,'Core Java','This HTML course for web developers provides a solid overview for developers','Anil Giri','Ex-Amazon, Microsoft','Corporate experience of 20 years','https://i.pinimg.com/736x/3a/ca/99/3aca99010ca8a1508ad9ceaba64b941b.jpg',1500,'2024-08-14 14:15:55'),(3,'Learn HTML','React JS is a JavaScript library used for building user interfaces','Anil Giri','Ex-Amazon','Corporate experience of 20 years','https://i.pinimg.com/564x/ca/e1/b4/cae1b4f6b223fe5a7bb712b680cffa67.jpg',1200,'2024-08-14 14:15:55'),(4,'Programming with JavaScript','Python Programming is a high-level, interpreted programming language','Komal Ghodekar','Ex-Amazon, Wipro','Instructor has real experience in IT industry','https://i.pinimg.com/564x/e7/97/a8/e797a8c593c81d72f395d1ccc022ba3f.jpg',1500,'2024-08-14 14:15:55'),(5,'Python Programming','JavaScript is the programming language that powers the modern web','Priya Gupta','Ex-Amazon, Wipro','Instructor has real experience in IT industry','https://i.pinimg.com/564x/64/79/b9/6479b9448caa384c54cdeceb1578b5ae.jpg',2500,'2024-08-14 14:15:55'),(6,'Bootstrap','Core Java covers the basic concepts of the Java programming language','Nisha','Ex-Amazon, Microsoft','Instructor has real experience in IT industry','https://i.pinimg.com/564x/73/84/41/7384412324c769e447d3c4f86e9ff068.jpg',2000,'2024-08-14 14:15:55'),(7,'React JS','C++ is a high-level, general-purpose programming language','Anil Giri','Ex-Amazon','Corporate experience of 20 years','https://i.pinimg.com/564x/9b/4e/e0/9b4ee057076232fb57c48cf80947f8a7.jpg',600,'2024-08-14 14:15:55'),(8,'C++','Bootstrap is a free and open-source front-end framework','Priya Gupta','Ex-Amazon, Wipro','Instructor has real experience in IT industry','https://i.pinimg.com/736x/6a/77/28/6a77285d469be8bd8d0d72b939fcc9a4.jpg',1000,'2024-08-14 14:15:55');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-13 14:43:24
