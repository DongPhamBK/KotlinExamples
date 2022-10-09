fun main() {
    //let
    println("----------let------------")
    var person: Person = Person("Minh", 10, "HN")
    //lẽ ra ta đã có thể gán luôn result = person
    //thêm let để kiểm tra có rỗng hay không !
    var value = person?.let {
        it.name
        //it chính là nội tại của value ! ở đây ta sẽ lấy ra name vì value  = persion
    }
    println(value)//in ra tên, vì ta lấy nội tại rồi mà
    println(person)

    val person1 = Person("Nguyen Van A", 23, "Quang Nam")
    val value1 = person1.let {
        if (it.age!! >= 18) {
            1999
        } else {
            false
        }
    }
    println(value1)
    println(person1)
    // output: true, cái này hay đấy chứ !, biến value1 có vẻ rất linh động tuỳ vào kiểu mình muốn gán cho nó !



    println("----------also------------")

    val person2 = Person("Nguyen Van A", 23, "Quang Nam")
    val value2 = person2?.also {
        it.name = "Tran Van C"
    }.run {
        this
    }
    println(value2)
    //output: Name: Tran Van C, age: 23, address: Quang Nam
    println(person2)
    //also
    val person3: Person = Person("Nguyen Van A", 23, "Quang Nam")
    val value3 = person3?.also {
        it.name = "Tran Van C"
    }.run {
        this
    }
    println(value3)
    println(person3)
    //output: Name: Tran Van C, age: 23, address: Quang Nam
    //nói chung nó trả về đối tượng, và làm thay đổi thuộc tính luôn !
    //đổi cả của person3

    println("----------apply------------")
    //apply
    val person4 = Person("Nguyen Van A", 23, "Quang Nam")
    val value4 = person.apply{
        name = "Tran Van C"
        address = "Da Nang"
    }
    println(value4)
    println(person4)
    // output: Name: Tran Van C, age: 23, address: Da Nang
    //khác also ở chỗ không thèm dùng it, gọi thẳng phương thức luôn !
    //nó không đổi giá trị gốc trong person4 nhé !
    //toán tử apply không cho phép chúng ta trả về bất kỳ giá trị nào khác đối tượng mà ta đang tham chiếu tới.


    println("----------with------------")
    //with
    val person5 = Person("Nguyen Van A", 23, "null")
    val result5 = with(person5) {
        this?.name = "Tran Van C"
        this?.address = "TP HCM"
    }
    println(result5)//trả về unit
    println(person5)
    //cái này cũng đổi luôn person5, cơ mà có dấu hỏi chấm vì nó không check null !


    println("----------run------------")
   //run
    val person6= Person("Nguyen Van A", 23, "Quang Nam")
    val value6 = person.run {
        name = "Tran Van C"
        address = "Da Nang"
        address
    }
    println(value6)
    println(person6)
    // output: "Da Nang"
    //cái này nó trả về 1 gía trị thôi !
    //không thay đổi trong gốc person6
}