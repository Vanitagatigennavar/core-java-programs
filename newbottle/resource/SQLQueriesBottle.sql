CREATE TABLE `newbottle`.`new_table` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `companyName` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `buyPerson` VARCHAR(45) NOT NULL,
  `manunufactureDate` DATE NOT NULL,
  `expiryDate` DATE NOT NULL,
  `manunufactureTime` TIME NOT NULL,
  `expiryTime` TIME NOT NULL,
  `price` DOUBLE NOT NULL,
  PRIMARY KEY (`id`));