/* net.macdidi5.kotlin.tutorial.ch18.StringContainer.kt */

package net.macdidi5.kotlin.tutorial.ch18

class StringContainer(private val size : Int) {

    // 建立指定元素個數的陣列
    private val arr = arrayOfNulls<String>(size)
    // 目前的索引編號
    private var index : Int = 0

    // 加入一個元素
    fun add(element : String) {
        if (index < size) {
            arr[index] = element
            index++
        }
    }

    // 取得指定索引編號的元素
    fun get(index : Int) : String? {
        var result : String? = null

        if ( index in 0 until size ) {
            result = arr[index]
        }

        return result
    }

}