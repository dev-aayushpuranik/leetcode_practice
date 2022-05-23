package problems

class LargestAtleastTwice {

    fun largestAtLeastTwice() {
        val nums = IntArray(4)
        nums.set(0, 1)
        nums.set(1, 2)
        nums.set(2, 3)
        nums.set(3, 0)

        println(findLargestTwiceAtLeast(nums))
    }

    private fun findLargestTwiceAtLeast(nums: IntArray) : Int {
        var largest = nums[0]

        for(i in nums.indices) { if(nums[i] > largest) largest = nums[i] }


        var index = 0

        for(i in nums.indices) {
            if(largest != nums[i] && (nums[i]*2) > largest) {
                index = -1
                break;
            } else {
                index = nums.indexOf(largest)
            }
        }
        return index
    }
}