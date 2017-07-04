/* net.macdidi5.kotlin.tutorial.ch06.HelloContinueLabel01.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    outer@ for (x in 1..5) {
        for (y in 1..5) {
            if (y > 3) {
                continue@outer
            }

            print(y)
        }

        println("=>X:$x")
    }
    
    // 顯示： 123123123123123
}