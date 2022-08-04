package calculator.v2

import calculator.v1.Operator
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OperatorTextTest {

    @Test
    @DisplayName("텍스트 문자열 타입을 Operator Enum 으로 변경한다.")
    fun operatorText() {
        val result = OperatorType.convertType("+")

        assertEquals(OperatorType.PLUS, result)
    }

    @Test
    @DisplayName("숫자를 넣으면 연산을 실행한다")
    fun operatorCalcText() {
        val type = OperatorType.convertType("+")
        val result = type.calculator(1, 2)

        assertEquals(result, 3)
    }
}
