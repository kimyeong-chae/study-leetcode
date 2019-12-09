class Solution4 {
    fun balancedStringSplit(s: String): Int {
        var balance = 0
        var result = 0
        for (v in s.toCharArray()) {
            if (v === 'L')
                balance += 1
            else
                balance -= 1

            if (balance == 0)
                result += 1
        }
        return result
    }
}

fun main() {
    val s = Solution4()
    val result = s.balancedStringSplit("RLLLLRRRLR")
    println("result=$result")
}