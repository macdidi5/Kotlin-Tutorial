/* net.macdidi5.kotlin.tutorial.ch13.Demo04.kt */

package net.macdidi5.kotlin.tutorial.ch13

// 接收記事資料物件參數的函式
fun showItem(item: Item) {
    println("Item: ${item.getDetails()}")
}

// 接收照片記事資料物件參數的函式
fun showItem(imageItem: ImageItem) {
    println("ImageItem: ${imageItem.getDetails()}")
}

// 接收錄音記事資料物件參數的函式
fun showItem(recordItem: RecordItem) {
    println("RecordItem: ${recordItem.getDetails()}")
}

fun main(args: Array<String>) {

    val item = Item(1, "Hello", "Hello Kotlin!")
    showItem(item)

    val imageItem = ImageItem(2, "Hi", "Hello", "kotlin.jpg")
    showItem(imageItem)

    val recordItem = RecordItem(3, "Shopping", "Out of milk", "notify.mp3")
    showItem(recordItem)
}