-- MySQL Script generated by MySQL Workbench
-- dom 08 set 2019 09:12:08 -03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema placelist
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `placelist` DEFAULT CHARACTER SET utf8 ;
USE `placelist` ;

-- -----------------------------------------------------
-- Table `placelist`.`place`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `placelist`.`place` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



-- -----------------------------------------------------
-- Add Data
-- -----------------------------------------------------
INSERT INTO place
    (name, description)
VALUES
    ('Nome 1', 'lorem ipsum');
    ('Nome 2', 'lorem ipsum');
    ('Nome 3', 'lorem ipsum');
    ('Nome 4', 'lorem ipsum');
    ('Nome 5', 'lorem ipsum');
    ('Nome 5', 'lorem ipsum');