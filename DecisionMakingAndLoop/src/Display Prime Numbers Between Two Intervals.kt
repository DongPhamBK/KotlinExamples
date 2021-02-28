fun main() {
    //số nguyên tố trong 1 khoảng
    //sàng nguyên tố ak
    var low: Int = 2
    var high: Int = 100

    while (low < high) {
        var flag = false

        for (i in 2..low / 2) {
            // condition for nonprime number
            if (low % i == 0) {
                flag = true
                break
            }
        }

        if (!flag)
            print("$low ")
        ++low
    }
}