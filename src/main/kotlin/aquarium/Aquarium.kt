package aquarium

class Aquarium {

    var widht: Int = 20
    var height: Int = 40
    var length: Int = 100

    var volume: Int
        get() = widht * height * length / 1_000
        set(value) {height = (value * 1_000) / (widht * length)}

}