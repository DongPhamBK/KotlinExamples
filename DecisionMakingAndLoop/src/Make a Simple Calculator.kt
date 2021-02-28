fun main() {
    //nhập phép tính
    println("Nhập phép tính")
    var input = readLine()!!
    var c: Char = input.get(0).toChar()
    when (c) {
        '+' -> println("5 + 5 = " + (5 + 5))
        '-' -> println("5 - 5 = " + (5 - 5))
        '*' -> println("5 * 5 = " + (5 * 5))
        '/' -> println("5 / 5 = " + (5 / 5))
        else -> println("Nhập lại !")
    }
}