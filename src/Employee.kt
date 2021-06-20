class Employee {
    var state: Boolean = false
    var name: String? = null
    var age: Int = 0
    var sex: String? = null

    fun restState() {
        state = false
        println("$name ve a descansar")
    }

    fun activeState() {
        state = true
        println("$name comienza a trabajar")
    }

    fun estadoDeEmployee(): String {
        return if (state) "$name está trabajando" else "$name está descansando"
    }
}