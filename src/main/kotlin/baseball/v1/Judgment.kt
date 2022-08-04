package baseball.v1

/**
 * 심판이 어떤 판단을 내리는지 알려주는 클래스
 * */
class Judgment(
    private val inputNumber: BaseBall,
    private val answerNumber: BaseBall
) {
    fun getBallCount(): Int {
        var ballCount = 0
        val inputNumberList = inputNumber.getList()
        val answerNumberList = answerNumber.getList()

        inputNumberList.forEach {
            if (answerNumberList.contains(it)) {
                ballCount++
            }
        }

        return ballCount
    }

    fun getStrikeCount(): Int {
        var strikeCount = 0
        val inputNumberList = inputNumber.getList()
        val answerNumberList = answerNumber.getList()

        inputNumberList.forEachIndexed { index, number ->
            if (answerNumberList[index] == number) {
                strikeCount ++
            }
        }

        return strikeCount
    }

    fun isAnswer(): Boolean = inputNumber.isEqual(answerNumber)
}
