/* net.macdidi5.kotlin.tutorial.ch11.Item02.kt */

package net.macdidi5.kotlin.tutorial.ch11

// 宣告包含id（編號）、title（標題）與content（內容）三個屬性的類別
// 主要建構式的constructor關鍵字可以省略
// 為title與content兩個欄位設定預設值
class Item02 (val id: Long = 0,
              var title: String = "",
              var content: String = "") {

    // 宣告傳回資訊的函式
    fun getDetails() = "Item02(id=$id, title=$title, content=$content)"
}

fun main(args: Array<String>) {
    // 省略設定預設值的建構式參數title與content
    val item0201 = Item02(201)
    println(item0201.getDetails())
    // 顯示： Item02(id=201, title=, content=)

    // 省略設定預設值的建構式參數content
    val item0202 = Item02(202, "Hi")
    println(item0202.getDetails())
    // 顯示： Item02(id=202, title=Hi, content=)

    val item0203 = Item02(203, "Hi", "Hello")
    println(item0203.getDetails())
    // 顯示： Item02(id=203, title=Hi, content=Hello)

    println()

    val items = arrayOf(
            Item02(2001),
            Item02(2002),
            Item02(2003)
    )

    // 使用迴圈處理陣列裡面的所有Item02物件
    for (item in items) {
        // 顯示Item02物件資訊
        println(item.getDetails())
    }
    // 顯示：
    // Item02(id=2001, title=, content=)
    // Item02(id=2002, title=, content=)
    // Item02(id=2003, title=, content=)

    println()

    for (item in items) {
        // 設定每一個元素Item02物件的title與content屬性
        item.title = "Hi"
        item.content = "Hello"
    }

    for (item in items) {
        println(item.getDetails())
    }
    // 顯示：
    // Item02(id=2001, title=Hi, content=Hello)
    // Item02(id=2002, title=Hi, content=Hello)
    // Item02(id=2003, title=Hi, content=Hello)
}
