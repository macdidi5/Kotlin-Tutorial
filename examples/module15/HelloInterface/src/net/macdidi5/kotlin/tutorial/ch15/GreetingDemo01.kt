/* net.macdidi5.kotlin.tutorial.ch15.GreetingDemo01.kt */

package net.macdidi5.kotlin.tutorial.ch15

import java.time.LocalDate
import java.time.LocalDateTime

// 宣告實作Greeting01介面的類別
class Greeting01Impl : Greeting01 {
    // 使用override關鍵字
    // 覆寫Greeting01介面的greet抽象函式
    // 函式的宣告必須和介面的抽象函式一樣
    override fun greet(name : String): String {
        return "Hello! $name!"
    }
}

// 宣告一個接收Greeting01物件參數的函式
fun sayHello(greeting : Greeting01) {
    println(greeting.greet("Simon"))
}

fun main(args: Array<String>) {

    // 建立實作Greeting01介面的物件
    val greeting01 = Greeting01Impl()
    // 呼叫函式並傳送Greeting01物件
    sayHello(greeting01)
    // 顯示： Hello! Simon!

    // 宣告與實作Greeting01介面的物件
    val greeting02 = object : Greeting01 {
        override fun greet(name : String): String {
            return "Hello! $name! ${LocalDate.now()}"
        }
    }

    sayHello(greeting02)
    // 顯示： Hello! Simon! 2017-12-19

    // 在方法的參數宣告與實作Greeting01介面的物件
    sayHello(object : Greeting01 {
        override fun greet(name : String): String {
            return "Hello! $name! ${LocalDateTime.now()}"
        }
    })
    // 顯示： Hello! Simon! 2017-12-19T11:51:40.792

}