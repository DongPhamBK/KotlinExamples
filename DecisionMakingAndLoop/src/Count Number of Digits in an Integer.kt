fun main() {
    // số các chữ số
    var a: Int = 1928349381
    var temp = 0;
    while (a != 0) {
        a = a / 10//giảm 1 lần
        temp++
    }
    println(temp)
    print("Đó là số các chữ số !")
}