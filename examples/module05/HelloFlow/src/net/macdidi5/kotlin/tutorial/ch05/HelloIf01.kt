/* net.macdidi5.kotlin.tutorial.ch05.HelloIf01.kt */

package net.macdidi5.kotlin.tutorial.ch05

fun main(args: Array<String>) {
    // 字元型態的顏色代碼
    val colorCode = 'R'
    // 字串型態的顏色名稱
    var colorName: String

    // 判斷顏色代碼是否為紅色
    if (colorCode == 'R') {
        colorName = "Red"
    }
    // 判斷顏色代碼是否為藍色
    else if (colorCode == 'B') {
        colorName = "Blue"
    }
    // 判斷顏色代碼是否為綠色
    else if (colorCode == 'G') {
        colorName = "Green"
    }
    // 錯誤的顏色代碼
    else {
        colorName = "undefined"
    }

    // 顯示： colorCode: R, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}
