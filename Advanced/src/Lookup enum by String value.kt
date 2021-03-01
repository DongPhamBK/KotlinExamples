enum class TextStyle {
    BOLD, ITALICS, UNDERLINE, STRIKETHROUGH
}

fun main(args: Array<String>) {

    val style = "Bold"

    val textStyle = TextStyle.valueOf(style.toUpperCase())

    println(textStyle)

}