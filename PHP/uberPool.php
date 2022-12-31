<?php
require_once('car.php');
class UberPool extends Car{
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver); // Clase super 
        $this->brand = $brand;
        $this->model = $model;
    }

    public function printDataCar()
    {
        echo "Modelo: $this->model Brand: ".$this->brand;
        echo "<br>"; // Salto de linea 
    }

}
?>