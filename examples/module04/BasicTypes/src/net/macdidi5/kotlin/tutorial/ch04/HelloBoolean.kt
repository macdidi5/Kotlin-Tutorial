package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    val update: Boolean = true
    var isRainy = false

    val age = 35
    val gender = 'M'

    val result = age > 20
    val result2 = !(age > 20)
    println("result: $result, result2: $result2")
    // 顯示： result: true, result2: false

    val result3 = age > 20 && gender == 'M'
    val result4 = age > 50 || gender == 'F'
    println("result3: $result3, result4: $result4")
    // 顯示： result3: true, result4: false
}