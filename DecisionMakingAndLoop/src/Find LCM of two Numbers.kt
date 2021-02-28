fun gcda(x: Int, y: Int): Int {
    if (y == 0) return x
    return gcda(y, x % y)
}

fun main() {
    //tim BCLN
    //ta se dung lai ham gcd
    print((232 * 12) / gcda(232, 12))
}

