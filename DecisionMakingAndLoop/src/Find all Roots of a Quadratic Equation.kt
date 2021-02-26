fun main() {
    //Nghiệm của phương trình bậc 2
    //ta làm nhanh chóng vậy !
    var a = 1
    var b = -3
    var c = 2

    var d = b * b - 4 * a * c
    var e = Math.sqrt(d.toDouble())
    var x1 = (-b - e) / (2 * a.toDouble())
    var x2 = (-b + e) / (2 * a.toDouble())
    println("x1 = $x1, x2 = $x2")
}