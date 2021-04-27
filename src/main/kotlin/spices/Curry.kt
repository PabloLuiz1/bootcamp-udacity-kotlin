package spices

//class Curry(name: String, spiciness: String,
//            color: #333333; SpiceColor = YellowSpiceColor) : Spice(name, spiciness), Grinder, SpiceColor by color {
//
//    override fun prepareSpice() {
//        grind()
//    }
//}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}