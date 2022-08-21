CREATE SCHEMA `combs` ;`
CREATE TABLE `combs`.`combs_info` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `price` DOUBLE NOT NULL,
  `noofcombs` INT NOT NULL,
  `maxCapacity` INT NOT NULL,
  `createdBy` VARCHAR(45) NOT NULL,
  `updatedBy` VARCHAR(45) NOT NULL,
  `createdDate` DATE NOT NULL,
  `updatedDate` DATE NOT NULL,
  PRIMARY KEY (`id`));