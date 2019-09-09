-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 28, 2019 at 06:20 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_info`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Mothers_Name` varchar(50) NOT NULL,
  `Fathers_Name` varchar(50) NOT NULL,
  `DOB` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Blood_Group` varchar(50) NOT NULL,
  `Year_Of_Admission` int(50) NOT NULL,
  `STD` varchar(50) NOT NULL,
  `ADDRESS` varchar(50) NOT NULL,
  `School_House` varchar(50) NOT NULL,
  `User_Name` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Name`, `Mothers_Name`, `Fathers_Name`, `DOB`, `Gender`, `Blood_Group`, `Year_Of_Admission`, `STD`, `ADDRESS`, `School_House`, `User_Name`, `Password`) VALUES
(18, 'Anuj Pathak', 'Nupur Pathak', 'Nilkhanth Pathak', '7/11/08', 'male', 'AB-', 2016, 'VI', '17/B/ Mona LaneKolkata-700196', 'Red', 'Anuj@567', '4567'),
(19, 'Sohini Nandi', 'Komal Sarkar', 'Brijmohan Das', '7/02/10', 'female', 'O-', 2017, 'IV', '20/CNupur Lane Kolkata-700018', 'Blue', 'Sohini@567', '1234'),
(21, 'Komal Jha', 'Aayushee Jha', 'Mukul Jha', '5/12/06', 'female', 'AB-', 2015, 'IX', '21/C Nohita Lane Kolkata-700016', 'Red', 'Komal@589', '5678'),
(23, 'Uday Singh', 'Simran Kaur', 'Shakti Singh', '21/08/09', 'male', 'AB-', 2014, 'V', '21/B Kutub Lane Kolkata-700016', 'Red', 'Uday@345', '1245'),
(24, 'Akshay Kumar', 'Sarmistha Jha', 'Pappu Singh', '2/12/06', 'male', 'A+', 2013, 'VIII', '25/C New Market Kolkata-700016', 'Yellow', 'Akshay@123', '8901'),
(26, 'Ankur Kumar', 'Anita Devi', 'Anuj Bhatia', '7/3/12', 'male', 'AB+', 2018, 'II', '16/C Shakespeare Sarani Kolkata-700017', 'Blue', 'Ankur@678', '5678'),
(27, 'Syed Ahmed', 'Nusrat Begam', 'Mohammad Ysusf', '11/10/11', 'male', 'B-', 2017, 'III', '23/C/21 Mathpukur Kolkata-700015', 'Green', 'Syed@126', '8904'),
(28, 'Nisrat Ahmed', 'Ruhuina Begum', 'Sharookh Raza', '11/23/05', 'female', 'A+', 2010, 'IX', '23/C Topsia Lane Kolkata-700016', 'Green', 'Nisrat@345', '1589'),
(29, 'Aayushee Gautam', 'Neha Sharma', 'Ayan Das', '7/5/10', 'female', 'O+', 2015, 'V', '56/B Kalighat Kolkata-700012', 'Yellow', 'Aayushee@874', '3567'),
(30, 'Shreya Das', 'Sharmistha Das', 'Kartik das', '3/14/11', 'female', 'O+', 2016, 'III', '19/C M O Lane Kolkata-700010', 'Blue', 'Shreya @678', '3790'),
(31, 'Amit Kumar', 'Sabita Kumari', 'Abhishek Jha', '7/6/10', 'male', 'A-', 2016, 'V', '19/B Samsul Huda Road Kolkata-700017', 'Green', 'Riya@589', '2845'),
(32, 'Supriya Kumari', 'Riya  Devi', 'Gagan Gaurav', '1/9/08', 'female', 'B-', 2017, 'VI', '45/V D.O Lane Kolkata-700015', 'Green', 'Riya@517', '2867'),
(34, 'Nidhi Kumari', 'Sonam Sinha', 'Shatrugan Sinha', '7/3/07', 'female', 'A-', 2016, 'VII', '34/ B / D O Lane Kolkata-700145', 'Green', 'Nidhi_2', '1224');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
