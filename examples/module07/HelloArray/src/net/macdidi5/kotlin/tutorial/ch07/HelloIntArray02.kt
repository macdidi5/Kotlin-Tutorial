/* net.macdidi5.kotlin.tutorial.ch07.HelloIntArray02.kt */

package net.macdidi5.kotlin.tutorial.ch07

fun main(args: Array<String>) {
    // 宣告與建立有三個元素的Int陣列
    val ages: IntArray = IntArray(3)

    // 設定元素值，第一個元素的編號是0
    ages[0] = 35
    ages[1] = 17
    ages[2] = 24

    // 宣告合計用的變數
    var total = 0

    // 使用迴圈執行所有元素的合計
    for (age in ages) {
        total += age
    }

    // 陣列.size：陣列的元素個數
    // 計算平均
    val average = total / ages.size

    println("Total: $total, Average: $average")
    // 顯示： Total: 76, Average: 25
}
