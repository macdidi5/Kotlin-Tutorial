/* net.macdidi5.kotlin.tutorial.ch15.Greeting02.kt */

package net.macdidi5.kotlin.tutorial.ch15

interface Greeting02 {
    // 宣告抽象屬性變數
    val name : String
    // 宣告一般屬性變數
    val upperName : String
        get() = name.toUpperCase()

    // 宣告抽象函式
    fun message(): String

    // 宣告一般函式
    fun displayName() {
        println("Name: $name")
    }

    // 宣告一般函式
    fun displayGreeting() {
        println("Hello, $upperName")
    }
}