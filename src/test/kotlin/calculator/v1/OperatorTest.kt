package calculator.v1

import calculator.v1.Operator
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OperatorTest {


    @Test
    @DisplayName("성공적으로 덧셈을 한다")
    fun `success operator plus`() {
        val calculatorNumber = Operator.convert("+").calculator(10, 2)

        assertEquals(calculatorNumber, 12)
    }

    @Test
    @DisplayName("성공적으로 뺋셈을 한다")
    fun `success operator minus`() {
        val calculatorNumber = Operator.convert("-").calculator(10, 2)

        assertEquals(calculatorNumber, 8)
    }

    @Test
    @DisplayName("성공적으로 나누기를 한다")
    fun `success operator divide`() {
        val calculatorNumber = Operator.convert("/").calculator(10, 2)

        assertEquals(calculatorNumber, 5)
    }

    @Test
    @DisplayName("성공적으로 곱셉 한다")
    fun `success operator multiply`() {
        val calculatorNumber = Operator.convert("*").calculator(10, 2)

        assertEquals(calculatorNumber, 20)
    }
}
