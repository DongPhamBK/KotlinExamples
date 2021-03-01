import java.util.concurrent.TimeUnit

fun main() {
    //chuyển giây
    var mm = 1000000
    var m = TimeUnit.MILLISECONDS.toMinutes(mm.toLong())
    var s = TimeUnit.MILLISECONDS.toSeconds(mm.toLong())

    print("$m phút hoặc $s giây")

}