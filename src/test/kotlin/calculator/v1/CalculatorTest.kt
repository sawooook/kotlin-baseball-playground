package calculator.v1

import calculator.v1.StringCalculator
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    @DisplayName("성공적으로 계산에 성공한다 - 1")
    fun `success calculator - 1`() {
        val str = "12 + 3 * 4 / 2"
        val result = StringCalculator.calculator(str)

        assertEquals(result, 30)
    }

    @Test
    @DisplayName("성공적으로 계산에 성공한다 - 2")
    fun `success calculator - 2`() {
        val str = "2 + 3 * 4 / 2"
        val result = StringCalculator.calculator(str)

        assertEquals(result, 10)
    }

    @Test
    @DisplayName("이상한 문자열이 들어가 예외가 발생한다")
    fun `fail calculator - weird string`() {
        val str = "2 + 3 * 4 / 2 = 2"

        assertThrows<IllegalArgumentException> {
            StringCalculator.calculator(str)
        }
    }
}
