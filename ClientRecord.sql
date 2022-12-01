-- phpMyAdmin SQL D
ump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-
--

-- --------------------------------------------------------

--
-- Table structure for table `clientrecords`
--

CREATE TABLE `clientrecords` (

  `clientusername` varchar(255) NOT NULL,
  `clientpassword` varchar(255) NOT NULL,
  `clientphonenumber` int(10) NOT NULL,
  `clientemail` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (

  `clientusername` varchar(255) NOT NULL,
  `clientpassword` varchar(255) NOT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` ( `username`, `password`, ) VALUES
( 'Orville', 'pass', ),
( 'sectest', 'secpass', ),
( 'cashtest', 'cashpass',);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientrecords`
--
ALTER TABLE `clientrecords`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`clientusername`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientrecords`
--
ALTER TABLE `custrecords`
  MODIFY `clientusername` varchar(255) NOT NULL;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `clientusername`  varchar(255) NOT NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;