package baseball.v1

/**
 * 심판 클래스 -> 결과만 도출해주는 클래스
 * */
class Referee(
    private val inputNumber: BaseBall,
    private val answerNumber: BaseBall
) {
    fun compare(): String {
        val ballCount = Judgment(inputNumber, answerNumber).getBallCount()
        val strikeCount = Judgment(inputNumber, answerNumber).getStrikeCount()
        val isAnswer = Judgment(inputNumber,answerNumber).isAnswer()

        return getRefereeResult(ballCount, strikeCount, isAnswer)
    }

    private fun getRefereeResult(ballCount: Int, strikeCount: Int, isAnswer: Boolean): String {
        val finalBallCount = ballCount - strikeCount
        if (isAnswer) {
            return "3스트라이크"
        }

        if (finalBallCount == 0) {
            return "${strikeCount}스트라이크"
        }

        if (strikeCount == 0) {
            return "${finalBallCount}볼"
        }

        return "${finalBallCount}볼 ${strikeCount}스트라이크"
    }
}
