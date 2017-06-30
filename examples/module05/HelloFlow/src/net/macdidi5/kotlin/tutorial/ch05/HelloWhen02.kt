/* net.macdidi5.kotlin.tutorial.ch05.HelloIf02.kt */

package net.macdidi5.kotlin.tutorial.ch05

fun main(args: Array<String>) {
    val colorCode: Char = 'r'
    var colorName: String

    when (colorCode) {
        // 使用多個值判斷大、小寫
        'R','r' ->  colorName = "Red"
        'B','b' ->  colorName = "Blue"
        'G','g' ->  colorName = "Green"
        else -> colorName = "undefined"
    }

    // 顯示： colorCode: r, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}

