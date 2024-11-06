-- MySQL dump 10.13  Distrib 8.0.39, for Win64 (x86_64)
--
-- Host: localhost    Database: employee_management
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `house_number` varchar(255) DEFAULT NULL,
  `pin_code` int NOT NULL,
  `street` varchar(255) DEFAULT NULL,
  `employee_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKq95h5xhq4by6gadnvlkvtbewl` (`employee_id`),
  CONSTRAINT `FKq95h5xhq4by6gadnvlkvtbewl` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Bhilwara','3-B-12',0,'New Housing Board, Shastri Nagar','E0001'),(2,'Bhilwara','6-D-56',0,'New Housing Board, Shastri Nagar','E0001'),(3,'Jaipur','12-A-34',0,'Green Park, Sector 15','E0002'),(4,'Jaipur','45-B-67',0,'Blue Valley, Sector 22','E0002'),(5,'Mumbai','78-C-90',0,'Sunrise Apartments, MG Road','E0003'),(6,'Mumbai','23-D-45',0,'Sunset Boulevard, Andheri West','E0003'),(7,'Chandigarh','56-E-78',0,'Rose Garden, Sector 10','E0004'),(8,'Chandigarh','89-F-12',0,'Lotus Enclave, Sector 20','E0004'),(9,'Bhilwara','3-B-12',0,'New Housing Board, Shastri Nagar','E0005'),(10,'Bhilwara','6-D-56',0,'New Housing Board, Shastri Nagar','E0005'),(11,'Bhilwara','3-B-12',0,'New Housing Board, Shastri Nagar','E0006'),(12,'Bhilwara','6-D-56',0,'New Housing Board, Shastri Nagar','E0006'),(13,'Bhilwara','3-B-12',0,'New Housing Board, Shastri Nagar','E0007');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('D001','Full-Stack Developer'),('D002','Data Analyst'),('D003','Project Manager'),('D004','Human Resources'),('D005','ProjectLeader');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` enum('Female','Male','PreferNotToSay') DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_number` bigint NOT NULL,
  `department_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8if1byloc650qvkaxabyjveap` (`department_id`),
  CONSTRAINT `FK8if1byloc650qvkaxabyjveap` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('E0001','abhinandan.jain@worldline.com','Abhinandan','Male','Jain',9414103716,'D001'),('E0002','priya.sharma@example.com','Priya','Female','Sharma',9876543210,'D002'),('E0003','rohan.verma@example.com','Rohan','Male','Verma',9123456789,'D003'),('E0004','anjali.kumar@example.com','Anjali','Female','Kumar',9988776655,'D004'),('E0005','abhinandan.jain@google.com','Abhinandan','Male','Jain',9414103716,'D005'),('E0006','bhavya.jain@medBeans.com','Bhavya','Male','Jain',7014745310,'D003'),('E0007','Hitanshi.jain@medBeans.com','Hitanshi','Female','Jain',7976610646,'D003');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-06 16:52:43
