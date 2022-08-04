package calculator.v2

private const val BLANK_SPACE = " "

class SeparateText(private val text: String) {

    fun separate(): List<String> = text.split(BLANK_SPACE)
}
