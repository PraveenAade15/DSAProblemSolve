class StockPrice {


    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            }
            val profit = price - minPrice
            if (profit > maxProfit) {
                maxProfit = profit
            }
        }

        return maxProfit
    }

}
fun main() {
    val twoSum = StockPrice()
    val result = twoSum.maxProfit(intArrayOf(8, 9, 3, 1,3,4))
    println("result : $result")
}