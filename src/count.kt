fun main() {
    var cuenta1 = Cuenta("Felipe Huanachin Carahuanco")
    cuenta1.cantidad = 200.0
    var cuenta2 = Cuenta("César Carahuanco", 500.0)

    cuenta1.ingresar(300.0)
    cuenta1.retirar(150.0)

    cuenta2.retirar(600.0)
    cuenta2.retirar(250.0)
}