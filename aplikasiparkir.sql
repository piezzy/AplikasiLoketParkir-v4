-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2024 at 11:23 AM
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
-- Database: `aplikasiparkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `noPlat` varchar(15) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jenisKendaraan` varchar(20) DEFAULT NULL,
  `merek` varchar(30) DEFAULT NULL,
  `warna` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kendaraan`
--

INSERT INTO `kendaraan` (`noPlat`, `nama`, `jenisKendaraan`, `merek`, `warna`) VALUES
('R 4355 KK', 'Andi', 'Motor', 'Beat', 'Putih');

-- --------------------------------------------------------

--
-- Table structure for table `parkir`
--

CREATE TABLE `parkir` (
  `kodeParkir` varchar(20) NOT NULL,
  `waktuMasuk` date DEFAULT NULL,
  `waktuKeluar` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkir`
--

INSERT INTO `parkir` (`kodeParkir`, `waktuMasuk`, `waktuKeluar`) VALUES
('PKR00068', '2024-06-01', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `parkirdetail`
--

CREATE TABLE `parkirdetail` (
  `id` int(11) NOT NULL,
  `kodeParkir` varchar(10) NOT NULL,
  `noPlat` varchar(15) NOT NULL,
  `status` varchar(10) NOT NULL DEFAULT 'Parked',
  `waktuMasuk` date DEFAULT NULL,
  `waktuKeluar` date DEFAULT NULL,
  `harga` double DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkirdetail`
--

INSERT INTO `parkirdetail` (`id`, `kodeParkir`, `noPlat`, `status`, `waktuMasuk`, `waktuKeluar`, `harga`) VALUES
(51, 'PKR00068', 'R 4355 KK', 'Masuk', '2024-06-01', NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`id`, `username`, `password`) VALUES
(5, 'staff', 'staff'),
(8, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD PRIMARY KEY (`noPlat`);

--
-- Indexes for table `parkir`
--
ALTER TABLE `parkir`
  ADD PRIMARY KEY (`kodeParkir`);

--
-- Indexes for table `parkirdetail`
--
ALTER TABLE `parkirdetail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kodeParkir` (`kodeParkir`),
  ADD KEY `noPlat` (`noPlat`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `parkirdetail`
--
ALTER TABLE `parkirdetail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `parkirdetail`
--
ALTER TABLE `parkirdetail`
  ADD CONSTRAINT `parkirdetail_ibfk_1` FOREIGN KEY (`kodeParkir`) REFERENCES `parkir` (`kodeParkir`),
  ADD CONSTRAINT `parkirdetail_ibfk_2` FOREIGN KEY (`noPlat`) REFERENCES `kendaraan` (`noPlat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
