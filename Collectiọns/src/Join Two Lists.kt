import java.util.ArrayList;

fun main() {
    //hợp list
    var a1 = ArrayList<String>()
    a1.add("a")

    var a2 = ArrayList<String>()
    a2.add("b")

    var c = ArrayList<String>()

    c.addAll(a1)
    c.addAll(a2)
    print("{$c[1]}")
}