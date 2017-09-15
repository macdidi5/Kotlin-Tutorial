/* net.macdidi5.kotlin.tutorial.ch11.Item04.kt */

package net.macdidi5.kotlin.tutorial.ch11

// 宣告包含id（編號）、title（標題）與content（內容）三個參數的建構式
// 因為宣告建構式參數沒有使用val或var，所以它們只是建構式的參數，並不是類別的屬性
class Item04(_id: Long,
             _title: String,
             _content: String) {
    // 宣告類別的屬性，並設定為建構式的參數
    val id = _id
    var title = _title
    var content = _content

    fun getDetails() = "Item03(id=$id, title=$title, content=$content)"
}

fun main(args: Array<String>) {
    val item04 = Item04(4, "Greeting", "Good morning")
    println(item04.getDetails())
    // 顯示： Item04(id=4, title=Greeting, content=Good morning)
}