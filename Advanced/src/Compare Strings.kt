fun main() {
    //so sánh
    val style = "Bold"
    val style2 = "Bold"

    if (style == style2)
        println("Equal")
    else
        println("Not Equal")

    //hay chưa !
    if (style === style2)
        println("Equal")
    else
        println("Not Equal")
}