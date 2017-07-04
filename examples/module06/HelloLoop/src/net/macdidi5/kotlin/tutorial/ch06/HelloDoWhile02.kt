/* net.macdidi5.kotlin.tutorial.ch06.HelloDoWhile02.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    var i = 1
    var total = 0

    do {
        total += i
        i++
    } while (i <= 10)

    println("Total: $total")
    // 顯示：Total: 55
}