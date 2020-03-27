package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sumWithoutAnna = (bill.sum() - bill[k]) / 2
        if (sumWithoutAnna != b) {
            return (b - sumWithoutAnna).toString()
        } else{
            return "Bon Appetit"
        }
    }
}
