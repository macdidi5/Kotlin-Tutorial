/* net.macdidi5.kotlin.tutorial.ch19.HelloMap03.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.*

fun main(args: Array<String>) {

    val item01 = Item(101, "Hello", "Kotlin")
    val item02 = Item(102, "Hi", "Android!")
    val item03 = Item(103, "Chao", "Java")
    val item04 = Item(103, "Thanks", "Java")

    // 建立key的型態為Long，value的型態為Item的HashMap物件
    val itemMap = HashMap<Long, Item>()

    itemMap[item01.id] = item01
    itemMap[item02.id] = item02
    itemMap[item03.id] = item03
    // key值重複了，覆蓋對應的value
    itemMap[item04.id] = item04

    for ( (id, item) in itemMap.entries ) {
        println("$id = ${item.details}")
    }
    // 顯示：
    //    101 = Item(id=101, title=Hello, content=Kotlin)
    //    102 = Item(id=102, title=Hi, content=Android!)
    //    103 = Item(id=103, title=Thanks, content=Java)

    println()

    // 因為如果指定的key不存在，就會傳回null，所以會發生編譯錯誤
    //println(itemMap[101].details)
    // 必須
    println(itemMap[101]?.details)
    // 顯示：Item(id=101, title=Hello, content=Kotlin)
    println(itemMap[999]?.details)
    // 顯示：null

}