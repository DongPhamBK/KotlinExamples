fun main() {
    // đếm nguyên âm và phụ âm
    //ok

    var line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
            "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
            "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, " +
            "sunt in culpa qui officia deserunt mollit anim id est laborum. 10928374"
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u'
        ) {
            ++vowels
        } else if (ch in 'a'..'z') {
            ++consonants
        } else if (ch in '0'..'9') {
            ++digits
        } else if (ch == ' ') {
            ++spaces
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
    println("Digits: $digits")
    println("White spaces: $spaces")
}