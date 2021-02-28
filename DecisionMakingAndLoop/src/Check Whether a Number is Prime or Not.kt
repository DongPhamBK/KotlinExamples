fun main() {
    //số nguyên tố
    println("Nhập 1 số:")
    var input = readLine()!!
    var a: Int = input.toInt()
    for (i in 2..Math.sqrt(a.toDouble()).toInt()) {
        if (a % i == 0)
            print("No")
    }


}