import kotlin.math.abs
import kotlin.math.max

class Solution5 {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var result = 0
        for ((index, _) in points.withIndex()) {
            if (index+1 == points.size) break
            val x = points[index][0] - points[index+1][0]
            val y = points[index][1] - points[index+1][1]
            result += max(abs(x), abs(y))
        }
        return result
    }
}

fun main() {
    val s = Solution5()
    val result = s.minTimeToVisitAllPoints(arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0)))
    println("result=$result")
}