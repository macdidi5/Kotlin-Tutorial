/* net/macdidi5/kotlin/demo/collection/HelloArray.kt */
package net.macdidi5.kotlin.demo.collection

fun main(args: Array<String>) {
    // 有三個元素的整數陣列
    val ia: IntArray = intArrayOf(3, 5, 7)

    // 合計變數
    var total: Int = 0

    // 依序處理所有陣列元素的迴圈
    // 執行過程會自動把每一個陣列的元素指定給變數n
    for (n in ia) {
        total += n
    }

    // 顯示： Total: 15
    println("Total: $total")
}