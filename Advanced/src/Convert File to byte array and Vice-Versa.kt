import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

fun main() {
    //mã này cần thiết thì chưa rõ !
    var path = System.getProperty("user.dir") + "\\src\\test.txt"
    try {
        val encoded = Files.readAllBytes(Paths.get(path))
        println(Arrays.toString(encoded))
    } catch (e: IOException) {

    }
}