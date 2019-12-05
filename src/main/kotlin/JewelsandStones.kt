class Solution2 {
    fun numJewelsInStones(J: String, S: String): Int =
        J.map { j ->
            S.toCharArray().filter { it === j }.size
        }.sum()
}

fun main() {
    val s = Solution2()
    val result = s.numJewelsInStones("aA", "aAAbbbb")
    println("result=$result")
}