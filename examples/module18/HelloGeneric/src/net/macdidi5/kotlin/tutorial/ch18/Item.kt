/* net.macdidi5.kotlin.tutorial.ch18.Item.kt */

package net.macdidi5.kotlin.tutorial.ch18

// 實作Comparable介面
class Item (val id: Long,
            var title: String,
            var content: String) : Comparable<Item> {

    val details : String
        get() {
            return "Item(id=$id, title=$title, content=$content)"
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Item) return false

        if (id != other.id) return false
        if (title != other.title) return false
        if (content != other.content) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + content.hashCode()
        return result
    }

    // 覆寫Comparable介面的抽象函式
    // 使用title的字元個數決定大小
    // 回傳值：
    //     正數：自己比參數大
    //     負數：自己比參數小
    //     0：一樣大小
    override fun compareTo(other: Item) =
            title.length - other.title.length

}
