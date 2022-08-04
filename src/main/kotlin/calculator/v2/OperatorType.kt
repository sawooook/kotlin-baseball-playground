package calculator.v2

enum class OperatorType(
    val text: String,
    val calculator: (first: Int, second: Int) -> Int
) {
    PLUS("+", { first, second -> first + second }),
    MINUS("-", { first, second -> first - second }),
    DIVIDE("/", { first, second -> first / second }),
    MULTIPLY("*", { first: Int, second: Int -> first * second });

    companion object {
        fun convertType(text: String): OperatorType =
            values().firstOrNull { it.text == text } ?: throw IllegalArgumentException("지원하지 않는 연산자 입니다.")
    }
}
