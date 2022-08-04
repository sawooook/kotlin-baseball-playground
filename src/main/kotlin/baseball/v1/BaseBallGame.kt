package baseball.v1

class BaseBallGame(
    private val value: String
) {
    companion object {
        private val RANDOM_ANSWER = (100..999).random().toString()
    }

    /**
     * 테스트 코드를 작성하려고 하다보니 RandomAnswer를 통제 할 수 없어서 테스트 코드를 작성 할 수 없었음
     * 위 부분 다시 작성한다면, 통제 가능하도록 코드 수정 할 듯
     * */
    fun start() {
        val inputNumber = BaseBall(value)
        val answerNumber = BaseBall(RANDOM_ANSWER)
        var result = ""

        while (!Judgment(inputNumber, answerNumber).isAnswer()) {
            result = Referee(inputNumber, answerNumber).compare()
        }

        println(result)
    }
}
