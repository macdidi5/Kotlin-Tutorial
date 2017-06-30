/* net.macdidi5.kotlin.tutorial.ch05.HelloIf03.kt */

package net.macdidi5.kotlin.tutorial.ch05

fun main(args: Array<String>) {
    val colorCode: Char = 'R'
    val colorName =
            if (colorCode == 'R')      "Red"
            else if (colorCode == 'B') "Blue"
            else if (colorCode == 'G') "Green"
            else                       "undefined"

    // 顯示： colorCode: R, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}
