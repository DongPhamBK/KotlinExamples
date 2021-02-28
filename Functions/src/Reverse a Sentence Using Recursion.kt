fun main() {
    //đảo ngược từ
    print(reve("Hi name"))
}

fun reve(str: String): String {
    var rts = ""
    for (i in str.length - 1 downTo 0) {
        rts += str[i]
    }
    return rts
}