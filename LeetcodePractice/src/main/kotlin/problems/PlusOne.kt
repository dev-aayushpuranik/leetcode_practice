package problems

class PlusOne {
//
    fun callPlusOne() {
//        val nums = IntArray(10)
//        nums[0] = 9
//        nums[1] = 8
//        nums[2] = 7
//        nums[3] = 6
//        nums[4] = 5
//        nums[5] = 4
//        nums[6] = 3
//        nums[7] = 2
//        nums[8] = 9
//        nums[9] = 9

        val nums = IntArray(2)
        nums[0] = 8
        nums[1] = 9

    val solution = Solution()
        println(solution.plusOne(nums))

    }
//
//    private fun plusOne(digits: IntArray): IntArray {
//
//        var lastIndex = digits.size -1
//
//        while(lastIndex >= 0) {
//            val lastNumber = digits[lastIndex]
//            if(lastNumber >= 9) {
//                val carry = (lastNumber + 1) % 10
//                digits[lastIndex] = carry
//            } else {
//                digits[lastIndex] += 1
//                break
//            }
//            if(lastIndex == 0) {
//                val digits2 = IntArray(digits.size+1)
//                digits2[0] = 1
//                return digits2.plus(digits)
//            }
//            lastIndex -=1
//        }
//        return digits
//    }
}

class Solution {
    fun plusOne(digits: IntArray): IntArray {

        var lastIndex = digits.size -1

        while(lastIndex >= 0) {
            val lastNumber = digits[lastIndex]
            if(lastNumber >= 9) {
                val carry = (lastNumber + 1) % 10
                digits[lastIndex] = carry
            } else {
                digits[lastIndex] += 1
                break
            }
            if(lastIndex == 0) {
                val digits2 = IntArray(digits.size+1)
                digits2[0] = 1
                for (i in 1 until digits2.size) {
                    digits2.set(i, 0)
                }
                return digits2
            }
            lastIndex -=1
        }

        for (i in digits.indices) {
            println(digits[i])
        }

        return digits
    }
}