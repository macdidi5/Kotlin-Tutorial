/* net/macdidi5/kotlin/demo/loop/HelloForLoop.kt */
package net.macdidi5.kotlin.demo.loop

fun main(args: Array<String>) {
    // 顯示： 12345
    for (index: Int in 1..5) {
        print(index)
    }

    println()

    // 顯示： 135
    for (index: Int in 1..5 step 2)
        print(index)

    println()

    // 顯示： 54321
    for (index: Int in 5 downTo 1)
        print(index)
}