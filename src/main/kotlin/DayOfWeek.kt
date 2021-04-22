import java.time.DayOfWeek
import java.time.LocalDate

fun main(args: Array<String>){
    dayOfWeek()
}

fun dayOfWeek(){
    println(DayOfWeek.from(LocalDate.now()).name)
}