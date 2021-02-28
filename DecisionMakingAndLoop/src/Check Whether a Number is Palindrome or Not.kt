fun main() {
    //palindrome
    //tự nhiên nhớ môn KTLT !!!
    var a = 123454321
    var b: Int = 0
    // đảo ngược vẫn thế là được chứ gì !
    var c = a
    while (c != 0) {
        b = b * 10 + c % 10
        c = c / 10
    }
    if (a == b) {
        println("Palindrome")
    } else {
        print("No")
    }
}