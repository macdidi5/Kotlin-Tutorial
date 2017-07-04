/* net.macdidi5.kotlin.tutorial.ch06.HelloFor02.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    var total = 0

    for (i in 1..10) {
        total += i
    }

    println("Total: $total")
    // 顯示：Total: 55
}