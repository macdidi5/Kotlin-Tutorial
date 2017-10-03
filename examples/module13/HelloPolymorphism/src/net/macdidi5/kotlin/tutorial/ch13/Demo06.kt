/* net.macdidi5.kotlin.tutorial.ch13.Demo06.kt */

package net.macdidi5.kotlin.tutorial.ch13

fun showItem06(item: Item) {
    // 判斷是否為ImageItem物件
    if (item is ImageItem) {
        println("ImageItem: ${item.getDetails()}")
    }
    // 判斷是否為RecordItem物件
    else if (item is RecordItem) {
        println("RecordItem: ${item.getDetails()}")
    }
    // 不是ImageItem或RecordItem的話，就是Item物件
    else {
        println("Item: ${item.getDetails()}")
    }
}

fun main(args: Array<String>) {

    var items: Array<Item> = arrayOf(
            Item(1, "A", "X"),
            Item(2, "B", "Y"),
            Item(3, "C", "Z"),
            ImageItem(11, "IA", "IX", "F1"),
            ImageItem(12, "IB", "IY", "F2"),
            ImageItem(13, "IC", "IZ", "F3"),
            RecordItem(21, "RA", "RX", "RF1"),
            RecordItem(22, "RB", "RY", "RF2"),
            RecordItem(23, "RC", "RZ", "RF3")
    )

    for (i in items) {
        showItem06(i)
    }

}