/* net.macdidi5.kotlin.tutorial.ch19.HelloMap02.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.*

fun main(args: Array<String>) {

    // 使用hashMapOf函式建立HashMap物件，可以執行元素的異動
    val names02 : HashMap<String, String> = hashMapOf(
            "S" to "Simon",
            "M" to "Mary",
            "J" to "John")

    // Map物件的keys屬性傳回所有key，型態為Set<K>
    for (key in names02.keys) {
        print("$key\t")
    }
    // 顯示：M	J	S

    println()

    // Map物件的values屬性傳回所有value，型態為Collection<V>
    for (value in names02.values) {
        print("$value\t")
    }
    // 顯示：Mary	John	Simon

    println("\n")

    // 使用mapOf函式建立Map物件，不可以執行元素的異動
    val names03: Map<String, String> = mapOf(
            "S" to "Simon",
            "M" to "Mary",
            "J" to "John")

    // 使用mapOf建立的Map物件不可以執行元素的異動
    // 所以沒有put這類異動的函式
    //names03.put("C", "Chris")

    // 也不可以使用這樣的語法
    //names03["R"] = "Rose"

    for ((key, value) in names03.entries) {
        println("$key = $value")
    }
    // 顯示：
    //    S = Simon
    //    M = Mary
    //    J = John

    println()

    // 使用mutableMapOf函式建立MutableMap物件，可以執行元素的異動
    val names04: MutableMap<String, String> = mutableMapOf(
            "S" to "Simon",
            "M" to "Mary",
            "J" to "John")

    names04.put("C", "Chris")
    names04["R"] = "Rose"

    for ((key, value) in names04.entries) {
        println("$key = $value")
    }
    // 顯示：
    //    S = Simon
    //    M = Mary
    //    J = John
    //    C = Chris
    //    R = Rose

}