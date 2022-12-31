from car import Car
from account import Acount
from uberX import UberX
from user import User

if __name__ == "__main__":
    print("Inicializando la informacion de los carros")
    print("Car...")
    car = Car("AMS234", Acount("Andres Herrera","AND876", "andres@email.com", "1234"))
    print(vars(car))
    print(vars(car.driver))

    print("uberX...")
    uberX = UberX("PET789", Acount("Helen Villa", "HEV852", "helen@email.com", "1458"), "Toyota", "Corolla")
    print(vars(uberX))
    print(vars(uberX.driver))

    print("User...")
    user = User("Maria Calle", "MAC364", "maria@email.com", "4973")
    print(vars(user))
