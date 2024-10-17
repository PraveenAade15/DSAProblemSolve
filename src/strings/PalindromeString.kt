package strings

class PalindromeString {
    fun palindromeString(originalString: String) {
        val palindromeString= originalString.reversed()
        if (originalString == palindromeString){
            print("true")
        }else{
            print("false")
        }
    }

}

fun main() {
    val reverseString = PalindromeString()
    reverseString.palindromeString("hello")
}