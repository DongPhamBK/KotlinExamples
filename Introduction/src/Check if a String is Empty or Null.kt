fun main() {
    //kiểm tra null hoặc empty
    var s: String = ""
    var s1: String? = null

    if (s?.isEmpty())
        println("S trống")
    if (s1 == null) {
        print("S1 null")
    }
}