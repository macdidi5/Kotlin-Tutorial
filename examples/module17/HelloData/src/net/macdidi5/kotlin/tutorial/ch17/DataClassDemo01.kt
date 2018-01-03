/* net.macdidi5.kotlin.tutorial.ch17.DataClassDemo01.kt */

package net.macdidi5.kotlin.tutorial.ch17

fun main(args: Array<String>) {

    val item01 = Item01(101, "Hello", "Kotlin")
    val item02 = Item01(101, "Hello", "Kotlin")

    println(item01)
    // 顯示： Item01(id=101, title=Hello, content=Kotlin)
    println(item01.toString())
    // 顯示： Item01(id=101, title=Hello, content=Kotlin)

    println(item01.hashCode())
    // 顯示： 116288980
    println(item02.hashCode())
    // 顯示： 116288980

    println(item01.equals(item02))
    // 顯示： true
    println(item01 == item02)
    // 顯示： true

    // data class自動加入的componentN函式
    // 傳回宣告順序的屬性值
    val id01 = item01.component1()
    val title01 = item01.component2()
    val content01 = item01.component3()

    println("$id01, $title01, $content01")
    // 顯示： 101, Hello, Kotlin

    // 使用解構（Destructuring）讀取屬性值
    // 宣告三個變數，依照順序指定componentN函式的回傳值
    val (id, title, content) = item01
    println("$id, $title, $content")
    // 顯示： 101, Hello, Kotlin

    // 複製一個新的物件
    val item03 = item01.copy()
    println(item03)
    // 顯示： Item01(id=101, title=Hello, content=Kotlin)

    // 指定部份的屬性複製一個新的物件
    val item04 = item01.copy(id = 104)
    println(item04)
    // 顯示： Item01(id=104, title=Hello, content=Kotlin)

}