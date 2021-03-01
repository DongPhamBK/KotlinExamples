import java.lang.Double.parseDouble
fun main() {
    //numberic
    //bài cuối cùng của series rồi !
    var string  = "12345"
    var numberic = true
    try {
        var num  = parseDouble(string)
    }catch (e:Exception){
        e.printStackTrace()
        numberic = false
    }

    if (numberic)
        print("Được !")
    else
        print("Không !")
}