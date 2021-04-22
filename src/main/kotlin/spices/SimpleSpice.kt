package spices

class SimpleSpice {
    val name: String = "curry"
    var spiciness: String = "mild"
    val heat: Int
        get() { return 5 }
}