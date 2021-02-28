fun main() {

    //tìm kiếm
    val num = intArrayOf(1, 2, 3, 4, 5)
    val toFind = 3
    var found = false

    for (n in num) {
        if (n == toFind) {
            found = true
            break
        }
    }

    if (found)
        println("$toFind có trong mảng.")
    else
        println("$toFind không có trong mảng.")

}