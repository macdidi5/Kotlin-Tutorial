/* net.macdidi5.kotlin.tutorial.ch12.stage03.Demo03.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage03

fun main(args: Array<String>) {
    val i = Item(1, "Hello", "Hello Kotlin!")
    // 顯示呼叫函式傳回的項目資訊
    println(i.getDetails())
    // 顯示簡短的記事內容（預設為五個字）
    println(i.getReduceContent())

    val i02 = ImageItem(2, "Hi", "Good morning", "kotlin.jpg")
    // 顯示呼叫函式傳回的項目資訊，這是ImageItem自己寫的函式
    println(i02.getDetails())
    // 顯示四個字的簡短記事內容，這是繼承自父類別Item的函式
    println(i02.getReduceContent(4))
}