/* net.macdidi5.kotlin.tutorial.ch07.HelloStringArray01.kt */

package net.macdidi5.kotlin.tutorial.ch07

fun main(args: Array<String>) {
    // 宣告與建立有三個元素的String陣列
    val names: Array<String?> = arrayOfNulls<String>(3)

    // 可以省略型態
    //val names = arrayOfNulls<String>(3)
    // 如果要使用型態，就可以省略arrayOfNulls後面的<String>
    //val names: Array<String?> = arrayOfNulls(3)

    // 設定元素值，第一個元素的編號是0
    names[0] = "Simon"
    names[1] = "Mary"
    names[2] = "Sam"

    // 使用for迴圈依序處理陣列所有元素
    // 迴圈執行的次數就是元素個數
    // 每執行一次都會把元素值指定給element變數
    for (element in names) {
        println(element)
    }

    // 顯示：
    // Simon
    // Mary
    // Sam

    println()

    // 陣列.indices：根據陣列的元素個數傳回範圍運算式
    // ages.indices傳回0..2
    for (i in names.indices) {
        println("[$i]: ${names[i]}")
    }

    // 顯示：
    // [0]: Simon
    // [1]: Mary
    // [2]: Sam

    println()

    // 陣列.withIndex()：傳回元素編號與元素值成對的資料
    // 搭配for迴圈使用這樣的語法：
    // for ( (元素編號變數, 元素值變數) in 陣列.withIndex() ) ...
    for ((i, v) in names.withIndex()) {
        println("[$i]: $v")
    }

    // 顯示：
    // [0]: Simon
    // [1]: Mary
    // [2]: Sam
}
