package net.macdidi5.kotlin.tutorial.ch14

enum class Colors03(val value: Int) {
    LIGHTGREY(0XD3D3D3), BLUE(0X33B5E5), PURPLE(0XAA66CC),
    GREEN(0X99CC00), ORANGE(0XFFBB33), RED(0XFF4444);

    // 為列舉型態加入函式，傳回顏色代碼十六進位的字串
    fun colorCode() = "0X${value.toString(16).toUpperCase()}"
}

fun main(args: Array<String>) {
    val c01 = Colors03.RED
    val c02 = Colors03.BLUE
    val c03 = Colors03.GREEN

    // 可以使用列舉型態變數呼叫函式
    println("$c01: ${c01.colorCode()}")
    println("$c02: ${c02.colorCode()}")
    println("$c03: ${c03.colorCode()}")
    // 顯示：
    //    RED: 0XFF4444
    //    BLUE: 0X33B5E5
    //    GREEN: 0X99CC00
}