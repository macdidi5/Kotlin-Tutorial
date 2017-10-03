/* net.macdidi5.kotlin.tutorial.ch13.Item.kt */

package net.macdidi5.kotlin.tutorial.ch13

// 記事資料類別
open class Item (val id: Long,
            var title: String,
            var content: String) {

    fun getReduceContent(length: Int = 5) =
            "${content.substring(0 until length)}..."

    open fun getDetails() = "id=$id, title=$title, content=$content"
}