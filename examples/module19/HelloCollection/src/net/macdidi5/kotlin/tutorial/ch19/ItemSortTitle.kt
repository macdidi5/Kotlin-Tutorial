/* net.macdidi5.kotlin.tutorial.ch19.ItemSortTitle.kt */

package net.macdidi5.kotlin.tutorial.ch19

// 實作Comparable介面
class ItemSortTitle : Comparator<Item> {

    // 覆寫Comparable介面的抽象函式
    // 使用title的字串內容決定大小
    // 回傳值：
    //     正數：自己比參數大
    //     負數：自己比參數小
    //     0：一樣大小
    override fun compare(o1: Item, o2: Item): Int {
        // 因為String已經實作Comparator介面
        // 所以直接呼叫String實作的compareTo函式
        return o1.title.compareTo(o2.title)
    }

}