package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val arrayOfBrackets = listOf('<', '(', '[', '>', ')', ']')
        val outputArray = ArrayList<String>()
        val sb = StringBuilder(inputString)
        for (i in sb.length - 1 downTo 0) {
            if (sb[i] in arrayOfBrackets.subList(0, 3)) {
                var last = 0
                for (elem in i until sb.length) {
                    if (sb[elem] == arrayOfBrackets[arrayOfBrackets.indexOf(inputString[i]) + 3]) {
                        last = elem
                        sb[i] = ' '
                        sb[last] = ' '
                        break
                    }
                }
                outputArray.add(0, inputString.substring(i + 1, last))
            }
        }
        return outputArray.toTypedArray()
    }
}
