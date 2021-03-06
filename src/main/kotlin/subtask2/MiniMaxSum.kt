package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val sumOfElements = input.sum()
        val maxElem = input.max()
        val minElem = input.min()
        return arrayOf(sumOfElements - maxElem!!, sumOfElements - minElem!!).toIntArray()

    }
}
