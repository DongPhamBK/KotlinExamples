fun main() {
    //độ lệch chuẩn
    val numArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    var SD:Double = calculateSD(numArray)

    print("Độ lệch chuẩn = %.6f".format(SD))
}

fun calculateSD(numArray: DoubleArray): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (num in numArray) {
        sum += num
    }

    val mean = sum / 10

    for (num in numArray) {
        standardDeviation += Math.pow(num - mean, 2.0)
    }

    return Math.sqrt(standardDeviation / 10)
}