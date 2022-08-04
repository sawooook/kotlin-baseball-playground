package calculator.v1

import calculator.v1.Constants.SPACE

class SeparateCalculator(private val value: String) {

    init {
        require(value.isNotEmpty()) {
            throw IllegalArgumentException("값이 존재하지 않습니다.")
        }
    }

    fun toSplit(): List<String> = this.value.split(SPACE)
}
