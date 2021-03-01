import java.io.File
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    //điền vào file
    var path = System.getProperty("user.dir") + "\\src\\test.txt"
    var str = "Thêm đoạn này vào tệp"
    try {
        Files.write(Paths.get(path), str.toByteArray(), StandardOpenOption.APPEND)
    } catch (e: Exception) {
        e.printStackTrace()
    }

    //cách này
    try {
        val fw = FileWriter(path, true)
        fw.write(str)
        fw.close()
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
}