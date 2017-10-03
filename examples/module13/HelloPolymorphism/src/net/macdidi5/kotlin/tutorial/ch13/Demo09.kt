/* net.macdidi5.kotlin.tutorial.ch13.Demo09.kt */

package net.macdidi5.kotlin.tutorial.ch13

fun main(args: Array<String>) {
    val item: Item =
            Item(1, "Hello", "Hello Kotlin!")
    val imageItem: Item =
            ImageItem(2, "Greeting", "Good morning", "kotlin.jpg")
    val recordItem: Item =
            RecordItem(3, "Shopping", "Out of milk", "notify.mp3")

    println("item is Item: ${item is Item}")
    println("imageItem is ImageItem: ${imageItem is ImageItem}")
    println("recordItem is RecordItem: ${recordItem is RecordItem}")
    // 顯示：
    //    item is Item: true
    //    imageItem is ImageItem: true
    //    recordItem is RecordItem: true

    println()

    println("imageItem is Item: ${imageItem is Item}")
    println("recordItem is Item: ${recordItem is Item}")
    // 顯示：
    //    imageItem is Item: true
    //    recordItem is Item: true

    println()

    println("imageItem is RecordItem: ${imageItem is RecordItem}")
    println("recordItem is ImageItem: ${recordItem is ImageItem}")
    // 顯示：
    //    imageItem is RecordItem: false
    //    recordItem is ImageItem: false

    println()

    val i: Item = ImageItem(12, "A", "X", "IF.jpg")
    val r: Item? = null

    // 編譯錯誤，因為i變數的型態是Item，
    //    所以不能指定給ImageItem型態的變數
    // val ii: ImageItem = i

    // 把i變數轉換型態為ImageItem，就可以指定給ImageItem型態的變數
    val x: ImageItem = i as ImageItem

    // 因為變數r是null值，執行以後會發生例外
    // val y: RecordItem = r as RecordItem

    val z: RecordItem? = r as RecordItem?
    println(z?.getDetails())
    // 顯示： null
}