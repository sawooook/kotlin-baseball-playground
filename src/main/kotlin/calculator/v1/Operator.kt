package calculator.v1

enum class Operator(val code: String, val calculator: (first: Int, second: Int) -> Int) {
    PLUS("+", { first, second -> first + second }),
    MINUS("-", {first, second -> first - second }),
    DIVIDE("/", {first, second -> first / second }),
    MULTIPLY("*", {first, second -> first * second });

    companion object {
        fun convert(value: String): Operator =
            values().firstOrNull { value == it.code } ?: throw IllegalArgumentException("유효하지 않은 식 입니다.")
    }
}
