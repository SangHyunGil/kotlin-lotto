class Calculator {

    private val customTokenizerRegex = Regex("//(.)\n(.*)")

    fun calculate(expr: String): Int {
        if (expr.isEmpty()) return 0

        val numberGroup = mutableListOf<String>()
        customTokenizerRegex.find(expr)?.let {
            val customTokenizer = it.groupValues[TOKENIZER_INDEX]
            numberGroup.addAll(it.groupValues[TOKENIZER_APPLIED_EXPR_INDEX].split(customTokenizer))
        } ?: numberGroup.addAll(expr.split(",", ":"))

        if (numberGroup.size == 1) {
            return numberGroup[0].toInt().also(::checkNegative)
        }

        return numberGroup
            .map { it.toInt().also(::checkNegative) }
            .reduce { acc, number -> acc + number }
    }

    private fun checkNegative(number: Int) {
        if (number < 0) throw RuntimeException("음수가 존재합니다.")
    }

    companion object {
        private const val TOKENIZER_INDEX = 1
        private const val TOKENIZER_APPLIED_EXPR_INDEX = 2
    }
}
