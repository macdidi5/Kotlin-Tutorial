package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    val v:  Int = 35            // 正確
//    val v2: Int = 2147483648    // 錯誤！數值已經超過Int型態的範圍

    val v3: Long = 2147483648   // 正確
    val v4: Long = 2147483648L  // 正確，可以在數值後面加上L
//    val v5: Int = 3.14          // 錯誤！不可以指定小數數值
}