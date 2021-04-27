package spices

abstract class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {

    init {
        println(this)
    }

    var heat: Int = 0
        get(){ return when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }}

    override fun toString(): String {
        return "Spice name: ${this.name}\nspiciness: ${this.spiciness}"
    }

    abstract fun prepareSpice()
}