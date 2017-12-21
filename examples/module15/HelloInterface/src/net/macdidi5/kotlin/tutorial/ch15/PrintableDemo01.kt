/* net.macdidi5.kotlin.tutorial.ch15.PrintableDemo01.kt */

package net.macdidi5.kotlin.tutorial.ch15

// 宣告一個接收Printable01物件參數的函式
fun report01(printable : Printable01) {
    printable.print()
}

// 宣告實作Printable01介面的類別
class Printable01Impl : Printable01 {
    // 覆寫Printable01介面的print抽象函式
    override fun print() {
        println("Printable01Impl implementation.")
    }
}

fun main(args: Array<String>) {

    // 建立實作Printable01介面類別的物件
    val p0101 = Printable01Impl()
    report01(p0101)

    // 宣告與實作Printable01介面的物件
    val p0102 = object : Printable01 {
        override fun print() {
            println("Printable01 implementation.")
        }
    }

    report01(p0102)

    // 如果需要實作的Java介面是functional interface
    // 就可以使用Lambda實作
    val p0103 = Printable01 {
        println("Lambda Printable01 implementation.")
    }

    report01(p0103)

    val pm = PrintableMethod01()
    // 如果Java方法接收functional interface型態的參數
    // 就可以使用這樣的Lambda實作
    pm.set { println("Lambda Printable01 implementation.") }
    pm.process()

}