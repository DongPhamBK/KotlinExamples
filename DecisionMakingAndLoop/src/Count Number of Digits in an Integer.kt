fun main() {
    // số các chữ số
    var a: Int = 1928347
    var temp = 0;
    while (a != 0) {
        a = a / 10//giảm 1 lần
        temp++
    }
    println(temp)
}