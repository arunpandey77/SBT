fun fibonacci(n: Int): Int {
    if (n <= 0) return 0
    if (n == 1) return 1

    var a = 0
    var b = 1
    var c = 0

    for (i in 2..n) {
        c = a + b
        a = b
        b = c
    }

    return b
}

fun main() {
    val n = 10
    println("Fibonacci series up to $n terms:")
    for (i in 0 until n) {
        print("${fibonacci(i)} ")
    }
    println()
}