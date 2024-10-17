package strings

class ReverseString {
    fun reverseString(originalString: String) {
        val reverseString = originalString.reversed()
        print("$reverseString")

    }
}

fun main() {
    val reverseString = ReverseString()
    reverseString.reverseString("hello")
}