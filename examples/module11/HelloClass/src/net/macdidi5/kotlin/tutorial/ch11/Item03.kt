/* net.macdidi5.kotlin.tutorial.ch11.Item03.kt */

package net.macdidi5.kotlin.tutorial.ch11

class Item03 (val id: Long,
              var title: String,
              var content: String) {

    // 宣告次要建構式
    // 使用this呼叫主要建構式
    constructor(id: Long): this(id, "", "")

    fun getDetails() = "Item03(id=$id, title=$title, content=$content)"
}

fun main(args: Array<String>) {
    val item0301 = Item03(301, "Hello", "Hello Kotlin!")
    println(item0301.getDetails())
    // 顯示： Item03(id=301, title=Hello, content=Hello Kotlin!)

    val item0302 = Item03(302)
    println(item0302.getDetails())
    // 顯示： Item03(id=302, title=, content=)
}