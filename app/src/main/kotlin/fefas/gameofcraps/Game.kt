package fefas.gamesofcraps

class Game(val dices: Dices) {

    var result: Int = 0

    fun play(): Unit {
        result = dices.sumUpwardFaces()
    }

    fun state(): GameState {
        return when (result) {
            7, 11 -> GameState(true)
            else -> GameState(false)
        }
    }
}

