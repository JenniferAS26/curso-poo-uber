package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123", "andresherrera@email.com","1234"),"Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH785", new Account("Andres Herrera", "AND123", "andresherrera@email.com","1234"));
        uberVan.setPassenger(6);
        uberX.printDataCar();

        /*Car car2 = new Car("QWE567", new Account("Camila Hernandez", "CAM456", "camila@email.com", "7895"));
        car2.passenger = 3;
        car2.printDataCar();*/
    }
    
}

