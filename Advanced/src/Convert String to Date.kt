import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    //ngày
    var str: String = "2021-01-01"
    var date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE)
    print(date)
}