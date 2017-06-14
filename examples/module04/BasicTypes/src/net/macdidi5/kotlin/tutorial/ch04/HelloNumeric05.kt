package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    var vInt: Int = 3
    var vByte: Byte = 3

    vInt = vByte.toInt()              // 呼叫toInt()函式把Byte轉換為Int
    vByte = vInt.toByte()             // 呼叫toByte()函式把Int轉換為Byte

    var v3: Double = 3.14
    var v4 = v3.toInt()
    println(v4)                  // 顯示3，轉換成整數後會捨去小數

    var v5: Int = 321
    var v6: Byte = v5.toByte()
    println(v6)                  // 顯示65，轉換的數值超過Byte範圍
}