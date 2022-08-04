package baseball.v2

class BaseBallPlay(
    private val userBall: Ball,
    private val computerBall: Ball
) {
    fun play(): String {
        val ballCount = getBallCount(computerBall, userBall)
        val strikeCount = getStrikeCount(computerBall,userBall)


        println(ballCount)
        println(strikeCount)

        return BaseBallJudgement(ballCount, strikeCount).judgement()
    }

    private fun getBallCount(computerBall: Ball, userBall: Ball): Int {
        var ballCount = 0
        computerBall.split().map {
            if (userBall.split().contains(it)) {
                ballCount++
            }
        }

        return ballCount
    }

    private fun getStrikeCount(computerBall: Ball, userBall: Ball): Int {
        var strikeCount = 0

        computerBall.split().forEachIndexed { index, computerBallNumber ->
            if (userBall.isStrike(index, computerBallNumber)) {
                println("========= ${computerBallNumber}")
                strikeCount++
            }
        }

        return strikeCount
    }
}
