package calculator.v2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * 요구 사항 정리
 * 1. 사칙연산을 수행할 수 있는 계산기 구현
 * 2. 우선순위 입력이 아닌 입력값에 따라 계산 순서 결정
 * 3. 빈 공백 문자열을 기준으로 문자들을 분리
 *
 *
 * 어떤식으로 클래스를 분리할 것인가?
 *
 * 1. 빈 공백 문자열을 기준으로 자르는 부분 클래스
 * 2. 자른 문자열을 갖고 연산 하는 부분
 * */


class CalculatorTest {

    @Test
    @DisplayName("입력한 문자열의 숫자를 계산한다")
    fun calculate_1() {
        val text = SeparateText("2 + 3 * 4 / 2").separate()
        val result = CalculatorText(text)
            .calculator()

        assertEquals(result, 10)
    }

    @Test
    @DisplayName("입력한 문자열의 숫자를 계산한다")
    fun calculate_2() {
        val text = SeparateText("2 * 3 / 2").separate()
        val result = CalculatorText(text)
            .calculator()

        assertEquals(result, 3)
    }

    @Test
    @DisplayName("입력한 문자열의 숫자를 계산한다")
    fun calculate_3() {
        val text = SeparateText("2 + 3 - 3").separate()
        val result = CalculatorText(text)
            .calculator()

        assertEquals(result, 2)
    }
}
