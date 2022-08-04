package baseball.v1

import baseball.v1.BaseBall
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BaseBallTest {

    @Test
    fun `성공적으로 BaseBall 객체 내에서 리스트에 든값들을 뽑아온다 - 1`() {
        val baseBallList = BaseBall("123").getList()

        assertEquals(baseBallList[0], "1")
        assertEquals(baseBallList[1], "2")
        assertEquals(baseBallList[2], "3")
    }

    @Test
    fun `성공적으로 BaseBall 객체 내에서 리스트에 든값들을 뽑아온다 - 2`() {
        val baseBallList = BaseBall("145").getList()

        assertEquals(baseBallList[0], "1")
        assertEquals(baseBallList[1], "4")
        assertEquals(baseBallList[2], "5")
    }

    @Test
    fun `성공적으로 BaseBall 끼리 비교한 값들이 일치하는지 비교한다`() {
        val firstBaseBall = BaseBall("145")
        val secondBaseBall = BaseBall("145")

        assertEquals(firstBaseBall, secondBaseBall)
    }

    @Test
    fun `성공적으로 BaseBall 끼리 비교한 값들이 다른지 비교한다`() {
        val firstBaseBall = BaseBall("145")
        val secondBaseBall = BaseBall("123")

        assertNotEquals(firstBaseBall, secondBaseBall)
    }
}
