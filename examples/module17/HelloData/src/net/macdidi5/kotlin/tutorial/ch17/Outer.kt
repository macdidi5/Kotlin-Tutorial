/* net.macdidi5.kotlin.tutorial.ch17.Outer.kt */

package net.macdidi5.kotlin.tutorial.ch17

class Outer {

    private val number = 3

    // 宣告匿名類別
    val anony = object : Any() {

        val number = 5

        override fun toString() : String {
            // 匿名類別宣告的number
            println(number)
            // 匿名類別可以使用Outer類別的屬性與函式
            // Outer宣告的number
            println(this@Outer.number)

            return "Anonymous.number: $number, Outer.number: ${this@Outer.number}"
        }
    }

    // 宣告巢狀類別
    class Nested {

        private val number = 7

        fun showNumber() {
            println("Nested.number: $number")

            // 不可以使用Outer類別的屬性與函式
            println("can't access this@Outer.number")
        }

    }

    // 宣告內部類別
    // 多了inner關鍵字，就可以使用Outer類別的屬性與函式
    inner class Inner {

        private val number = 9

        fun showNumber() {
            // Inner宣告的number
            println(number)
            // Inner宣告的number
            println(this@Inner.number)
            // Outer宣告的number
            println(this@Outer.number)
        }

    }

}

fun main(args: Array<String>) {
    val outer = Outer()
    println(outer.anony)

    val nested : Outer.Nested = Outer.Nested()
    nested.showNumber()

    val inner : Outer.Inner = Outer().Inner()
    inner.showNumber()
}