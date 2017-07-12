/* net.macdidi5.kotlin.tutorial.ch07.HelloIntArray03.kt */

package net.macdidi5.kotlin.tutorial.ch07

fun main(args: Array<String>) {
    // 在intArrayOf函式裡面設定所有陣列的元素
    val ages = intArrayOf(35, 17, 24)

    // 宣告合計用的變數
    var total = 0

    // 使用迴圈執行所有元素的合計
    for (age in ages) {
        total += age
    }

    // 計算平均
    val average = total / ages.size

    println("Total: $total, Average: $average")
    // 顯示： Total: 76, Average: 25
}
