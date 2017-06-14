package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    val v: Byte = 35        // 宣告Int型態的變數並指定為35
//    val v2: Byte = 128      // 錯誤！指定的數值超過Byte型態範圍

    val v3: Int = 35        // 宣告Int型態的變數並指定為35
    val v4 = 35             // 經由設定值35，自動宣告變數的型態為Int
    // 整數數值預設的型態為Int

    val v5: Int             // 宣告變數的時候如果沒有設定值，就一定要設定型態
    v5 = 35                 // 第一次設定值
//    v5 = 36                 // 錯誤！

    var v6: Int = 35        // 使用var宣告變數
    v6 = 36                 // 可以改變
}