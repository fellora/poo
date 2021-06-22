class Team {
    var name:String? = null
    var state:Boolean = false
    var torneos:Int = 0
    var country:String? = null
    var champion:Boolean = false
    var socios:Int = 0
    var players:Int = 0
    var money:Double = 0.0
    var hinchas:Int = 0
    var sponsors:Int = 0

    constructor(name:String, country:String){
        this.name = name
        this.country = country
        println("Se está ejecutando el constructor 1")
    }

    constructor(players: Int = 11){
        this.players = players
        println("Se está ejecutando el constructor 2")
    }

    constructor(){
        println("Se está ejecutando el constructor 3")
    }

    fun noParticipar(){
        state = false
        println("$name de $country no está participando en ningún torneo")
    }

    fun participa(){
        state = true
        println("$name de $country está participando en $torneos ${if (torneos == 1) "torneo" else "torneos"}")
    }

    fun comprarJugadores(players:Int){
        val totalJugadores = this.players + players
        if(totalJugadores<44 && money>0.0){
            this.players = this.players + players
            println("$name va comprar $players jugadores por un valor de $money dólares")
            println("$name tendrá ${this.players} jugadores")
        }else{
            print("$name va comprar $players jugadores, puedes comprar hasta ${44 - this.players} por un valor de $money dólares")
        }
    }
}