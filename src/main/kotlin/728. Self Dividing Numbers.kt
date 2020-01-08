class SolutionSelfDividingNumbers {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val result = mutableListOf<Int>()

        (left..right).forEach { value ->
            val valueCharArray = "$value".toCharArray()
            val validateCharArray = valueCharArray.filter { char ->
                char != '0' && value % (char - '0') == 0
            }
            if (valueCharArray.size ==  validateCharArray.size)
                result.add(value)
        }

        return result
    }
}

fun main() {
    val solution = SolutionSelfDividingNumbers()
    val result = solution.selfDividingNumbers(1, 22)
    println(result)
}