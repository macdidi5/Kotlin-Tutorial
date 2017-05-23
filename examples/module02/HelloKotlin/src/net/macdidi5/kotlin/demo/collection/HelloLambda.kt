/* net/macdidi5/kotlin/demo/collection/HelloLambda.kt */
package net.macdidi5.kotlin.demo.collection

fun main(args: Array<String>) {
    // 有五個元素的整數陣列
    val ia: IntArray = intArrayOf(120, 30, 15, 27, 66)

    ia.filter { it > 50 }         // 留下大於50的元素
      .sortedBy { it }            // 依照大小排序
      .map { it / 10 }            // 元素值除以10
      .forEach { print("$it-") }  // 顯示元素值
    // 顯示： 6-12-
}