/* net.macdidi5.kotlin.tutorial.ch07.HelloIntArray01.kt */

package net.macdidi5.kotlin.tutorial.ch07

fun main(args: Array<String>) {
    // 宣告與建立有三個元素的Int陣列
    val ages: IntArray = IntArray(3)

    // 設定元素值，第一個元素的編號是0
    ages[0] = 35
    ages[1] = 12
    ages[2] = 27

    // 使用for迴圈依序處理陣列所有元素
    // 迴圈執行的次數就是元素個數
    // 每執行一次都會把元素值指定給element變數
    for (element in ages) {
        println(element)
    }

    // 顯示：
    // 35
    // 12
    // 27

    println()

    // 陣列.indices：根據陣列的元素個數傳回範圍運算式
    // ages.indices傳回0..2
    for (i in ages.indices) {
        println("[$i]: ${ages[i]}")
    }

    // 顯示：
    // [0]: 35
    // [1]: 12
    // [2]: 27

    println()

    // 陣列.withIndex()：傳回元素編號與元素值成對的資料
    // 搭配for迴圈使用這樣的語法：
    // for ( (元素編號變數, 元素值變數) in 陣列.withIndex() ) ...
    for ((i, v) in ages.withIndex()) {
        println("[$i]: $v")
    }

    // 顯示：
    // [0]: 35
    // [1]: 12
    // [2]: 27
}
