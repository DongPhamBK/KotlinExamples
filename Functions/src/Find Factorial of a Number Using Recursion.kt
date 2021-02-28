fun main() {
    //giai thừa với đệ quy
print(gt(10))
}

fun gt(a: Int): Int {
    if (a == 1)
        return 1
    return a * gt(a - 1)
}