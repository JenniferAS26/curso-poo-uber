<?php
require_once('car.php');
class UberBlack extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license,$driver); // metodo constructor 
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}
?>