fun main() {
    val row = 2
    val column = 3
    val matrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 6, 4))

    // Display current matrix

    // Transpose the matrix
    val transpose = Array(column) { IntArray(row) }
    for (i in 0..row - 1) {
        for (j in 0..column - 1) {
            transpose[j][i] = matrix[i][j]
        }
    }

    // Display transposed matrix
    println("The matrix is: ")
    for (row in matrix) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}

