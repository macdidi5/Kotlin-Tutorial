/* net.macdidi5.kotlin.tutorial.ch15.GreetingDemo03.kt */

package net.macdidi5.kotlin.tutorial.ch15

// 宣告實作Greeting02介面的類別
class Greeting03Impl : Greeting03 {

    // 覆寫Greeting01介面的greet抽象函式
    override fun greet(name : String): String {
        return "Hello! $name!"
    }

    // 覆寫Greeting03介面的getGreeting抽象函式
    override fun getGreeting(): String {
        return greet("Mary")
    }

}

fun main(args: Array<String>) {

    // 建立實作Greeting03介面的物件
    val greeting0301 = Greeting03Impl()

    println(greeting0301.greet("Simon"))
    println(greeting0301.getGreeting())
    // 顯示：
    //    Hello! Simon!
    //    Hello! Mary!

}