-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: animedb
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `names`
--

DROP TABLE IF EXISTS `names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `names` (
  `id` int DEFAULT NULL,
  `anime` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `names`
--

LOCK TABLES `names` WRITE;
/*!40000 ALTER TABLE `names` DISABLE KEYS */;
INSERT INTO `names` VALUES (1,'Naruto Shippuuden'),(2,'Shugo Chara'),(3,'BLEACH'),(4,'Naruto'),(7,'Gintama'),(10,'Hayate the Combat Butler! (S1 e S2)'),(11,'Natsume Yuujinchou'),(13,'Blue Exorcist'),(14,'Durarara!!'),(18,'Sword Art Online'),(19,'The World God Only Knows'),(28,'Saki'),(31,'Hunter x Hunter'),(33,'Attack on Titan'),(35,'Black Clover'),(38,'Another'),(44,'The Rising of the Shield Hero'),(49,'SKET Dance'),(52,'Squid Girl'),(57,'Re:ZERO -Starting Life in Another World-'),(58,'One Piece'),(61,'Fate/Zero'),(62,'JoJo\'s Bizzare Adventur'),(63,'Chihayafuru'),(64,'My Hero Academia'),(65,'Your lie in April'),(70,'is it Wrong to Try to Pick Up Girls in a Dungeors'),(71,'DARLING in the FRANXX'),(72,'Listen to Me, Girls, I?m Your Father'),(73,'BORUTO: NARUTO NEXT GENERATIONS'),(74,'Brave 10'),(76,'Food Wars! Shokugeki no Soma'),(94,'Akame ga Kill!'),(95,'RWBY'),(109,'Fairy Tail'),(118,'Log Horison'),(119,'Working!'),(120,'Overlord'),(121,'Rio Rainbow Gate'),(122,'Nisemonogatari'),(123,'HAIKYU!!'),(124,'My Little Monster'),(125,'Angel Beats'),(126,'KONOSUBA -God\'s blessing on this wonderful world'),(127,'Golden Time');
/*!40000 ALTER TABLE `names` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-07 15:33:01
