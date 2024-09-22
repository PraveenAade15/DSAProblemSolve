class MyArray{

    fun printIndex(array:Array<Int>){
        for (i in array.indices){
            print(array[i])
            if (i<array.lastIndex){
                print(", ")
            }
        }

    }
//    fun printArray(){
//       print(array.joinToString(" ,"))
//    }
}
fun main(){
    val arrayList= arrayOf(1,2,3,4,5)
    val array= MyArray()
    array.printIndex(arrayList)
}













//class MyArray {
//    val array = arrayOf(1, 2, 3, 4, 5)
//
//    fun printArray() {
//        println(array.joinToString(", "))  // Print the array
//    }
//}
//
//fun main() {
//    val myArray = MyArray()
//    myArray.printArray()  // Output: 1, 2, 3, 4, 5
//}
