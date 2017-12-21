/* net.macdidi5.kotlin.tutorial.ch15.PrintableDemo02.kt */

package net.macdidi5.kotlin.tutorial.ch15

// 宣告一個接收Printable02物件參數的函式
fun report02(printable02 : Printable02) {
    printable02.print("Message02.")
}

fun main(args: Array<String>) {

    // 宣告與實作Printable02介面的物件
    val p0201 = object : Printable02 {
        // 覆寫Printable02介面的print抽象函式
        override fun print(message: String) {
            println("Printable02 implementation: $message")
        }
    }

    report02(p0201)

    // 使用Lambda實作
    val p0202 = Printable02 {
        // 因為print抽象函式只有一個參數
        // 在lambda裡面使用「it」代表參數
        println("Lambda Printable02 implementation: $it")
    }

    report02(p0202)

    // 在方法的參數使用Lambda實作Printable02介面的物件
    report02(Printable02 {
        // 「it」是print抽象函式的參數
        println("Lambda Printable02 implementation: $it")
    })

}