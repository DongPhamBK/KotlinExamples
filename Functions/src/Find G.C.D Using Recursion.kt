fun main() {
print(gcD(23234,4532))
}

fun gcD(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcD(b, a % b)
}