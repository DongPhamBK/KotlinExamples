fun main() {
    //tìm số lần xuất hiển của 1 chữ trong 1 chuỗi
    var str = "Lorem Ipsum is simply dummy text" +
            " of the printing and typesetting industry. Lorem Ipsum " +
            "has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled" +
            " it to make a type specimen book. It has survived not only " +
            "five centuries, but also the leap into electronic typesetting," +
            " remaining essentially unchanged. It was popularised in the 1960s" +
            " with the release of Letraset sheets containing Lorem Ipsum passages, " +
            "and more recently with desktop publishing software like Aldus PageMaker " +
            "including versions of Lorem Ipsum."
    
    var s = 'a'
    var freq = 0
    for (i in 0..(str.length - 1)) {
        if (str[i].equals(s)) {
            freq++
        }
    }

    print(freq)
}