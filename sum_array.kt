fun sumArray(arr: IntArray): Int {
    var sum = 0
    for (value in arr) {
        sum += value
    }
    return sum
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val result = sumArray(numbers)
    println("Sum of array = $result")
}