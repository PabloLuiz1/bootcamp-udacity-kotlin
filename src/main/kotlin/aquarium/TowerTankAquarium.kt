package aquarium

import kotlin.math.PI

class TowerTankAquarium(): Aquarium() {
    override var water = volume.times(0.8)

    override var volume: Int
        get() = (widht * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (widht * length)
        }
}