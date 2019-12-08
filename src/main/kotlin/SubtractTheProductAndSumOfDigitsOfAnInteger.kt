class Solution3 {
    fun subtractProductAndSum(n: Int): Int {
        val nS = n.toString().toCharArray().map { it.toString().toInt() }
        var multiple = 1
        var sum = 0
        for (i in nS) {
            multiple *= i
            sum += i
        }

        return multiple - sum
    }
}

fun main() {

    val s = Solution3()
    val result = s.subtractProductAndSum(4421)
    println(result)
}