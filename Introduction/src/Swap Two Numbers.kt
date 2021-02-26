fun main() {
    //đổi chỗ 2 số ak
    var a = 1
    var b = 2
    println("a = $a, b = $b ")
    var c = a
    a = b
    b = c
    println("a = $a, b = $b ")

    // hình như ta có 1 cách khác hay hơn thì phải
    a = a + b
    b = a - b
    a = a - b
    println("a = $a, b = $b ")


}