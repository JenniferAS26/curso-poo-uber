<?php
require_once('car.php'); # trae el archivo que hereda 
class UberVan extends Car{
    public $brand;
    public $model;
    public $typeCarAccepted;
    public $seatsMaterial;
    
    // protected $passenger; 

    public function __construct($license, $driver, $brand , $model, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license,$driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
        $this->brand = $brand;
        $this->model = $model;

    }

    public function setPassenger($passenger)
    {
        if ($passenger == 6){
            $this->passenger = $passenger;
        }
        else{
            echo "Necesitas asignar 4 pasajeros";
            echo "<br>"; // Salto de linea  
        }
    }

    public function printDataCar()
    {
        echo "Modelo: $this->model Brand: ".$this->brand;
        echo "<br>"; // Salto de linea 
    }    
}
?>