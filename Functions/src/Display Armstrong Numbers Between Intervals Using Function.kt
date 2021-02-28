fun main() {
    //số Armstrong
    var a = 999
    var b = 9999
    for (i in a + 1..b - 1) {
        if (arm(i)) {
            print(" " + i)
        }
    }
}

fun arm(num: Int): Boolean {
    var digits = 0//số chữ số
    var result = 0 //đối chứng
    var num1 = num

    while (num1 != 0) {
        num1 /= 10
        digits++
    }

    num1 = num

    while (num1 != 0) {
        result += Math.pow((num1 % 10).toDouble(), digits.toDouble()).toInt()
        num1 /= 10
    }

    if (result == num)
        return true
    return false
}