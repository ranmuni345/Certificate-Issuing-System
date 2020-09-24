-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 24, 2020 at 07:57 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cert_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `death`
--

CREATE TABLE `death` (
  `Comment1` varchar(200) NOT NULL,
  `Comment2` varchar(200) NOT NULL,
  `Comment3` varchar(200) NOT NULL,
  `Comment4` varchar(200) NOT NULL,
  `Comment5` varchar(200) NOT NULL,
  `Comment6` varchar(200) NOT NULL,
  `Comment7` varchar(200) NOT NULL,
  `Comment8` varchar(200) NOT NULL,
  `Comment9` varchar(200) NOT NULL,
  `Comment10` varchar(200) NOT NULL,
  `Comment11` varchar(200) NOT NULL,
  `Comment12` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `death`
--

INSERT INTO `death` (`Comment1`, `Comment2`, `Comment3`, `Comment4`, `Comment5`, `Comment6`, `Comment7`, `Comment8`, `Comment9`, `Comment10`, `Comment11`, `Comment12`) VALUES
('Name1', 'bvh', '2019-12-23', 'cghcfh', 'cghc', 'gcgh', 'vhvcj', 'vhvvhj', 'vhjvj', '2324', '23', 'dhcgn'),
('janani yashodara gamage', 'janani yashodara gamage', '2020-01-17', 'gfh', 'janani yashodara gamage', 'janani yashodara gamage', 'kghk', 'test', 'test', '313', '1', 'tryuuyht'),
('janani yashodara gamage', 'janani yashodara gamage', '2020-01-17', 'gfh', 'janani yashodara gamage', 'janani yashodara gamage', 'kghk', 'test', 'test', '313', '1', 'tryuuyht'),
('janani yashodara gamage', 'janani yashodara gamage', '2020-01-17', 'gfh', 'janani yashodara gamage', 'janani yashodara gamage', 'kghk', 'test', 'test', '313', '1', 'tryuuyht');

-- --------------------------------------------------------

--
-- Table structure for table `feedbacks`
--

CREATE TABLE `feedbacks` (
  `ID` int(5) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `message` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedbacks`
--

INSERT INTO `feedbacks` (`ID`, `name`, `email`, `message`) VALUES
(9, 'Sandun', 'sandun@test.com', 'Test Feedback'),
(10, 'Test2', 'testmail2@mail.com', 'Test Feedback2'),
(11, 'hgfhj', 'dfgfgd@ddgh.hf', 'fdghchb');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `Firstname` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `City` varchar(200) NOT NULL,
  `State` varchar(200) NOT NULL,
  `Zip` varchar(200) NOT NULL,
  `Cardname` varchar(200) NOT NULL,
  `Cardnumber` varchar(200) NOT NULL,
  `Expmonth` varchar(200) NOT NULL,
  `Expyear` varchar(200) NOT NULL,
  `Cvv` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`Firstname`, `Email`, `Address`, `City`, `State`, `Zip`, `Cardname`, `Cardnumber`, `Expmonth`, `Expyear`, `Cvv`) VALUES
('hgfhj', 'dfgfgd@ddgh.hf', 'mnbm', 'nmb', 'bvjh', 'mb', 'mb', '765', 'jg', 'hhv', 'hvbn'),
('hgfhj', 'dfgfgd@ddgh.hf', 'mnbm', 'nmb', 'bvjh', 'mb', 'gfhf', 'kjk', 'kjh', 'kj', 'mhbj');

-- --------------------------------------------------------

--
-- Table structure for table `permittimbercut`
--

CREATE TABLE `permittimbercut` (
  `RequestID` int(5) NOT NULL,
  `Comment1` varchar(200) NOT NULL,
  `Comment2` varchar(200) NOT NULL,
  `Comment3` varchar(200) NOT NULL,
  `Id` varchar(200) NOT NULL,
  `Tel1` varchar(200) NOT NULL,
  `Tel2` varchar(200) NOT NULL,
  `Comment4` varchar(200) NOT NULL,
  `Comment5` varchar(200) NOT NULL,
  `Comment6` varchar(200) NOT NULL,
  `Comment7` varchar(200) NOT NULL,
  `Comment8` varchar(200) NOT NULL,
  `Comment9` varchar(200) NOT NULL,
  `Comment10` varchar(200) NOT NULL,
  `T` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `permittimbercut`
--

INSERT INTO `permittimbercut` (`RequestID`, `Comment1`, `Comment2`, `Comment3`, `Id`, `Tel1`, `Tel2`, `Comment4`, `Comment5`, `Comment6`, `Comment7`, `Comment8`, `Comment9`, `Comment10`, `T`) VALUES
(6, 'Test Lastname1', 'Test firstname1', 'Test Address', '12345', '0781111111011', '2222222', 'Test ownerr', 'Test land1', 'Test location1', 'Test type1', '11', 'No', 'No', 'on'),
(7, 'klnf\r\n', ',mn', ',mn', '99090', '0008', '8786', 'mnnb', 'mnnb', 'mnb', 'mhbj', 'mhb', 'mb', 'kbk', 'on'),
(8, 'klnf\r\n', ',mn', ',mn', '99090', '0008', '8786', 'mnnb', 'mnnb', 'mnb', 'mhbj', 'mhb', 'mb', 'kbk', 'on'),
(9, 'kjh', 'jhg', 'jg', 'b', '8687', '989', 'mg', 'jhg', 'mghs', 'jvj', 'jxm', 'jh', 'jh', 'on');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(5) NOT NULL,
  `Uname` varchar(20) NOT NULL,
  `Phone` varchar(10) NOT NULL,
  `Mail` varchar(30) NOT NULL,
  `Pword` varchar(20) NOT NULL,
  `Approval` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `Uname`, `Phone`, `Mail`, `Pword`, `Approval`) VALUES
(4, 'sandun', '0761111111', 'test@mail.com', 'qwerty', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `feedbacks`
--
ALTER TABLE `feedbacks`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `permittimbercut`
--
ALTER TABLE `permittimbercut`
  ADD PRIMARY KEY (`RequestID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Mail` (`Mail`),
  ADD UNIQUE KEY `Uname` (`Uname`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `feedbacks`
--
ALTER TABLE `feedbacks`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `permittimbercut`
--
ALTER TABLE `permittimbercut`
  MODIFY `RequestID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
