CREATE SCHEMA `cartoon` ;
CREATE TABLE `cartoon`.`cartoon_info` (
  `cid` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `author` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `createdDate` DATE NOT NULL,
  `updateDate` DATE NOT NULL,
  `createdBy` VARCHAR(45) NOT NULL,
  `updatedBy` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cid`));
  ALTER TABLE `cartoon`.`cartoon_info` 
CHANGE COLUMN `cid` `cid` INT NOT NULL AUTO_INCREMENT ;
