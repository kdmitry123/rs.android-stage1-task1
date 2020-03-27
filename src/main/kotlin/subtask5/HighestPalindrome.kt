package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var counter = 0
        var max = digitString.max()
        var sb = StringBuilder(digitString)
        for (i in 0 until digitString.length / 2) {
            if (digitString[i] != digitString[digitString.length - i - 1]) {
                if (max != null) {
                    sb[i] = max
                    sb[digitString.length - i - 1] = max
                    counter++
                }
            }
            if (counter > k) {
                return (-1).toString()
            }
        }
        return sb.toString()
    }
}
