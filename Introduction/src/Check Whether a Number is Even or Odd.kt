fun main() {
    // số chẵn hay lẻ
    println("Nhập số: ")
    var input = readLine()
    var number = input!!.toInt()//dấu !! là bắt buộc có !
    if (number % 2 == 0) {
        println("Số chẵn")
    } else {
        println("Số lẻ")
    }
}