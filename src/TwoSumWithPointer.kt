class TwoSumWithPointer {
    fun twoSum(nums: IntArray, target: Int): Pair<Int, Int>? {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val sum = nums[left] + nums[right]
            when {
                sum == target -> return Pair(nums[left], nums[right])
                sum < target -> left++
                else -> right--

            }

        }
        return null
    }


}
fun main() {
    val twoSumWithPointer = TwoSumWithPointer()
    val nums = intArrayOf(1, 2, 3, 4, 6, 8, 11)
    val target = 10
    val result = twoSumWithPointer.twoSum(nums, target)

    if (result != null) {
        println("Pair found at indices: ${result.first} and ${result.second}")
    } else {
        println("No pair found.")
    }
}