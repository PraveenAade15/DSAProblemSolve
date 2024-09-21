
fun main() {
    val arr1 = arrayOf("flower", "flow", "flight")
    val arr2 = arrayOf("dog", "racecar", "car")

    println(longestCommonPrefix(arr1)) // Output: "fl"
    println(longestCommonPrefix(arr2)) // Output: "-1"
}

fun longestCommonPrefix(arr: Array<String>): String {
    if (arr.isEmpty()) return "-1"

    var prefix = arr[0] // Start with the first string as the initial prefix

    for (i in 1 until arr.size) {
        while (arr[i].indexOf(prefix) != 0) {
            // Shorten the prefix until it matches the start of arr[i]
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return "-1"
        }
    }

    return prefix
}