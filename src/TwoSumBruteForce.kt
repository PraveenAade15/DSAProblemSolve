class TwoSumBruteForce {
    fun twoSumBruteForce(nums:IntArray,target:Int):IntArray{
        for (i in nums.indices){
            for (j in i+1 until nums.size){
                if (nums[i]+nums[i+1]==target){
                    return intArrayOf(i+1,j+1)
                }
            }
        }
        return intArrayOf()
    }
}
fun main() {
    val numbers1 = intArrayOf(2, 7, 11, 15)
    val target1 = 9
    val two=TwoSumBruteForce()
    println(two.twoSumBruteForce(numbers1, target1).contentToString()) // Output: [1, 2]

    val numbers2 = intArrayOf(2, 3, 4)
    val target2 = 6
    println(two.twoSumBruteForce(numbers2, target2).contentToString()) // Output: [1, 3]
}
