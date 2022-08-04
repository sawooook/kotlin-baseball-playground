package calculator.v1

object StringCalculator {

    private const val START_INDEX = 0
    private const val NEXT_INDEX = 1
    private const val FOR_EACH_START_NUMBER = 1
    private const val FOR_EACH_STEP_SIZE = 2

    fun calculator(text: String): Int {
        val separateText = SeparateCalculator(text).toSplit()
        var resultNumber = separateText[START_INDEX].toInt()

        for (i in FOR_EACH_START_NUMBER until separateText.size step FOR_EACH_STEP_SIZE) {
            val operator = Operator.convert(separateText[i])
            val calcNumber = operator.calculator(resultNumber, separateText[i + NEXT_INDEX].toInt())

            resultNumber = calcNumber
        }

        return resultNumber
    }
}
