/* net.macdidi5.kotlin.tutorial.ch13.Demo03.kt */

package net.macdidi5.kotlin.tutorial.ch13

fun main(args: Array<String>) {

    // 因為父類別型態（Item）的變數，
    //   可以儲存子類別（ImageItem與RecordIem）的物件，
    //   所以使用父類別Item型態宣告與建立陣列
    var items: Array<Item> = arrayOf(
            // 記事資料物件
            Item(1, "A", "X"),
            Item(2, "B", "Y"),
            Item(3, "C", "Z"),
            // 照片記事資料物件
            ImageItem(11, "IA", "IX", "F1"),
            ImageItem(12, "IB", "IY", "F2"),
            ImageItem(13, "IC", "IZ", "F3"),
            // 錄音記事資料物件
            RecordItem(21, "RA", "RX", "RF1"),
            RecordItem(22, "RB", "RY", "RF2"),
            RecordItem(23, "RC", "RZ", "RF3")
    )

    // 使用一個迴圈處理所有記事資料物件
    for (i in items) {
        println(i.getDetails())
    }

}