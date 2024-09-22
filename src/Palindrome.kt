
fun main(args: Array<String>) {
    val name="naman"
   print(name.isPalindromeString())
}
fun String.isPalindromeString():Boolean{
   return this==this.reversed()
}