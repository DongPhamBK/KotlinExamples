fun main() {
    //đảo ngược số !
    var a: Int = 12345
    var b: Int = 0
    while (a != 0) {
        b = b * 10 + a % 10//tăng b
        a = a / 10//giảm a
    }
    print(b)
}