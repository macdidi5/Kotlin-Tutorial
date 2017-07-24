/* net.macdidi5.kotlin.tutorial.ch08.HelloString02.kt */

package net.macdidi5.kotlin.tutorial.ch08

fun main(args: Array<String>) {

    val intString = "35"
    val doubleString = "72.5"
    val booleanString = "true"

    // 轉換字串為Int
    val iv = intString.toInt()
    // 轉換字串為Double
    val dv = doubleString.toDouble()
    // 轉換字串為Boolean
    val bv = booleanString.toBoolean()

    val intString2 = "Hello"
    // 字串內容不是整數，執行以後會發生錯誤
    // Exception in thread "main" java.lang.NumberFormatException:
    //     For input string: "Hello"
    //val iv2 = intString2.toInt()

    val name: String = "simon"

    // 轉換為字元陣列
    val ns = name.toCharArray()

    for (c in ns) {
        print(c)
    }

    println()

    val ns2 = charArrayOf('x', 'x', 'x', 'x', 'x')

    // 轉換為字元陣列，參數依照順序為：
    //    儲存轉換結果的字元陣列
    //    字元陣列的起始編號
    //    字串的字元起始編號
    //    字串的字元結束編號
    // 轉換的字串的範圍從起始編號開始，字元個數為結束編號減起始編號
    name.toCharArray(ns2, 0, 0, 3)

    for (c in ns2) {
        print(c)
    }

}