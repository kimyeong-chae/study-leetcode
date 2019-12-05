class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for ((i, v) in nums.withIndex()) {
            if (map.containsKey(target - v)) {
                return intArrayOf(map[target - v]!!, i)
            }
            map[v] = i
        }

        throw IllegalArgumentException()
    }
}

fun main() {
    val s = Solution()
    val nums = intArrayOf(6,4,3,8,7,5,2)
    val (result1, result2) = s.twoSum(nums, 5)
    println("result1=$result1, result2=$result2")
}