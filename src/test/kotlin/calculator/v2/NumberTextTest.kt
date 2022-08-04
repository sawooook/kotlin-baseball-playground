package calculator.v2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumberTextTest {

    @Test
    @DisplayName("첫 번째 숫자를 꺼내온다")
    fun getFirstNumber() {
        val result = NumberText(listOf("1", "+", "2", "*", "3")).firstNumber()

        assertEquals(result, 1)
    }

    @Test
    @DisplayName("원하는 인덱스의 숫자를 꺼내온다")
    fun getIndexNumber() {
        val result = NumberText(listOf("1", "+", "2", "*", "3")).getNumber(2)

        assertEquals(result, 2)
    }

    @Test
    @DisplayName("원하는 인덱스의 연산자를 꺼내온다")
    fun getIndexOperator() {
        val result = NumberText(listOf("1", "+", "2", "*", "3")).getOperator(1)

        assertEquals(result, OperatorType.PLUS)
    }
}
