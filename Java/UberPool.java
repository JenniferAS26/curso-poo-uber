package Java;

public class UberPool extends Car { // herencia
    String brand; 
    String model;

    public UberPool(String license, Account driver, String brand, String model){ // metodo constructor
        super(license, driver); // Superclase, hara referencia a los atributos y a los metodos de la superclase
        this.brand = brand; // this hara referencia a los atributos de la clase hija o la clase donde estamos ubicados 
        this.model = model;

        
    }
    
}
