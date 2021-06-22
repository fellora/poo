class Cuenta {
    var titular:String
    var cantidad:Double

    constructor(titular:String){
        this.titular = titular
        this.cantidad = 0.0
        println("Se está ejecutando el constructor 1")
    }

    constructor(titular: String, cantidad:Double){
        this.titular = titular
        this.cantidad = cantidad
        print("Se está ejecutando el constructor 2")
    }

    fun ingresar(cantidad: Double){
        if (cantidad > 0.0){
            this.cantidad = this.cantidad + cantidad
            println("Tienes ${this.cantidad} soles")
        } else{
            print("No se hará nada")
        }
    }

    fun retirar(cantidad: Double){
        if (this.cantidad >= cantidad){
            this.cantidad = this.cantidad - cantidad
            println("Tienes ${this.cantidad} soles")
        } else{
            print("No cuentas con esa cantidad")
        }
    }
}