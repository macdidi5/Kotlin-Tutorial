/* net.macdidi5.kotlin.tutorial.ch15.PrintableDemo04.kt */

package net.macdidi5.kotlin.tutorial.ch15

// 宣告一個接收Printable04物件參數的函式
fun report04(printable04 : Printable04) {
    printable04.print()
    printable04.cancel()
}

// 實作Java Printable04介面
class Printable04Impl : Printable04 {
    // 覆寫print抽象方法
    override fun print() {
        println("Printable04Impl: print")
    }

    // 覆寫cancel抽象方法
    override fun cancel() {
        println("Printable04Impl: cancel")
    }
}

fun main(args: Array<String>) {

    // 建立實作Printable04介面類別的物件
    val p0401 = Printable04Impl()

    report04(p0401)


    // 因為Printable04介面有兩個抽象方法
    // 所以它不是functional interface
    // 不可以使用lambda實作
    // 這裡是採用匿名類別的實作
    report04( object : Printable04 {
        // 覆寫print抽象方法
        override fun print() {
            println("print: I am not a functional interface.")
        }

        // 覆寫cancel抽象方法
        override fun cancel() {
            println("cancel: I am not a functional interface.")
        }
    })

}