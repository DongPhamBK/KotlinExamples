fun main() {
    //tìm UCNN
    // chơi quả đệ quy giờ !
    print("${gcd(2325, 215)}")
}

fun gcd(x: Int, y: Int): Int {
    if (y == 0) return x
    return gcd(y, x % y)
}
