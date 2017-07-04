/* net.macdidi5.kotlin.tutorial.ch06.HelloWhile01.kt */

package net.macdidi5.kotlin.tutorial.ch06

fun main(args: Array<String>) {
    // 宣告迴圈執行次數用的變數
    var i = 0

    // 使用boolean運算式控制迴圈執行的次數
    while (i < 5) {
        print(i)
        // 每執行一次迴圈，變數就加一
        i++
    }

    // 顯示：01234
}