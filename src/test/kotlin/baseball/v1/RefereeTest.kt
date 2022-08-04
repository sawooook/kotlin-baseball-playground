package baseball.v1

import baseball.v1.BaseBall
import baseball.v1.Referee
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RefereeTest {

    @Test
    fun `숫자 3개가 모두 일치하여 경우 3스트라이크를 받아온다`() {

        val result = Referee(
            BaseBall("123"),
            BaseBall("123")
        ).compare()

        assertEquals(result, "3스트라이크")
    }

    @Test
    fun `숫자 1개 자리만 일치하여 1스트라이크를 받아온다`() {

        val result = Referee(
            BaseBall("123"),
            BaseBall("167")
        ).compare()

        assertEquals(result, "1스트라이크")
    }

    @Test
    fun `숫자 1개 있기만 일치하여 1볼을 받아온다`() {

        val result = Referee(
            BaseBall("123"),
            BaseBall("651")
        ).compare()

        assertEquals(result, "1볼")
    }

    @Test
    fun `숫자 1개 있기만하고 1개는 자리만 일치하여 일치하여 1볼 1스트라이크를 받아온다`() {

        val result = Referee(
            BaseBall("123"),
            BaseBall("162")
        ).compare()

        assertEquals(result, "1볼 1스트라이크")
    }
}
