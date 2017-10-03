/* net.macdidi5.kotlin.tutorial.ch13.Demo01.kt */

package net.macdidi5.kotlin.tutorial.ch13

fun main(args: Array<String>) {
    // 記事資料物件
    val item = Item(1, "Hello", "Hello Kotlin!")
    println(item.getDetails())

    // 照片記事資料物件
    val imageItem = ImageItem(2, "Greeting", "Good morning", "kotlin.jpg")
    println(imageItem.getDetails())

    // 錄音記事資料物件
    val recordItem = RecordItem(3, "Shopping", "Out of milk", "notify.mp3")
    println(recordItem.getDetails())
}