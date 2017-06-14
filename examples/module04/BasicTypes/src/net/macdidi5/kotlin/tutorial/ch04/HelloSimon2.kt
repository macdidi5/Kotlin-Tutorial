/* net.macdidi5.kotlin.tutorial.ch04.HelloSimon2.kt */

package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    // 宣告一個名稱為age的整數變數
    val age : Int = 35

    println("Hello! I am Simon.")
    // 使用變數顯示與計算
    // 如果只是單純的變數，可以省略{}，只剩下$就可以了
    println("I am $age years old.")
    println("I am ${age * 12} months old.")
    println("I am ${age * 365} days old.")
}
