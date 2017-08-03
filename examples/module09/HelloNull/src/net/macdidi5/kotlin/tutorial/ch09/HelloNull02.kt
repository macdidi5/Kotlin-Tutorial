/* net.macdidi5.kotlin.tutorial.ch09.HelloNull02.kt */

package net.macdidi5.kotlin.tutorial.ch09

fun main(args: Array<String>) {

    var name: String? = null

    // 判斷變數是否為null或空白
    println("name.isNullOrBlank(): ${name.isNullOrBlank()}")
    // 判斷變數是否為null或沒有字元
    println("name.isNullOrEmpty(): ${name.isNullOrEmpty()}")

    // 編譯錯誤，不可以直接呼叫
    //println("name.isBlank(): ${name.isBlank()}")
    //println("name.isEmpty(): ${name.isEmpty()}")

    println("name.isBlank(): ${name?.isBlank()}")
    println("name.isEmpty(): ${name?.isEmpty()}")

    var name2: String? = ""

    // 判斷變數是否為null或空白
    println("name2.isNullOrBlank(): ${name2.isNullOrBlank()}")
    // 判斷變數是否為null或沒有字元
    println("name2.isNullOrEmpty(): ${name2.isNullOrEmpty()}")

    var name3: String = "Simon"

    // 判斷變數是否為空白
    println("name3 isBlank: ${name3.isBlank()}")
    // 判斷變數是否沒有字元
    println("name3 isEmpty: ${name3.isEmpty()}")

}