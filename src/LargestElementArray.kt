class LargestElementArray {
    //nums=[2,3,1,5,4,9,8,7]
    fun largestElementArray(nums:IntArray){
        var largestElementArray=nums[0]
       for (i in nums.indices){
           if(largestElementArray <nums[i]){
             largestElementArray=nums[i]
           }

       }
        print(largestElementArray.toString())
    }
}
fun main() {
    val moveZeroes = LargestElementArray()
    val nums1 = intArrayOf(2,3,1,5,4,9,8,7)
    moveZeroes.largestElementArray(nums1)

//    val nums2 = intArrayOf(0)
//    moveZeroes.moveZeroes(nums2)
//    println(nums2.joinToString())  // Output: [0]
}