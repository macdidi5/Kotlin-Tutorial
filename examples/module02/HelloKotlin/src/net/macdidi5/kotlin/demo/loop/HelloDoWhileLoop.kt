/* net/macdidi5/kotlin/demo/loop/HelloDoWhileLoop.kt */
package net.macdidi5.kotlin.demo.loop

fun main(args: Array<String>) {
    var index = 0

    do {
        print(index)
        index++
    } while (index < 10)
    // 執行程式後顯示： 0123456789
}