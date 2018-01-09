/* net.macdidi5.kotlin.tutorial.ch18.ItemContainer.kt */

package net.macdidi5.kotlin.tutorial.ch18

class ItemContainer(private val size : Int) {

    // 建立指定元素個數的陣列
    private val arr = arrayOfNulls<Item>(size)
    // 目前的索引編號
    private var index : Int = 0

    // 加入一個元素
    fun add(element : Item) {
        if (index < size) {
            arr[index] = element
            index++
        }
    }

    // 取得指定索引編號的元素
    fun get(index : Int) : Item? {
        var result : Item? = null

        if ( index in 0 until size ) {
            result = arr[index]
        }

        return result
    }

}