package ru.netology.homework_2

fun main(){
    val amount = 507400
    val comissionStandart = amount * 0.0075
    /* В задаче нет пояснения, как поступать с дробной частью копеек, поэтому просто привела к инту */
    val comissionActual = if (comissionStandart > 3500) comissionStandart.toInt() else 3500
    println(comissionActual)
}

