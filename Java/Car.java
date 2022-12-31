package Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger; // encapsulamiento

    public Car(String license, Account driver){ // metodo constructor
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        if(passenger != null){ // escondi el dato, si este no se cumple no me imprime la informacion
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){ // 
        return passenger;
    }

    public void setPassenger(Integer passenger){ // asigno el valor de passenger
        if(passenger == 4){ // condicion para que se cumple 
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros"); // mensaje de advertencia que no se cumple la condicion
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }



}
