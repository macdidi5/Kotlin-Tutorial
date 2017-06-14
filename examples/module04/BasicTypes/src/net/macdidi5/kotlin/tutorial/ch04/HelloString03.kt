package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    val s = "123"
    val i = s.toInt()               // 從String轉換為Int

    val s2 = "123.321"
    val i2 = s2.toDouble()          // 從String轉換為Double

    val b = "true".toBoolean()      // 大寫或小寫的"true"都會轉換成true
    val b2 = "false".toBoolean()    // 其它的字串值都會轉換成false
    val b3 = "hello".toBoolean()    // "hello"轉換成false

    val s3 = "hello"
    val i3 = s3.toInt()     // 錯誤！程式中斷，產生NumberFormatException
}