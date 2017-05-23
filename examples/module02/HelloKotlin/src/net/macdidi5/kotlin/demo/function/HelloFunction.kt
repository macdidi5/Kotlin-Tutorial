/* net/macdidi5/kotlin/demo/function/HelloFunction.kt */
package net.macdidi5.kotlin.demo.function

// 宣告一個接收兩個字串參數，執行後回傳字串的函式
fun getGreeting(greet: String, name: String): String {
    return greet + ", " + name + "!"
}

// 如果函式只有一個回傳的敘述，可以簡化成這樣
fun getGreeting2(greet: String, name: String) =
        greet + ", " + name + "!"

// 沒有回傳值的函式，把回傳值宣告為「Unit」
fun sayGreeting(greet: String, name: String): Unit {
    println(greet + ", " + name + "!")
}

// 沒有回傳值的函式，也可以省略「:Unit」
fun sayGreeting2(greet: String, name: String) {
    println(greet + ", " + name + "!")
}

fun main(args: Array<String>) {
    println( getGreeting("Hello", "Simon") )
    println( getGreeting2("Hello", "Simon") )
    sayGreeting("Hello", "Simon")
    sayGreeting2("Hello", "Simon")
}