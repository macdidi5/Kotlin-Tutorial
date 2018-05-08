/* net.macdidi5.kotlin.tutorial.ch19.Item.kt */

package net.macdidi5.kotlin.tutorial.ch19

// 實作Comparable介面
data class Item (val id: Long,
            var title: String,
            var content: String) : Comparable<Item> {

    val details : String
        get() {
            return "Item(id=$id, title=$title, content=$content)"
        }

    // 覆寫Comparable介面的抽象函式
    //
    // 使用title的字元個數決定大小
    // 回傳值：
    //     正數：自己比參數大
    //     負數：自己比參數小
    //     0：一樣大小
    override fun compareTo(other: Item) =
            title.length - other.title.length

}
