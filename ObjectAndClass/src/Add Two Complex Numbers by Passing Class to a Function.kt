class Complex(internal var real: Double, internal var imgag: Double)

fun main() {
    var n1 = Complex(1.1, 3.4)
    var n2 = Complex(2.3, 5.7)
    var temp: Complex
    temp = add(n1, n2)
    println(" " + temp.real + " " + temp.imgag)
}

fun add(x: Complex, y: Complex): Complex {
    var z: Complex = Complex(0.0, 0.0)
    z.real = x.real + y.real
    z.imgag = x.imgag + y.imgag
    return z
}