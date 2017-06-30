/* net.macdidi5.kotlin.tutorial.ch05.HelloIf03.kt */

package net.macdidi5.kotlin.tutorial.ch05

fun main(args: Array<String>) {
    val colorCode: Char = 'R'
    var colorName: String

    when {
        colorCode == 'R' ->  colorName = "Red"
        colorCode == 'B' ->  colorName = "Blue"
        colorCode == 'G' ->  colorName = "Green"
        else -> colorName = "undefined"
    }

    // 顯示： colorCode: R, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}

