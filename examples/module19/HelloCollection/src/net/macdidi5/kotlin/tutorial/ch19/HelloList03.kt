/* net.macdidi5.kotlin.tutorial.ch19.HelloList03.kt */

package net.macdidi5.kotlin.tutorial.ch19

fun main(args: Array<String>) {

    // 建立測試用的Item物件
    val item01 = Item(101, "Hello", "Kotlin")
    val item02 = Item(102, "Hi", "Android!")
    val item03 = Item(103, "Chao", "Java")

    // 建立元素型態為Item的ArrayList物件
    val items = ArrayList<Item>()

    // 加入Item元素
    items.add(item01)
    items.add(item02)
    items.add(item03)

    println("\n===== Sort by Item.compareTo:")

    // 如果元素類別已經實作Comparable介面
    // 呼叫sort函式以後，元素就會依照compareTo函式的實作重新排列
    items.sort()

    for (item in items) {
        println(item.details)
    }
    // 顯示（依照title的字元個數排序）：
    //    Item(id=102, title=Hi, content=Android)
    //    Item(id=103, title=Chao, content=Java)
    //    Item(id=101, title=Hello, content=Kotlin)

    println("\n===== Sort by id:")

    // 呼叫sortWith函式以後，元素就會依照參數的compareTo函式實作重新排列
    items.sortWith( ItemSortId() )

    for (item in items) {
        println(item.details)
    }
    // 顯示（依照id排序）：
    //    Item(id=101, title=Hello, content=Kotlin)
    //    Item(id=102, title=Hi, content=Android!)
    //    Item(id=103, title=Chao, content=Java)

    println("\n===== Sort by title:")

    // 呼叫sortWith函式以後，元素就會依照參數的compareTo函式實作重新排列
    items.sortWith( ItemSortTitle() )

    for (item in items) {
        println(item.details)
    }
    // 顯示（依照title的字串內容排序）：
    //    Item(id=103, title=Chao, content=Java)
    //    Item(id=101, title=Hello, content=Kotlin)
    //    Item(id=102, title=Hi, content=Android!)

}