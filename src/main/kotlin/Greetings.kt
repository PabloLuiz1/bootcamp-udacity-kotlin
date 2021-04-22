fun main(args: Array<String>) { println("${if (args[0].toInt() in 0..11) "Good morning, Kotlin" else "Good night, Kotlin"}")
//    when (args[0].toInt()) {
//        in 0..11 -> println("Good morning, Kotlin")
//        in 12..23 -> println("Good night, Kotlin")
//        else -> println("Invalid hour")
//    }
}