package baseball.v1

import baseball.v1.BaseBall
import baseball.v1.Judgment
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JudgmentTest {

    @Test
    fun `볼 카운트 갯수를 받아온다 - 1`() {
        val result = Judgment(
            BaseBall("123"), BaseBall("456")
        ).getBallCount()

        assertEquals(result, 0)
    }

    @Test
    fun `볼 카운트 갯수를 받아온다 - 2`() {
        val result = Judgment(
            BaseBall("123"), BaseBall("123")
        ).getBallCount()

        assertEquals(result, 3)
    }

    @Test
    fun `볼 카운트 갯수를 받아온다 - 3`() {
        val result = Judgment(
            BaseBall("125"), BaseBall("123")
        ).getBallCount()

        assertEquals(result, 2)
    }

    @Test
    fun `스트라이크 카운트 갯수를 받아온다 - 1`() {
        val result = Judgment(
            BaseBall("125"), BaseBall("123")
        ).getStrikeCount()

        assertEquals(result, 2)
    }

    @Test
    fun `스트라이크 카운트 갯수를 받아온다 - 2`() {
        val result = Judgment(
            BaseBall("125"), BaseBall("125")
        ).getStrikeCount()

        assertEquals(result, 3)
    }

    @Test
    fun `스트라이크 카운트 갯수를 받아온다 - 3`() {
        val result = Judgment(
            BaseBall("125"), BaseBall("456")
        ).getStrikeCount()

        assertEquals(result, 0)
    }
}
