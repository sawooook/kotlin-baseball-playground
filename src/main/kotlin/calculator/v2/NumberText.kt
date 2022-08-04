package calculator.v2

private const val FIRST_INDEX = 0

class NumberText(private val textList: List<String>) {

    fun firstNumber(): Int = textList[FIRST_INDEX].toInt()

    fun getOperator(index: Int): OperatorType = OperatorType.convertType(textList[index])

    fun getNumber(index: Int): Int = textList[index].toInt()
}
