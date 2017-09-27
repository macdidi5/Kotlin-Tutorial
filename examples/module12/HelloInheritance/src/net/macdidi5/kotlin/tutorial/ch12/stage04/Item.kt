/* net.macdidi5.kotlin.tutorial.ch12.stage04.Item.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage04

open class Item (val id: Long,
            var title: String,
            var content: String) {

    fun getReduceContent(length: Int = 5) =
            "${content.substring(0 until length)}..."

    open fun getDetails() = "id=$id, title=$title, content=$content"
}