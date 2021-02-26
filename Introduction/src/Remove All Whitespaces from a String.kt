fun main() {
    //xoá mọi khoảng trắng hình như có hàm thì phải
    var str: String = " ks  sđ cdldl   clsd slcdl   sd  "
    var str1 = str.replace("\\s".toRegex(), "")
    /*
    kí tự \\s là khoảng trắng duy nhất, ta sẽ xoá dần nó !
    */
    println(str1)
}