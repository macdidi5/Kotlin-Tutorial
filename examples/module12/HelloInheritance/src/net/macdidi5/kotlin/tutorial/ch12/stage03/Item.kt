/* net.macdidi5.kotlin.tutorial.ch12.stage03.Item.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage03

open class Item (val id: Long,
                 var title: String,
                 var content: String) {

    // 傳回簡短的記事內容
    // 因為不需要讓子類別覆寫，所有不需要加入open關鍵字
    fun getReduceContent(length: Int = 5) =
            "${content.substring(0 until length)}..."

    // 加入open關鍵字讓子類別可以覆寫這個函式
    // 因為子類別需要加入額外的資訊，例如ImageItem的imgaeFile
    open fun getDetails() = "id=$id, title=$title, content=$content"
}