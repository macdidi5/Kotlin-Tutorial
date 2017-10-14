package net.macdidi5.kotlin.tutorial.ch14

// 如果列舉型態需要包含每一個成員對應的資料，
//   在宣告的時候加入成員對應資料的參數
enum class Colors02(val value: Int) {
    // 在每一個成員名稱後的左右刮號裡面填入對應的資料
    LIGHTGREY(0XD3D3D3), BLUE(0X33B5E5), PURPLE(0XAA66CC),
    GREEN(0X99CC00), ORANGE(0XFFBB33), RED(0XFF4444);
}

// 接收顏色代碼參數，傳回對應的列舉型態變數
fun parseColor(value: Int): Colors02 {
    // 設定預設的顏色為LIGHTGREY
    var result: Colors02 = Colors02.LIGHTGREY

    for (c in Colors02.values()) {
        // 判斷顏色代碼
        if (value == c.value) {
            result = c
            break
        }
    }

    return result
}

fun main(args: Array<String>) {
    val c01 = Colors02.RED
    val c02 = Colors02.BLUE
    val c03 = Colors02.GREEN

    // 列舉型態變數多了建構式參數指定的屬性
    println("$c01: ${c01.value}")
    println("$c02: ${c02.value}")
    println("$c03: ${c03.value}")

    // 編譯錯誤，不可以呼叫建構式
    // val c = Colors02(0XFF4444)

    // 呼叫函式把顏色代碼轉換為列舉型態變數
    val c04 = parseColor(0XFF4444)
    val c05 = parseColor(0X33B5E5)
    val c06 = parseColor(0X000000)

    println("\n$c04, $c05, $c06")
}