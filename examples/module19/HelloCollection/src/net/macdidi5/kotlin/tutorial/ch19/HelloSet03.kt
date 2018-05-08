/* net.macdidi5.kotlin.tutorial.ch19.HelloSet03.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.TreeSet

fun main(args: Array<String>) {

    // 建立測試用的Item物件
    val item01 = Item(101, "Hello", "Kotlin")
    val item02 = Item(102, "Hi", "Android")
    val item03 = Item(103, "Chao", "Java")
    // 跟item01一樣的Item物件
    val item04 = Item(101, "Hello", "Kotlin")

    // 建立元素型態為Item的TreeSet物件
    // 如果元素類別已經實作Comparable介面
    // 加入的元素就會依照compareTo函式的實作排列
    val items02 = TreeSet<Item>()

    // 加入Item元素
    items02.add(item01)
    items02.add(item02)
    items02.add(item03)
    // 重複的元素會忽略
    items02.add(item04)

    for (item in items02) {
        println(item.details)
    }
    // 顯示（依照title的字元個數排序）：
    //    Item(id=102, title=Hi, content=Android)
    //    Item(id=103, title=Chao, content=Java)
    //    Item(id=101, title=Hello, content=Kotlin)

    println()

    // 使用sortedSetOf函式建立字串元素的TreeSet物件
    // 如果元素類別已經實作Comparable介面
    // 加入的元素就會依照compareTo函式的實作排列
    val items03 = sortedSetOf(item01, item02, item03, item04)

    for (item in items03) {
        println(item.details)
    }
    // 顯示（依照title的字元個數排序）：
    //    Item(id=102, title=Hi, content=Android)
    //    Item(id=103, title=Chao, content=Java)
    //    Item(id=101, title=Hello, content=Kotlin)

}