/* net.macdidi5.kotlin.tutorial.ch05.HelloIf02.kt */

package net.macdidi5.kotlin.tutorial.ch05

fun main(args: Array<String>) {
    val colorCode: Char = 'R'
    var colorName: String

    if (colorCode == 'R')
        colorName = "Red"
    else if (colorCode == 'B')
        colorName = "Blue"
    else if (colorCode == 'G')
        colorName = "Green"
    else
        colorName = "undefined"

    // 顯示： colorCode: R, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}
