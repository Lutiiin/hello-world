package ru.netology.homework_2

fun main() {
    val likes = 148
    if (likes % 10 == 1 && likes % 100 != 11) println("$likes человеку")
    else println("$likes людям")
}