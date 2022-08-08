CREATE SCHEMA new_resort;
CREATE TABLE `new_resort`.`newresort_info` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `checkInTime` TIME NOT NULL,
  `checkOutTime` TIME NOT NULL,
  `createdBy` VARCHAR(45) NOT NULL,
  `createDate` DATE NOT NULL,
  `updateDate` DATE NOT NULL,
  `owner` VARCHAR(45) NOT NULL,
  ` pricePerDay` DOUBLE NOT NULL,
  PRIMARY KEY (`id`)
  
  );






