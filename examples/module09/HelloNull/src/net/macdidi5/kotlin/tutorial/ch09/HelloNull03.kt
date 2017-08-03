/* net.macdidi5.kotlin.tutorial.ch09.HelloNull03.kt */

package net.macdidi5.kotlin.tutorial.ch09

fun main(args: Array<String>) {

    // 變數與元素都不可以指定null值
    var names3: Array<String> = arrayOf("One", "Two", "Three")
    // 變數不可以指定null值，但是元素可以
    var names4: Array<String?> = arrayOf("One", "Two", "Three")
    // 變數與元素都可以指定null值
    var names5: Array<String?>? = arrayOf("One", "Two", "Three")

    // 變數與元素都不可以指定null值
    var names = arrayOf("Simon", "Mary", "Sam")

    // 編譯錯誤，變數不可以指定null值
    // names = null

    // 編譯錯誤，元素不可以指定null值
    // names[0] = null

    for (element in names) {
        print("${element.length}\t")
    }

    println()

    // 變數不可以指定null值，但是元素可以
    val names2 = arrayOf<String?>("Simon", "Mary", "Sam")
    // 元素可以指定null值
    names2[0] = null

    for (element in names2) {
        // 編譯錯誤，因為元素可以指定null值
        // print("${element.length}\t")
        print("${element?.length}\t")
    }

    println()

    for (element in names2) {
        print("${element?.length ?: -1}\t")
    }

}