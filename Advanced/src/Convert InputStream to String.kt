import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() {
    //thao tác với InputStream
    var stream = ByteArrayInputStream("Hello".toByteArray())
    var sb = StringBuilder()
    var line: String?

    var br = BufferedReader(InputStreamReader(stream))
    line = br.readLine()

    while (line != null) {
        sb.append(line)
        line = br.readLine()
    }
    br.close()
    print("{$br}")
}