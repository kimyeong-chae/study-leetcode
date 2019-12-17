class Solution8 {
    fun judgeCircle(moves: String): Boolean {
        // x, y
        var (x, y) = Pair(0, 0)

        for(value in moves.toCharArray()) {
            when (value) {
                'R' -> x += 1
                'L' -> x -= 1
                'U' -> y += 1
                'D' -> y -= 1
             }
        }

        return x == 0 && y == 0
    }
}