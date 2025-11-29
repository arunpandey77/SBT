fun sumArray(arr: IntArray, length: Int): Int {
    var sum = 0
    for (i in 0 until length) {
        sum += arr[i]
    }
    return sum
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val length = numbers.size
    val result = sumArray(numbers, length)
    println("Sum of array = $result")
}