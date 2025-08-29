-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema NextmoveDC
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema NextmoveDC
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `NextmoveDC` DEFAULT CHARACTER SET utf8 ;
USE `NextmoveDC` ;

-- -----------------------------------------------------
-- Table `NextmoveDC`.`Clases`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NextmoveDC`.`Clases` (
  `idClases` INT NOT NULL AUTO_INCREMENT,
  `NombreClase` VARCHAR(45) NOT NULL,
  `Horario` VARCHAR(100) NOT NULL,
  `Dias` VARCHAR(45) NOT NULL,
  `EdadAdmision` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idClases`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NextmoveDC`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NextmoveDC`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `Edad` INT NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NextmoveDC`.`Profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NextmoveDC`.`Profesor` (
  `idProfesor` INT NOT NULL AUTO_INCREMENT,
  `NombreProfesor` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `RedSocial` VARCHAR(45) NOT NULL,
  `Clases_idClases` INT NOT NULL,
  PRIMARY KEY (`idProfesor`),
  INDEX `fk_Profesor_Clases_idx` (`Clases_idClases` ASC) VISIBLE,
  CONSTRAINT `fk_Profesor_Clases`
    FOREIGN KEY (`Clases_idClases`)
    REFERENCES `NextmoveDC`.`Clases` (`idClases`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NextmoveDC`.`Inscripcion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NextmoveDC`.`Inscripcion` (
  `idIncripcion` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NOT NULL,
  `idClases` INT NOT NULL,
  `FechadeInscripcion` DATE NOT NULL,
  INDEX `fk_Usuario_has_Clases1_Clases1_idx` (`idClases` ASC) VISIBLE,
  INDEX `fk_Usuario_has_Clases1_Usuario1_idx` (`idUsuario` ASC) VISIBLE,
  PRIMARY KEY (`idIncripcion`),
  CONSTRAINT `fk_Usuario_has_Clases1_Usuario1`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `NextmoveDC`.`Usuario` (`idUsuario`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Usuario_has_Clases1_Clases1`
    FOREIGN KEY (`idClases`)
    REFERENCES `NextmoveDC`.`Clases` (`idClases`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NextmoveDC`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NextmoveDC`.`Pago` (
  `idPago` INT NOT NULL AUTO_INCREMENT,
  `FechaPago` DATE NOT NULL,
  `Costo` DOUBLE NOT NULL,
  `Paquete` VARCHAR(45) NOT NULL,
  `Inscripcion_idIncripcion` INT NOT NULL,
  PRIMARY KEY (`idPago`),
  INDEX `fk_Pago_Inscripcion1_idx` (`Inscripcion_idIncripcion` ASC) VISIBLE,
  CONSTRAINT `fk_Pago_Inscripcion1`
    FOREIGN KEY (`Inscripcion_idIncripcion`)
    REFERENCES `NextmoveDC`.`Inscripcion` (`idIncripcion`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NextmoveDC`.`Usuario_has_Clases`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NextmoveDC`.`Usuario_has_Clases` (
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NextmoveDC`.`Inscripcion_has_Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NextmoveDC`.`Inscripcion_has_Pago` (
  `Pago_idPago` INT NOT NULL,
  PRIMARY KEY (`Pago_idPago`),
  INDEX `fk_Inscripcion_has_Pago_Pago1_idx` (`Pago_idPago` ASC) VISIBLE,
  CONSTRAINT `fk_Inscripcion_has_Pago_Pago1`
    FOREIGN KEY (`Pago_idPago`)
    REFERENCES `NextmoveDC`.`Pago` (`idPago`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
