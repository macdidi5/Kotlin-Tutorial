/* net.macdidi5.kotlin.tutorial.ch06.HelloContinue01.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    for (i in 1..50) {
        // Math.random()產生一個隨機數字
        val temp = (Math.random() * 36).toInt()

        if (temp < 30) {
            continue
        }

        println("Temperature[$i]: $temp")
    }
}