/* net.macdidi5.kotlin.tutorial.ch11.Item05.kt */

package net.macdidi5.kotlin.tutorial.ch11

class Item05(val id: Long,
             _title: String,
             _content: String = "") {

    var title = _title
        // 宣告屬性的setter函式
        set(value: String) {
            if (value.isNotEmpty()) {
                // 使用field關鍵字取代屬性名稱title
                field = value
            }
        }

    var content = _content
        // 宣告屬性的getter函式
        get() {
            // 使用field關鍵字取代屬性名稱content
            return if (field.isEmpty()) "Empty" else field
        }

    fun getDetails() = "Item05(id=$id, title=$title, content=$content)"
}

fun main(args: Array<String>) {
    val item05 = Item05(5, "Nice day")
    println(item05.getDetails())
    // 顯示： Item05(id=5, title=Nice day, content=Empty)

    // 呼叫title屬性的setter函式
    item05.title = ""
    // 呼叫title屬性的getter函式
    println("title=${item05.title}")
    // 顯示： title=Nice day

    // 呼叫content屬性的setter函式
    item05.content = ""
    // 呼叫content屬性的getter函式
    println("content=${item05.content}")
    // 顯示： content=Empty

    // 呼叫content屬性的setter函式
    item05.content = "Nice day"
    // 呼叫content屬性的getter函式
    println("content=${item05.content}")
    // 顯示： content=Nice day
}