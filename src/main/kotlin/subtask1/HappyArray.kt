package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val resultArray = sadArray.toMutableList()
        var index = 1
        while (resultArray.size >= 3 && index < resultArray.size - 1) {
            if (resultArray[index] > resultArray[index - 1] + resultArray[index + 1]) {
                resultArray.removeAt(index)
                if (index > 1) index--
            } else {
                index++
            }
        }
        return resultArray.toIntArray()
    }
}
