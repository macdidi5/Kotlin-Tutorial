/* net.macdidi5.kotlin.tutorial.ch13.Demo05.kt */

package net.macdidi5.kotlin.tutorial.ch13

// 使用父類別Item型態宣告參數，
//   這個函式可以接收Item物件，也可以接收Item子類別物件
fun showItem05(item: Item) {
    println("Item: ${item.getDetails()}")
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
        // 包含Item與它的子類別型態物件，都可以傳送給這個函式
        showItem05(i)
    }
    // 顯示：
    //    Item: id=1, title=A, content=X
    //    Item: id=2, title=B, content=Y
    //    Item: id=3, title=C, content=Z
    //    Item: id=11, title=IA, content=IX, imageFile=F1
    //    Item: id=12, title=IB, content=IY, imageFile=F2
    //    Item: id=13, title=IC, content=IZ, imageFile=F3
    //    Item: id=21, title=RA, content=RX, recordFile=RF1
    //    Item: id=22, title=RB, content=RY, recordFile=RF2
    //    Item: id=23, title=RC, content=RZ, recordFile=RF3
}