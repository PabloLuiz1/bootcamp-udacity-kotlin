fun main(args: Array<String>){
    var fortune : String = ""
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie(birthday: Int) : String {
    val fortunes = listOf<String>("You will have a great day!",
                    "Things will go well for you today.",
                    "Enjoy a wonderful day of success.",
                    "Be humble and all will turn out well.",
                    "Today is a good day for exercising restraint.",
                    "Take it easy and enjoy life!",
                    "Treasure your friends because they are your greatest fortune."
                    )
    return fortunes[when (birthday) {in 1..7 -> 4 28, 31 -> 2 else -> birthday.rem(fortunes.size)}]
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}