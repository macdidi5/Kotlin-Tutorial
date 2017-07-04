/* net.macdidi5.kotlin.tutorial.ch06.HelloFor03.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    for (i in 1..5) {
        print(i)    // 顯示：12345
    }

    println()

    for (i in 1..5 step 2) {
        print(i)    // 顯示：135
    }

    println()

    for (i in 1 until 5) {
        print(i)    // 顯示：1234
    }

    println()

    for (i in 5..1) {   // 迴圈不會執行
        print(i)
    }

    println()

    for (i in 5 downTo 1) {
        print(i)    // 顯示：54321
    }

    println()

    for (i in 5 downTo 1 step 2) {
        print(i)    // 顯示：531
    }

}