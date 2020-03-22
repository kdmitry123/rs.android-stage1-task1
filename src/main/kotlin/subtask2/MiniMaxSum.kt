package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val sum = input.sum()
        val max = input.max()
        val min = input.min()
        return arrayOf(sum - max!!, sum - min!!).toIntArray()

    }
}
