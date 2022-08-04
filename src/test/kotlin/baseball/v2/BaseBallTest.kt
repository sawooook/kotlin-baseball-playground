package baseball.v2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * 1. 각각의 볼을 비교하는 기능
 * 2.
 *
 * */
class BaseBallTest {

    @Test
    fun makeBallSplit() {
        val userBall = Ball("123").split()

        assertEquals(userBall.size, 3)
    }
}
