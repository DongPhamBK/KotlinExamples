fun main() {
    //số Armstrong là số
    //abcd ... = a^n + b^n + c^n + d^n + ...
    var number = 1634
    var originalNumber: Int
    var remainder: Int
    var result = 0
    var n = 0

    originalNumber = number

    while (originalNumber != 0) {
        originalNumber /= 10
        ++n//số các chữ số !
    }

    originalNumber = number

    while (originalNumber != 0) {
        remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
        originalNumber /= 10
    }

    if (result == number)
        println("$number là số Armstrong!")
    else
        println("$number không là số Armstrong!")
}