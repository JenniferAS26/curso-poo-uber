package Java;

public class UberX extends Car { // herencia
    String brand; 
    String model;

    public UberX(String license, Account driver, String brand, String model){ // metodo constructor
        super(license, driver); // Superclase, hara referencia a los atributos y a los metodos de la superclase
        this.brand = brand; // this hara referencia a los atributos de la clase hija o la clase donde estamos ubicados 
        this.model = model;
    }
    
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);

    }
}
