/* net.macdidi5.kotlin.tutorial.ch19.ItemSortId.kt */

package net.macdidi5.kotlin.tutorial.ch19

// 實作Comparable介面
class ItemSortId : Comparator<Item> {

    // 覆寫Comparable介面的抽象函式
    // 使用id的數字決定大小
    // 回傳值：
    //     正數：自己比參數大
    //     負數：自己比參數小
    //     0：一樣大小
    override fun compare(o1: Item, o2: Item): Int {
        return when {
            (o1.id > o2.id) -> 1
            (o1.id < o2.id) -> -1
            else -> 0
        }
    }

}