fun main(){
    var equipo1 = Team()
    equipo1.name = "Manchester United"
    equipo1.state = false
    equipo1.torneos = 4
    equipo1.country = "Inglaterra"
    equipo1.champion = false
    equipo1.socios = 300
    equipo1.players = 40
    equipo1.money = 1000.0
    equipo1.hinchas = 3000000
    equipo1.sponsors = 3


    equipo1.participa()
    equipo1.comprarJugadores(players = 3)

    var equipo2 = Team(name = "Sport Boys", country = "Perú")
    equipo2.state = false
    equipo2.torneos = 1
    equipo2.champion = false
    equipo2.socios = 30
    equipo2.players = 25
    equipo2.money = 1000.0
    equipo2.hinchas = 30000
    equipo2.sponsors = 0

    equipo2.participa()
    equipo2.comprarJugadores(players = 5)

    var equipo3 = Team(players = 44)
    equipo3.name = "Real Madrid"
    equipo3.state = false
    equipo3.torneos = 4
    equipo3.country = "España"
    equipo3.champion = false
    equipo3.socios = 20000
    equipo3.money = 1000.0
    equipo3.hinchas = 8000000
    equipo3.sponsors = 20

    equipo3.participa()
    equipo3.comprarJugadores(players = 1)
}