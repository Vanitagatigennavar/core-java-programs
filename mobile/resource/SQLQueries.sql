ALTER TABLE `mobile`.`mobile_info` 
ADD COLUMN `companyName` VARCHAR(45) NOT NULL AFTER `name`,
ADD COLUMN `location` VARCHAR(45) NOT NULL AFTER `companyName`,
ADD COLUMN `personName` VARCHAR(45) NOT NULL AFTER `location`,
ADD COLUMN `cratedDate` DATE NOT NULL AFTER `personName`,
ADD COLUMN `updateDate` DATE NOT NULL AFTER `cratedDate`,
ADD COLUMN `createdTime` TIME NOT NULL AFTER `updateDate`,
ADD COLUMN `updateTime` TIME NOT NULL AFTER `createdTime`,
ADD COLUMN `price` DOUBLE NOT NULL AFTER `updateTime`;
