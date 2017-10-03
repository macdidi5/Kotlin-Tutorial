/* net.macdidi5.kotlin.tutorial.ch13.Demo08.kt */

package net.macdidi5.kotlin.tutorial.ch13

fun showItem08(item: Item) {
    // 準備判斷接收到的參數是哪一種物件
    when (item) {
        // 如果是ImageItem物件
        is ImageItem ->
            println("ImageItem: ${item.id}, ${item.imageFile}")
        // 如果是RecordItem物件
        is RecordItem ->
            println("RecordItem: ${item.id}, ${item.recordFile}")
        // 如果是Item物件
        else ->
            println("Item: ${item.id}")
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
        showItem08(i)
    }
}