package problems

class FindPivot {
    fun callFindPivot() {
        // [1,7,3,6,5,6]
        val nums = IntArray(6)
        nums[0] = 1
        nums[1] = 7
        nums[2] = 3
        nums[3] = 6
        nums[4] = 5
        nums[5] = 6


        val pivot = findPivot(nums)
        println(pivot)
    }

    // region find pivot
    private fun findPivot(nums: IntArray) : Int {
        var p = 0

        for (index in nums.indices) {
            var lSum = 0
            var rSum = 0
            p = index

            for (i in nums.indices) {

                if (i < p) {
                    lSum += nums[i]
                }
                if (i > p) {
                    rSum += nums[i]
                }
            }

            if (lSum == rSum) {
                break;
            } else {
                p = -1
            }
        }
        return p
    }

        // endregion
}