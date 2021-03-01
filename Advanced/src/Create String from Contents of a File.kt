import java.io.File
import java.lang.reflect.Array.get
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.Paths.get

fun main() {
    //thao tác file thì cứ làm bình thường
    var path = System.getProperty("user.dir") + "\\src\\test.txt"
    var encoding = Charset.defaultCharset()
    var lines = Files.readAllLines(Paths.get(path), encoding)
    println(lines)

    //kiểu này hay hơn
    var lines2 = String(Files.readAllBytes(Paths.get(path)), Charset.defaultCharset())
    println(lines2)
}