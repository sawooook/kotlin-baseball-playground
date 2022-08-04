package baseball.v2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BaseBallPlayTest {

    @Test
    fun playResult_nothing() {
        val userAnswer = Ball("123")
        val computerAnswer = Ball("456")
        val result = BaseBallPlay(userAnswer, computerAnswer).play()

        assertEquals(result, "낫씽")
    }

    @Test
    fun playResult_all_strike() {
        val userAnswer = Ball("123")
        val computerAnswer = Ball("123")
        val result = BaseBallPlay(userAnswer, computerAnswer).play()

        assertEquals(result, "3스트라이크")
    }

    @Test
    fun playResult_all_ball() {
        val userAnswer = Ball("123")
        val computerAnswer = Ball("312")
        val result = BaseBallPlay(userAnswer, computerAnswer).play()

        assertEquals(result, "3볼")
    }

    @Test
    fun playResult_1_strike_1_ball() {
        val userAnswer = Ball("123")
        val computerAnswer = Ball("135")
        val result = BaseBallPlay(userAnswer, computerAnswer).play()

        assertEquals(result, "1볼 1스트라이크")
    }

    @Test
    fun playResult_2_strike() {
        val userAnswer = Ball("123")
        val computerAnswer = Ball("125")
        val result = BaseBallPlay(userAnswer, computerAnswer).play()

        assertEquals(result, "2스트라이크")
    }

    @Test
    fun playResult_2_ball() {
        val userAnswer = Ball("123")
        val computerAnswer = Ball("316")
        val result = BaseBallPlay(userAnswer, computerAnswer).play()

        assertEquals(result, "2볼")
    }
}
