/* net.macdidi5.kotlin.tutorial.ch19.HelloSet04.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.TreeSet

fun main(args: Array<String>) {

    // 建立測試用的Item物件
    val item01 = Item(101, "Hello", "Kotlin")
    val item02 = Item(102, "Hi", "Android")
    val item03 = Item(103, "Chao", "Java")

    // 建立元素型態為Item的TreeSet物件
    // 指定元素的排序方式為ItemSortId
    val items04 = TreeSet<Item>( ItemSortId() )

    items04.add(item01)
    items04.add(item02)
    items04.add(item03)

    for (item in items04) {
        println(item.details)
    }
    // 顯示（依照id排序）：
    //    Item(id=101, title=Hello, content=Kotlin)
    //    Item(id=102, title=Hi, content=Android)
    //    Item(id=103, title=Chao, content=Java)

    println()

    // 建立元素型態為Item的TreeSet物件
    // 指定元素的排序方式為ItemSortTitle
    val items05 = TreeSet<Item>( ItemSortTitle() )

    items05.add(item01)
    items05.add(item02)
    items05.add(item03)

    for (item in items05) {
        println(item.details)
    }
    // 顯示（依照title的字串內容排序）：
    //    Item(id=103, title=Chao, content=Java)
    //    Item(id=101, title=Hello, content=Kotlin)
    //    Item(id=102, title=Hi, content=Android)

}