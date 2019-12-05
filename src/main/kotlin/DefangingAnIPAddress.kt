class Solution1 {
    fun defangIPaddr(address: String): String {
        var result: String = ""
        for (value in address.toCharArray()) {
            result += if (value === '.') "[.]" else value
        }
        return result
    }
}

fun main() {
    val s = Solution1()
    val address = "0.0.0.0"
    val result = s.defangIPaddr(address)
    println("result=$result")
}