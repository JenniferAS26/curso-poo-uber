var car =  new Car("AW789", new Account("Andres Herrera", "AND784"))
car.passanger = 4;
car.printDataCar();

var uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456", "andres@email.com", "5417"), "Chevrolet", "Spark");
uberX.passanger = 4;
uberX.printDataCar(); 

console.log("UberX")
var uberX = new UberX("FDS1257", new Account("Carlos Florez", "CFL8751", "carlos@email.com", "4568"), "Toyota", "Corolla")