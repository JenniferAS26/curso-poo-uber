<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("uberVan.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();

$uberPool = new UberPool("TRE753", new Account("Camilo Ferran", "CFE456"), "Dodge", "Attitude");
$uberPool->setPassenger(4);
$uberPool->printDataCar();

$uberVan = new UberVan("OJL984", new Account("Raul Ramirez", "RAR457"), "Nissan", "Versa" , "Nissan", "Leather");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

?>