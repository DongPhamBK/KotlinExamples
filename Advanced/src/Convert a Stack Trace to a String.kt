import java.io.PrintWriter
import java.io.StringWriter

fun main() {
    //chuyển lỗi ak ?!
    try {
        val division = 0 / 0//chia cho 0, bị lỗi và sẽ in ra !
    } catch (e: ArithmeticException) {
        val sw = StringWriter()
        e.printStackTrace(PrintWriter(sw))
        val exceptionAsString = sw.toString()
        println(exceptionAsString)
    }
}