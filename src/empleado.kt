fun main(){
    var empleado1 = Employee()
    empleado1.age = 33
    empleado1.name = "Felipe"
    empleado1.sex = "Masculino"

    var empleado2 = Employee()
    empleado2.age = 27
    empleado2.name = "Carla"
    empleado2.sex = "Femenino"

    val estado1 = empleado1.estadoDeEmployee()
    println(estado1)
    empleado1.activeState()
    val estado2 = empleado1.estadoDeEmployee()
    println(estado2)
    empleado1.restState()
    val estado3 = empleado1.estadoDeEmployee()
    println(estado3)

    print("${empleado1.name} y ${empleado2.name}")
}
