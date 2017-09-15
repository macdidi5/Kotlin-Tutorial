/* net.macdidi5.kotlin.tutorial.ch11.Item01.kt */

package net.macdidi5.kotlin.tutorial.ch11

// 宣告包含id（編號）、title（標題）與content（內容）三個屬性的類別
// 為類別宣告主要建構式的參數，也同時宣告這個類別的屬性
class Item01 constructor (val id: Long,
                          var title: String,
                          var content: String)

fun main(args: Array<String>) {
    // 宣告建立Item01物件，依照主要建構式的順序提供參數
    val item01 = Item01(1, "Hello", "Hello Kotlin!")
    println("Item01(id=${item01.id}, title=${item01.title}, content=${item01.content})")
    // 顯示： Item01(id=1, title=Hello, content=Hello Kotlin!)

    // 編譯錯誤，使用val宣告的屬性不可以修改
    // item01.id = 11

    // 設定title與content
    item01.title = "Hello01"
    item01.content = "Hello Kotlin 01!"

    println("Item01(id=${item01.id}, title=${item01.title}, content=${item01.content})")
    // 顯示： Item01(id=1, title=Hello01, content=Hello Kotlin 01!)

}