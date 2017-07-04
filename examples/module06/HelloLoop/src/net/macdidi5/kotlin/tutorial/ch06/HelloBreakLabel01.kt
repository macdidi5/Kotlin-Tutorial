/* net.macdidi5.kotlin.tutorial.ch06.HelloBreakLabel01.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    outer@ for (x in 1..5) {
        for (y in 1..5) {
            println("X:$x - Y:$y")

            if (y == 3) {
                break@outer
            }
        }
    }

    // 顯示：
    // X:1 - Y:1
    // X:1 - Y:2
    // X:1 - Y:3
}