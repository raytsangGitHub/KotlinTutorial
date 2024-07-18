class TargetSum {
    fun hasPairWithTarget(arr: Array<Int>, target: Int): Int {
        var p = arr.size - 1
        var i = 0
        while (i < p) {
            if (arr[i] + arr[p] == target) {
                return 1
            } else if (arr[i] + arr[p] > target) {
                p--
            } else {
                i++
            }
        }

        return 0
    }

}