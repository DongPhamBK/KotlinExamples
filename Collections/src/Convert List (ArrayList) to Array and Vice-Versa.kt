fun main() {
    //chuyển mảng ra list
    var a: Array<String> = arrayOf("1", "d")
    var b: List<String>
    b = a.toList()

    var c: Array<String>
    c = b.toTypedArray()

    c.forEach { i -> println(i) }
}