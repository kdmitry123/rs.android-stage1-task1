package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var sum = input.sum()
        var max = input.max()
        var min = input.min()
        return arrayOf(sum - max!!, sum - min!!).toIntArray()

    }
}
