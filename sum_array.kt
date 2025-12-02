fun sumArray(arr: IntArray): Int {
    var sum = 0
    for (element in arr) {
        sum += element
    }
    return sum
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val result = sumArray(numbers)
    println("Sum of array = $result")
}