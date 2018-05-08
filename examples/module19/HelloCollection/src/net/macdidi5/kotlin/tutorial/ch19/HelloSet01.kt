/* net.macdidi5.kotlin.tutorial.ch19.HelloSet01.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.TreeSet

fun main(args: Array<String>) {

    // 建立元素型態為String的HashSet物件
    val names01 = HashSet<String>()

    // 加入String元素
    names01.add("Simon")
    names01.add("Mary")
    names01.add("Sam")

    // 編譯錯誤，不可以加入null元素
    //names01.add(null)

    // 編譯錯誤，不可以加入String型態以外的元素
    //names01.add(Item(101, "Hello", "Kotlin"))

    // 重複的元素會忽略
    names01.add("Simon")

    println("names01.size: ${names01.size}")
    // 顯示： names01.size: 3

    for (n in names01) {
        println("Hello01! $n!")
    }
    // 顯示：
    //    Hello01! Simon!
    //    Hello01! Sam!
    //    Hello01! Mary!

}