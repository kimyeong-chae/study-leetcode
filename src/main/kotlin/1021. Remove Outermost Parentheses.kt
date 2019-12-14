class Solution7 {
    fun removeOuterParentheses(S: String): String {
        val s = StringBuilder()
        var opened = 0
        for (c in S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c)
            if (c == ')' && opened-- > 1) s.append(c)
        }
        return s.toString()
    }
}

fun main() {
    val s = Solution7()
    val result = s.removeOuterParentheses("(()())(())")
    println("result=$result")
}