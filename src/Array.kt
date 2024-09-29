class MyArray{

    fun printIndex(array:Array<Int>){
        for (i in array.indices){
            print(array[i])
            if (i<array.lastIndex){
                print(", ")
            }
            println()
        }

    }
}
fun main(){
    val arrayList= arrayOf(1,2,3,4,5)
    val array= MyArray()
    array.printIndex(arrayList)
}

