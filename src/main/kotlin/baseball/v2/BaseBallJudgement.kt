package baseball.v2

class BaseBallJudgement(
    private val ballCount: Int,
    private val strikeCount: Int
) {
    fun judgement(): String {
        val finalBallCount = ballCount - strikeCount
        if (strikeCount == 3 && ballCount == 3) {
            return "3스트라이크"
        }

        if (strikeCount == 0 && ballCount == 0) {
            return "낫씽"
        }

        if (strikeCount == 0) {
            return "${finalBallCount}볼"
        }


        if (finalBallCount == 0) {
            return "${strikeCount}스트라이크"
        }

        return "${finalBallCount}볼 ${strikeCount}스트라이크"
    }
}
