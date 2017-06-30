/* net.macdidi5.kotlin.tutorial.ch05.HelloIf04.kt */

package net.macdidi5.kotlin.tutorial.ch05

fun main(args: Array<String>) {
    val colorCode: Char = 'R'
    // 宣告變數指定的值為when運算式
    var colorName =
            when (colorCode) {
                'R' ->  "Red"
                'B' ->  "Blue"
                'G' ->  "Green"
                else -> "undefined"
            }

    // 顯示： colorCode: R, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}

