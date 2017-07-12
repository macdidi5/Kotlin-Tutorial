/* net.macdidi5.kotlin.tutorial.ch07.HelloStringArray02.kt */

package net.macdidi5.kotlin.tutorial.ch07

fun main(args: Array<String>) {
    // 宣告與建立有三個元素的String陣列
    val names = arrayOf<String>("Simon", "Mary", "Sam")

    for (element in names) {
        println("Hello!, ${element.toUpperCase()}!")
    }

    // 顯示：
    // Hello!, SIMON!
    // Hello!, MARY!
    // Hello!, SAM!
}
