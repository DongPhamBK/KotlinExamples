class Person {
    var name: String = ""
    var age: Int? = 0
    var address: String = ""

    constructor() {
    }

    constructor(name: String, age: Int, address: String) {
        this.name = name
        this.age = age
        this.address = address
    }

    override fun toString(): String {
        return "Name: ${name}, age: ${age}, address: ${address}"
    }

}