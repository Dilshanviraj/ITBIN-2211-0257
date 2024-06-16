-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 08:48 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `medicaleq`
--

CREATE TABLE `medicaleq` (
  `ItamID` int(20) NOT NULL,
  `ItamName` varchar(233) NOT NULL,
  `qty` int(200) NOT NULL,
  `Status` varchar(200) NOT NULL,
  `onePrice` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicaleq`
--

INSERT INTO `medicaleq` (`ItamID`, `ItamName`, `qty`, `Status`, `onePrice`) VALUES
(6, 'test2', 12, 'Active', 15),
(7, 'test3', 1520, 'Active', 40),
(8, 'test', 20, 'Active', 20);

-- --------------------------------------------------------

--
-- Table structure for table `medicalhp`
--

CREATE TABLE `medicalhp` (
  `ItamID` int(20) NOT NULL,
  `ItamName` varchar(233) NOT NULL,
  `qty` int(200) NOT NULL,
  `Status` varchar(200) NOT NULL,
  `onePrice` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicalhp`
--

INSERT INTO `medicalhp` (`ItamID`, `ItamName`, `qty`, `Status`, `onePrice`) VALUES
(1, 'Sustagen', 30, 'Active', 550);

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `ItamNumber` int(11) NOT NULL,
  `ItamName` varchar(233) NOT NULL,
  `qty` int(200) NOT NULL,
  `status` varchar(250) NOT NULL,
  `onePrice` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicine`
--

INSERT INTO `medicine` (`ItamNumber`, `ItamName`, `qty`, `status`, `onePrice`) VALUES
(5, 'panadol', 200, 'Active', 13),
(9, 'abc', 200, 'Active', 68),
(11, 'test', 10, 'Active', 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `medicaleq`
--
ALTER TABLE `medicaleq`
  ADD PRIMARY KEY (`ItamID`);

--
-- Indexes for table `medicalhp`
--
ALTER TABLE `medicalhp`
  ADD PRIMARY KEY (`ItamID`);

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`ItamNumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `medicaleq`
--
ALTER TABLE `medicaleq`
  MODIFY `ItamID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `medicalhp`
--
ALTER TABLE `medicalhp`
  MODIFY `ItamID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `medicine`
--
ALTER TABLE `medicine`
  MODIFY `ItamNumber` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
