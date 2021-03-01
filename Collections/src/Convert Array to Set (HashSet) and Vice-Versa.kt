fun main() {
    //lại là chuyển đổi !
    var set: HashSet<String> = HashSet()
    set.add("a")
    set.add("s")
    set.add("dd")

    var arr = arrayOfNulls<String>(set.size)
    set.toArray(arr)
    arr.forEach { x -> println(x) }
}