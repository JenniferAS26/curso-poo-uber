class Driver extends Account{
    constructor(name, document, email, password){
        super(name, document, email, password)
    }
    printDataUser(){
        console.log("Nombre: " + this.name)
        console.log("Documento: " + this.document)
        console.log("e-Mail: " + this.email)
        console.log("Password: " + this.password)
    }
}