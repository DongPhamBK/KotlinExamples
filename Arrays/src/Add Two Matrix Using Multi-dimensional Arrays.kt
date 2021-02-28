fun main() {
    //ma trận !
    val rows = 3
    val columns = 3
    val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3), intArrayOf(5, 21, 3))
    val secondMatrix = arrayOf(intArrayOf(-4, 5, 3), intArrayOf(5, 6, 3), intArrayOf(5, 12, 31))

    //cách khai báo trên hay thật !!!
    // Adding Two matrices
    val sum = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }

    // Displaying the result
    println("Tổng 2 ma trận : ")
    for (row in sum) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}