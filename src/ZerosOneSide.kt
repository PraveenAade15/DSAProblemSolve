//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]
class ZerosOneSide {
    //  nums = [0,1,0,3,12]
    fun moveZeroes(nums: IntArray) {
        var lastNonZeroIndex = 0

        // Move all non-zero elements to the front of the array
        for (i in nums.indices) {
            if (nums[i] != 0) {
                // Swap the non-zero element with the element at lastNonZeroIndex
                nums[lastNonZeroIndex] = nums[i]
                lastNonZeroIndex++
                print("array" + nums[i])
                print("lastNonZeroIndex" + lastNonZeroIndex)
            }
        }

        // Fill the rest of the array with zeros
        for (i in lastNonZeroIndex until nums.size) {
            nums[i] = 0
        }
    }


}

fun main() {
    val moveZeroes = ZerosOneSide()
    val nums1 = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes.moveZeroes(nums1)
    println(nums1.joinToString())  // Output: [1, 3, 12, 0, 0]

//    val nums2 = intArrayOf(0)
//    moveZeroes.moveZeroes(nums2)
//    println(nums2.joinToString())  // Output: [0]
}