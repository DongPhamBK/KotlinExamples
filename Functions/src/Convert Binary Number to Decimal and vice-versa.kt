import java.text.DecimalFormat

fun main() {
    //số nhị phân
    //chuyển từ thập phân sang nhị phân thôi !
    var c = Decimal(12)
    print(c)
}

fun Decimal(a: Int): Int {
    var a1 = a
    var binaryNumber = 0
    var p: Int = 0
    while (a1 > 0) {
        binaryNumber += (a1 % 2) * Math.pow(10.0, p.toDouble()).toInt()
        p++
        a1 /= 2
    }

    return binaryNumber
}