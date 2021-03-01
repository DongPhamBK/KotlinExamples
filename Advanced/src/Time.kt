import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    //ngày giờ hiện tại
    var current = LocalDateTime.now()
    println("Bây giờ là: $current")

    val current1 = LocalDateTime.now()

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formatted = current1.format(formatter)

    println("Bây giờ là: $formatted")
}