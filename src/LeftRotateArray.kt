class LeftRotateArray {
    fun leftRotateArray(nums: IntArray):IntArray{
        val temp=nums[0]
        for (i in 1 until nums.size) {
            nums[i-1]=nums[i]
        }
        nums[nums.size-1]=temp
        return nums
    }

}
fun main() {
    val twoSum = LeftRotateArray()
    val result = twoSum.leftRotateArray(intArrayOf(8, 9, 3, 1,3,4))
    println("result : ${result.joinToString() }}")
}