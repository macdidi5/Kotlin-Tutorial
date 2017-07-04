/* net.macdidi5.kotlin.tutorial.ch06.HelloWhile02.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    var i = 1
    // 宣告加總用的變數
    var total = 0

    // 執行一加到十的迴圈
    while (i <= 10) {
        total += i
        i++
    }

    println("Total: $total")
    // 顯示：Total: 55
}