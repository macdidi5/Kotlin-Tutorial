package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    val gender: Char = 'M'
    val gender2 = 'F'                   // 省略型態

    val genderCode = gender.toInt()     // 從Char轉換為Int
    val gender2Code = gender2.toInt()   // 從Char轉換為Int

    println("gender: $gender, genderCode: $genderCode")
    // 顯示： gender: M, genderCode: 77

    println("gender2: $gender2, gender2Code: $gender2Code")
    // 顯示： gender2: F, gender2Code: 70

    val gender3 = 70.toChar()           // 從Int轉換為Char
    println("gender3: $gender3")
    // 顯示： gender3: F
}