package calculator.v2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SeparateTextTest {

    @Test
    @DisplayName("문자열을 공백 기준으로 자른다.")
    fun splitText() {
        val text = SeparateText("2 + 3 * 4 / 2")
        val result = text.separate()

        assertEquals(result[0], "2")
        assertEquals(result[6], "2")
        assertEquals(result.size, 7)
    }
}
