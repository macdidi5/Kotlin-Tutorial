package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    val name: String = "Simon Johnson"
    val address = "Earth\nSolar system"

    println(name)               // 顯示： Simon Johnson
    println(address)
    // 顯示兩行訊息：
    // Earth
    // Solar system

    val information = name + "\n" + address
    println(information)
    // 顯示三行訊息：
    // Simon Johnson
    // Earth
    // Solar system
}