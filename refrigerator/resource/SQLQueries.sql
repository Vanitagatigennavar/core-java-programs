CREATE TABLE `refrigerator`.`refrigerator_info` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `companyName` VARCHAR(45) NOT NULL,
  `personName` VARCHAR(45) NOT NULL,
  `cratedDate` DATE NOT NULL,
  `updateDate` DATE NOT NULL,
  `createdTime` TIME NOT NULL,
  `updateTime` TIME NOT NULL,
  `price` DOUBLE NOT NULL,
  PRIMARY KEY (`id`));