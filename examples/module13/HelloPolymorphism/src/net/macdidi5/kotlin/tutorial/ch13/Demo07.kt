/* net.macdidi5.kotlin.tutorial.ch13.Demo07.kt */

package net.macdidi5.kotlin.tutorial.ch13

fun showItem07(item: Item) {

    // 編譯錯誤，Item型態並沒有imageFile屬性
    //println("${item.imageFile}")

    // 編譯錯誤，Item型態並沒有recordFile屬性
    //println("${item.recordFile}")

    // 先判斷是否為ImageItem物件
    if (item is ImageItem) {
        // 才可以使用ImageItem型態的imageFile屬性
        println("ImageItem: ${item.id}, ${item.imageFile}")
    }
    // 先判斷是否為RecordItem物件
    else if (item is RecordItem) {
        // 才可以使用RecordItem型態的recordFile屬性
        println("RecordItem: ${item.id}, ${item.recordFile}")
    }
    else {
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
        showItem07(i)
    }

}