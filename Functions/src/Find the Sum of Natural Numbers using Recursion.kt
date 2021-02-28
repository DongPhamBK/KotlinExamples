fun main() {
    //đệ quy cho tổng ak
    //tính tổng từ 1 đến n
    print(sumA(100))
}

fun sumA(a: Int): Int {
    if (a == 1)
        return 1

    return a + sumA(a - 1)
}