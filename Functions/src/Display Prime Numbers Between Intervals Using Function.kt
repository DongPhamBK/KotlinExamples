fun main() {
    //lại số nguyên tố
    var x = 2
    var y = 100
    for (i in x..y) {
        if (prime(i))
            print(" " + i)
    }
}

fun prime(a: Int): Boolean {
    var flag = true
    for (i in 2..a / 2) {
        if (a % i == 0) {
            flag = false
            break
        }
    }

    return flag

}