package baseball.v2

class Ball(private val number: String) {

    fun split(): List<String> = number.split("").filterNot { it.isBlank() }

    fun isStrike(index: Int, computerBallNumber: String): Boolean = this.split()[index] == computerBallNumber
}
