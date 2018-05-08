/* net.macdidi5.kotlin.tutorial.ch19.HelloSet02.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.TreeSet

fun main(args: Array<String>) {

    // 使用setOf函式建立字串元素的Set物件
    val names02 : Set<String> = setOf("Simon", "Mary", "Sam")

    // 使用setOf建立的Set物件不可以執行元素的異動
    // 所以沒有add與delete這類異動的函式
    // names02.add("John")

    for (n in names02) {
        println("Hello02! $n!")
    }

    println()

    // 使用mutableSetOf函式建立字串元素的MutableSet物件
    val names03 : MutableSet<String> =
            mutableSetOf("Simon", "Mary", "Sam")

    // MutableSet物件可以執行元素的異動
    names03.add("John")

    for (n in names03) {
        println("Hello03! $n!")
    }

}