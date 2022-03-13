package ru.netology

fun main() {

    val likes = 21
    val peopleEnding = if ((likes-1) % 10 == 0 && likes != 11 || likes == 1) {
        "человеку"
    } else "людям"

    println("Понравилось $likes $peopleEnding")
}