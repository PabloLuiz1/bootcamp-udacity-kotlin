package aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.widht} " +
            "Height: ${myAquarium.height} ")

    myAquarium.height = 80
    println("Height: ${myAquarium.height} ")
    println("Volume: ${myAquarium.volume} ")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    print("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}