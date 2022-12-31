from account import Acount

class User(Acount):
    def __init__(self, name, document, email, password):
        super.__init__(name, document, email, password)