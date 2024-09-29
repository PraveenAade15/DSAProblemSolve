//class TwoSumMethod {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        for (i in nums.indices) {
//            for (j in i + 1 until nums.size) {
//                if (nums[i] + nums[j] == target) {
//                    return intArrayOf(i, j)
//                }
//            }
//        }
//        return intArrayOf()
//
//    }
//
//}
//fun main() {
//    val twoSum = TwoSumMethod()
//    val result = twoSum.twoSum(intArrayOf(1, 2, 3,9), 12)
//
//    // Print the result in a readable format
//    println("Indices: ${result.joinToString(", ")}")  // Output: Indices: 0, 1
//}


//Method 2
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numMap = mutableMapOf<Int, Int>()  // To store numbers and their indices

        for (i in nums.indices) {
            val complement = target - nums[i]  // Calculate the complement
            if (numMap.containsKey(complement)) {
                return intArrayOf(numMap[complement]!!, i)  // Return the indices if found
            }
            numMap[nums[i]] = i  // Store the current number and its index
        }

        throw IllegalArgumentException("No two sum solution")  // Throw if no solution found
    }
}

fun main() {
    val twoSum = TwoSum()
    val result = twoSum.twoSum(intArrayOf(1, 2, 3, 9), 12)

    // Print the result in a readable format
    println("Indices: ${result.joinToString(", ")}")  // Output: Indices: 2, 3
}

