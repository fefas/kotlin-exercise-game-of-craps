 package fefas.gamesofcraps

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class GameTest {
    @ParameterizedTest
    @ValueSource(ints = [7, 11])
    fun winOnOpeningRoll(dicesResult: Int) {
        val game = Game(DeterministicDices(dicesResult))

        game.play()

        assertEquals(true, game.state().hasWon())
    }

    @ParameterizedTest
    @ValueSource(ints = [2, 3, 12])
    fun loseOnOpeningRoll(dicesResult: Int) {
        val game = Game(DeterministicDices(dicesResult))

        game.play()

        assertEquals(false, game.state().hasWon())
    }

    class DeterministicDices(val result: Int) : Dices {
        override fun sumUpwardFaces(): Int = result
    }
}

