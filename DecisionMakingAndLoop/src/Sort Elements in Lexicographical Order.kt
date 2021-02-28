fun main() {
    // xếp từ điển
    var a = arrayOf("ak", "ns", "saa", "sls")
    for (i in 0..2) {
        for (j in i + 1..3) {
            if (a[i].compareTo(a[j]) > 0) {
                var temp = a[i]
                a[i] = a[j]
                a[j] = temp
            }
        }
    }
    println("Kết quả: ")
    for (i in 0..3) {
        println(a[i])
    }
}