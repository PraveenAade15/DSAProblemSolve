//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    reverseString("Praveen aade is a very good boy")
}

fun reverseString(stringName: String) {
    val reverseString = stringName.split(" ,").reversed().joinToString()

    print(reverseString)
}