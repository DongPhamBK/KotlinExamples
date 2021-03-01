import java.util.*

fun main(args: Array<String>) {

    val list = ArrayList<CustomObject>()
    list.add(CustomObject("Z"))
    list.add(CustomObject("Aas"))
    list.add(CustomObject("Bdfs"))
    list.add(CustomObject("X"))
    list.add(CustomObject("Aa"))

    var sortedList = list.sortedWith(compareBy({ it.customProperty }))

    for (obj in sortedList) {
        println(obj.customProperty)
    }
}

public class CustomObject(val customProperty: String) {
}