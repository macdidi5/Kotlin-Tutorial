package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    val place = "earth"
    val place2 = "earth"
    val place3 = "Earth"

    println(place == place2)        // 顯示： true
    println(place == place3)        // 顯示： false

    println( "A" > "Z" )            // 顯示： false
    println( "Simon" > "Mary" )     // 顯示： true
}