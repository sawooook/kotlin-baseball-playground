package calculator.v2


class CalculatorText(private val textList: List<String>) {

    companion object {
        private const val FOR_EACH_START_SIZE = 1
        private const val FOR_EACH_STEP_SIZE = 2
        private const val NEXT_NUMBER = 1
    }

    fun calculator(): Int {
        var result = NumberText(textList).firstNumber()

        for (index in FOR_EACH_START_SIZE until textList.size - 1 step (FOR_EACH_STEP_SIZE)) {
            val calcResult = NumberText(textList).getOperator(index)
                .calculator(
                    result,
                    NumberText(textList).getNumber(index + NEXT_NUMBER)
                )

            result = calcResult
        }

        return result
    }
}
