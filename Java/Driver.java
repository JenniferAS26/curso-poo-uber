package Java;

public class Driver extends Account {
    public Driver(String name, String document, String email, String password){
        super(name, document, email, password);
    }

    void printDataDriver(){
        System.out.println("Document User: " + document + " Name: " + name + " e-Mail: " + email + " Password: " + password);
    }
}
