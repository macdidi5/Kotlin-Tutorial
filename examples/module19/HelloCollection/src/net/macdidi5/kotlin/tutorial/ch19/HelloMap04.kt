/* net.macdidi5.kotlin.tutorial.ch19.HelloMap04.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.*

fun main(args: Array<String>) {

    val item01 = Item(101, "Hello", "Kotlin")
    val item02 = Item(102, "Hi", "Android!")
    val item03 = Item(103, "Chao", "Java")
    val item04 = Item(103, "Thanks", "Java")

    // 建立key的型態為Long，value的型態為Item的TreeMap物件
    // TreeMap的元素會依照key的大小排列順序
    val itemMap02 = TreeMap<String, Item>()

    itemMap02[item01.title] = item01
    itemMap02[item02.title] = item02
    itemMap02[item03.title] = item03
    itemMap02[item04.title] = item04

    for ( (k, v) in itemMap02.entries ) {
        println("$k = ${v.details}")
    }
    // 顯示：
    //    Chao = Item(id=103, title=Chao, content=Java)
    //    Hello = Item(id=101, title=Hello, content=Kotlin)
    //    Hi = Item(id=102, title=Hi, content=Android!)
    //    Thanks = Item(id=103, title=Thanks, content=Java)

    println()

    // 使用sortedMapOf建立SortedMap物件
    // SortedMap的元素會依照key的大小排列順序
    val itemMap03: SortedMap<String, Item> = sortedMapOf(
            item01.content to item01,
            item02.content to item02,
            item03.content to item03,
            item04.content to item04
    )

    for ( (k, v) in itemMap03.entries ) {
        println("$k = ${v.details}")
    }
    // 顯示：
    //    Android! = Item(id=102, title=Hi, content=Android!)
    //    Java = Item(id=103, title=Thanks, content=Java)
    //    Kotlin = Item(id=101, title=Hello, content=Kotlin)

}