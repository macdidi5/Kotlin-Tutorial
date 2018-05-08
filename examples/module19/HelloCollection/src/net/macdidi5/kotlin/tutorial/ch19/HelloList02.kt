/* net.macdidi5.kotlin.tutorial.ch19.HelloList02.kt */

package net.macdidi5.kotlin.tutorial.ch19

fun main(args: Array<String>) {

    // 使用listOf函式建立字串元素的List物件
    val names03 : List<String> = listOf("Simon", "Mary")

    // 使用listOf建立的List物件不可以執行元素的異動
    // 所以沒有add與delete這類異動的函式
    //names03.add("Sam")

    for (n in names03) {
        println("Hello03! $n!")
    }

    println()

    // 使用mutableListOf函式建立字串元素的MutableList物件
    val names04 : MutableList<String> = mutableListOf("Simon", "Mary")

    // MutableList物件可以執行元素的異動
    names04.add("Sam")

    for (n in names04) {
        println("Hello04! $n!")
    }

}