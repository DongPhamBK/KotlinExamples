class Time(internal var hour: Int, internal var minutes: Int, internal var seconds: Int)

fun main() {
    var a = Time(11, 2, 3)
    var b = Time(4, 5, 6)
    var c: Time

    c = hour(a, b)
    print("${c.hour}   ${c.minutes}   ${c.seconds} ")
}

fun hour(x: Time, y: Time): Time {
    var z: Time = Time(0, 0, 0)
    if (y.seconds > x.seconds) {
        --x.minutes
        x.seconds += 60
    }
    z.seconds = x.seconds - y.seconds
    if (y.minutes > x.minutes) {
        --x.hour
        x.minutes += 60
    }

    z.minutes = x.minutes - y.minutes
    z.hour = x.hour - y.hour

    return z
}