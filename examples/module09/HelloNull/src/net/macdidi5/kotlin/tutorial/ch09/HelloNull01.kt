/* net.macdidi5.kotlin.tutorial.ch09.HelloNull01.kt */

package net.macdidi5.kotlin.tutorial.ch09

fun main(args: Array<String>) {
    var name: String = "Simon"

    // 編譯錯誤，不可以指定null值
    //name = null

    // 不可以指定null值的變數，可以直接呼叫函式
    println(name.toUpperCase())

    // 宣告可以指定null值的變數
    var name2: String? = "Mary"

    // 可以指定null值
    name2 = null

    // 編譯錯誤，因為可以指定null值的變數
    // 不允許直接呼叫函式
    // println(name2.length)

    // 如果先經過null值的判斷...
    if (name2 != null) {
        // 就可以直接使用
        println(name2.length)
    }

    // 必須在變數名稱後面多一個問號
    // 變數是null值的時候，不會發生例外，不過會傳回null
    println(name2?.length)

    name2 = "Sam"
    // 變數不是null值的時候，顯示呼叫函式執行後的結果3
    println(name2?.length)

    name2 = null
    //println(name2!!.length)
    // 發生例外
    // Exception in thread "main" kotlin.KotlinNullPointerException

    val length: Int

    if (name2 != null)
        length = name2.length
    else
        length = 0

    println("length: $length")

    // 如果name2是null值，就使用「?:」後面的值
    println( name2?.length ?: 0 )

}