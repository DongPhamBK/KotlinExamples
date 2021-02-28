fun main() {
    //hiển thị dãy fibonacci
    print(1)
    print(" " + 1)
    var a = 1
    var b = 1
    var c: Int
    for (i in 1..10) {
        c = a + b
        print(" " + c)
        a = b
        b = c
    }
}