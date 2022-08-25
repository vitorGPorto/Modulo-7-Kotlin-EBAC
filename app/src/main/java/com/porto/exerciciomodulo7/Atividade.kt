package com.porto.exerciciomodulo7

class Atividade {

}

fun main() {


   val string = "SEGUNDA"
  println( string.myConcact())

    var dayOfWeek : DayOfWeek = DayOfWeek.Sunday
    println(DayOfWeek.Wednesday.diaDaSemana)

    UtilityHelper.currentDayOfWeek()
    UtilityHelper.setCurrentDay(DayOfWeek.Monday)
    UtilityHelper.currentDayOfWeek()
    UtilityHelper.isWeekend()
    UtilityHelper.setCurrentDay(DayOfWeek.Sunday)
    UtilityHelper.isWeekend()
}
//Atividade 1
fun String.myConcact(): List<String> {

    val stringList: MutableList<String> = mutableListOf()
    return stringList + this
}
//Atividade 2
enum class DayOfWeek(val diaDaSemana: String) {
    Monday("SEGUNDA"),
    Tuesday("TERÇA"),
    Wednesday("QUARTA"),
    Thursday("QUINTA"),
    Friday("SEXTA"),
    Saturday("SABADO"),
    Sunday("DOMINGO")

}

//Atividade 3
object UtilityHelper{

    private var currentDay: DayOfWeek = DayOfWeek.Sunday

    fun setCurrentDay(newcurrentDay : DayOfWeek){
        this.currentDay = newcurrentDay
    }
    fun currentDayOfWeek() = println(currentDay)

    fun isWeekend(): Boolean {

        if(currentDay == DayOfWeek.Sunday || currentDay == DayOfWeek.Saturday){
            println("Verdadeiro")
            return true
        }else {
            println("Falso")
            return false
        }
    }

}



