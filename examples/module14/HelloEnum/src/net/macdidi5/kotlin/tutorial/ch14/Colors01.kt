package net.macdidi5.kotlin.tutorial.ch14

// 宣告顏色列舉型態，包含六個顏色成員
enum class Colors01 {
    // 列出所有成員的名稱
    LIGHTGREY, BLUE, PURPLE,
    GREEN, ORANGE, RED
}

// 傳回參數的顏色代碼
fun getColorCode(color: Colors01) =
        // 判斷顏色並傳回對應的代碼
        when (color) {
            Colors01.LIGHTGREY -> 0XD3D3D3
            Colors01.BLUE -> 0X33B5E5
            Colors01.PURPLE -> 0XAA66CC
            Colors01.GREEN -> 0X99CC00
            Colors01.ORANGE -> 0XFFBB33
            Colors01.RED -> 0XFF4444
        }

fun main(args: Array<String>) {
    // 宣告紅、藍、綠三個顏色變數
    val c01: Colors01 = Colors01.RED
    val c02: Colors01 = Colors01.BLUE
    val c03: Colors01 = Colors01.GREEN

    println("$c01, $c02, $c03")
    // 顯示： RED, BLUE, GREEN

    // 把紅、藍、綠顏色名稱字串轉換為列舉型態變數
    val c04: Colors01 = Colors01.valueOf("RED")
    val c05: Colors01 = Colors01.valueOf("BLUE")
    val c06: Colors01 = Colors01.valueOf("GREEN")

    println()
    println("$c04, $c05, $c06")
    // 顯示： RED, BLUE, GREEN

    // 取得包含列舉型態所有成員的陣列
    val cs: Array<Colors01> = Colors01.values()

    println()

    for (c in cs) {
        println("${c.ordinal}: ${c.name}")
    }
    // 顯示：
    //    0: LIGHTGREY
    //    1: BLUE
    //    2: PURPLE
    //    3: GREEN
    //    4: ORANGE
    //    5: RED

    println()
    // toString(16)可以把整數轉換為16進位字串
    println("$c01: ${getColorCode(c01)}, ${getColorCode(c01).toString(16)}")
    println("$c01: ${getColorCode(c02)}, ${getColorCode(c02).toString(16)}")
    println("$c01: ${getColorCode(c03)}, ${getColorCode(c03).toString(16)}")
    // 顯示：
    //    RED: 16729156, ff4444
    //    RED: 3388901, 33b5e5
    //    RED: 10079232, 99cc00
}