/* net.macdidi5.kotlin.tutorial.ch13.Demo02.kt */

package net.macdidi5.kotlin.tutorial.ch13

fun main(args: Array<String>) {

    // 記事資料物件陣列
    var items: Array<Item> = arrayOf(
            Item(1, "A", "X"),
            Item(2, "B", "Y"),
            Item(3, "C", "Z")
    )

    for (i in items) {
        println(i.getDetails())
    }

    // 照片記事資料物件陣列
    var imageItems: Array<ImageItem> = arrayOf(
            ImageItem(11, "IA", "IX", "IF1"),
            ImageItem(12, "IB", "IY", "IF2"),
            ImageItem(13, "IC", "IZ", "IF3")
    )

    for (ii in imageItems) {
        println(ii.getDetails())
    }

    // 錄音記事資料物件陣列
    var recordItems: Array<RecordItem> = arrayOf(
            RecordItem(21, "RA", "RX", "RF1"),
            RecordItem(22, "RB", "RY", "RF2"),
            RecordItem(23, "RC", "RZ", "RF3")
    )

    for (ri in recordItems) {
        println(ri.getDetails())
    }
}