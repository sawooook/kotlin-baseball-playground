package baseball.v1

data class BaseBall(private val value: String) {

    fun getList(): List<String> = value.split("").filterNot { it.isBlank() }

    fun isEqual(answerNumber: BaseBall): Boolean = this == answerNumber
}
