package ru.netology.lesson2

fun main() {

    val likes1 = 1
    val likes2 = 2
    val likes3 = 10
    val likes4 = 11
    val likes5 = 12
    val likes6 = 20
    val likes7 = 31
    val likes8 = 100
    val likes9 = 101
    val likes10 = 111
    val likes11 = 1001
    val likes12 = 2_147_483_511
    val likes13 = 2_147_483_501
    val likes14 = 2_147_483_593

    val ONE = 1
    val ELEVEN = 11
    val likes = likes14

    val typeOfPeople = if (((likes == ONE)||(((likes-1)%10) == 0))&&(likes != ELEVEN)&&(((likes - ELEVEN)%100) != 0))
        "человеку" else "людям"

    println("Понравилось $likes $typeOfPeople")

}