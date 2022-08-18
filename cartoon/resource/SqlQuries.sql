CREATE SCHEMA `cartoon` ;
CREATE TABLE `cartoon`.`cartoon_info` (
  `cid` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `author` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cid`));
  ALTER TABLE `cartoon`.`cartoon_info` 
ADD COLUMN `createdDate` DATE NOT NULL AFTER `type`,
ADD COLUMN `updateDate` DATE NOT NULL AFTER `createdDate`,
ADD COLUMN `createdBy` VARCHAR(45) NOT NULL AFTER `updateDate`,
ADD COLUMN `updatedBy` VARCHAR(45) NOT NULL AFTER `createdBy`;
