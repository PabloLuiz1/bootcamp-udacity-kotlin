package aquarium

open class Aquarium (var length: Int = 100, var widht: Int = 20, var height: Int = 40){

    open var volume: Int
        get() = widht * height * length / 1_000
        set(value) {height = (value * 1_000) / (widht * length)}

    open var water = volume.times(0.9)

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000 // cm3
        val tank = water + water * 0.1
        height = (tank / (length * widht)).toInt()
    }
}