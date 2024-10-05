class RemoveDublicateArray {
    fun removeDuplicates(nums: IntArray): Int {
        var uniqueIndex=1
        for (i in 1 until nums.size) {
            if (nums[i]!=nums[i-1]){
                nums[uniqueIndex]=nums[i]
                uniqueIndex++
            }

        }
        return uniqueIndex

    }
}
fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val removeDublicateArray = RemoveDublicateArray()
    val newLength =removeDublicateArray.removeDuplicates(nums)
    for (i in 0 until newLength) {
        print("${nums[i]}")

    }
}