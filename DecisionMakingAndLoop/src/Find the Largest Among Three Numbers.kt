fun main() {
    //số lớn nhất
    println("Nhập a:")
    var a1 = readLine()!!
    var a = a1.toInt()
    println("Nhập b:")
    var b1 = readLine()!!
    var b = b1.toInt()
    println("Nhập c:")
    var c1 = readLine()!!
    var c = c1.toInt()
    if (a > b) {
        if (a > c) {
            println("Max = " + a)
        } else {
            println("Max = c")
        }
    } else {
        if (c > b) {
            println("Max  = " + c)
        } else {
            println("Max = " + b)
        }
    }
}
