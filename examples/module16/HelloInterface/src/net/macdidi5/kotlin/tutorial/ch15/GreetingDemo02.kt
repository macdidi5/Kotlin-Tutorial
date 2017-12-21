/* net.macdidi5.kotlin.tutorial.ch15.GreetingDemo02.kt */

package net.macdidi5.kotlin.tutorial.ch15

import java.time.LocalDate
import java.time.LocalDateTime

// 宣告實作Greeting02介面的類別
class Greeting02Impl : Greeting02 {

    // 覆寫Greeting02介面的name抽象屬性
    override val name = "Simon"

    // 覆寫Greeting02介面的message抽象函式
    override fun message(): String {
        return "Hello! $name!"
    }

}

// 宣告一個接收Greeting02物件參數的函式
fun sayHello02(greeting02 : Greeting02) {
    println(greeting02.message())
}

fun main(args: Array<String>) {

    // 建立實作Greeting02介面的物件
    val greeting0201 = Greeting02Impl()

    // 使用Greeting02介面宣告的屬性變數
    println("${greeting0201.name}, ${greeting0201.upperName}")
    // 顯示： Simon, SIMON

    // 呼叫Greeting02介面宣告的一般函式
    greeting0201.displayName()
    // 顯示： Name: Simon
    greeting0201.displayGreeting()
    // 顯示： Hello, SIMON

    // 呼叫函式並傳送Greeting02物件
    sayHello02(greeting0201)
    // 顯示： Hello! Simon!

    // 宣告與實作Greeting02介面的物件
    val greeting0202 = object : Greeting02 {
        override val name = "Mary"

        override fun message(): String {
            return "Hello! $name! ${LocalDate.now()}"
        }
    }

    sayHello02(greeting0202)
    // 顯示： Hello! Mary! 2017-12-19

    // 在方法的參數宣告與實作Greeting02介面的物件
    sayHello02(object : Greeting02 {
        override val name = "Mary"

        override fun message(): String {
            return "Hello! $name! ${LocalDateTime.now()}"
        }
    })
    // 顯示： Hello! Mary! 2017-12-19T11:57:01.340

}