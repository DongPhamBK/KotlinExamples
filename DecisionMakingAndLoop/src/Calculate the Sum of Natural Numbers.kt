fun main() {
    //tổng ảng
    var ar: IntArray = intArrayOf(1, 2, 4, 2, 6, 3)
    var sum = 0
    for (i in ar) {
        sum += i
    }
    println("Sum = $sum")
}