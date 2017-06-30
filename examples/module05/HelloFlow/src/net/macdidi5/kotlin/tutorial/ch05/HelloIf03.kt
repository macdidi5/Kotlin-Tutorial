/* net.macdidi5.kotlin.tutorial.ch05.HelloIf03.kt */

package net.macdidi5.kotlin.tutorial.ch05

fun main(args: Array<String>) {
    val colorCode: Char = 'R'
    // 宣告變數指定的值為if運算式
    val colorName =
            if (colorCode == 'R') {
                println("R => Red")
                // if運算式傳回的值
                "Red"
            }
            else if (colorCode == 'B') {
                println("B => Blue")
                // if運算式傳回的值
                "Blue"
            }
            else if (colorCode == 'G') {
                println("G => Green")
                // if運算式傳回的值
                "Green"
            }
            else {
                println("other => undefined")
                // if運算式傳回的值
                "undefined"
            }

    println("colorCode: $colorCode, colorName: $colorName")
    // 執行後顯示：
    // R => Red
    // colorCode: R, colorName: Red

}
