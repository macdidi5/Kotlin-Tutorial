/* net.macdidi5.kotlin.tutorial.ch06.HelloBreak01.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    var i = 0

    while (true) {
        print(i)
        i++

        if (i == 5) {
            break
        }
    }

    // 顯示：01234
}