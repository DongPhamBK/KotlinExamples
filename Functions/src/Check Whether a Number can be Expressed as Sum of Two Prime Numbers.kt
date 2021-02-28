fun main() {
    //số nguyên tố là tổng 2 số nguyên tố !
    var a = 34
    var flag = false
    for (i in 2..a / 2) {
        if (primea(i) && primea(a - i)) {
            flag = true
            break
        }
    }
    if (flag)
        print("Đúng")
}

fun primea(a: Int): Boolean {

    var flag = true
    for (i in 2..a / 2) {
        if (a % i == 0) {
            flag = false
            break
        }
    }

    return flag
}