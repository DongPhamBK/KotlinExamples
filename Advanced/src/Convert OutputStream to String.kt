import java.io.ByteArrayOutputStream

fun main() {
    //giờ thì Output
    var stream = ByteArrayOutputStream()
    var line = "Ok đc rồi !"
    stream.write(line.toByteArray())
    var finalString = String(stream.toByteArray())
    print(finalString)
}