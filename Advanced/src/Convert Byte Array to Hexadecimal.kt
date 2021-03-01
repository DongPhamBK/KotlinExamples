fun main() {
    //chuyển byte ra hex
    //có hàm luôn !

    var b = byteArrayOf(10, 12, 3, 4)
    for (i in b) {
        var s = String.format("%05X", i)//05 là có 5 kí tự !
        println(s)
    }
}