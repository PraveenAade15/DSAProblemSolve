fun String.isPalindrome():Boolean{
    return this==this.reversed()
}
fun main(args: Array<String>) {
   val words="naman"
  print(" ${words.isPalindrome()}")
}