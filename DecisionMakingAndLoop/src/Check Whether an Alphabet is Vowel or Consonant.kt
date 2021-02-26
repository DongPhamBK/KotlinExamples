fun main() {
    //kiểm tra nguyên âm hay phụ âm
    println("Nhập 1 ký tự: ")
    var input: String? = readLine()
    var ch: Char? = input?.get(0)//lấy 1 kí tự thôi !

    if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'u' || ch == '0') {
        println(" {$ch} là nguyên âm !")
    } else {
        print("Không phải nguyên âm !")
    }

    //dùng equal thì phức tạp hơn !
}