package ru.netology.homework_2

fun main(){
    val amount = 507400
    /* В задаче нет пояснения, как поступать с дробной частью копеек, поэтому просто привела к инту */
    val comission = if (amount * 0.0075 > 3500) (amount * 0.0075).toInt() else 3500
    println(comission)
}
