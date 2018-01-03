/* net.macdidi5.kotlin.tutorial.ch17.test.VisibilityDemo01.kt */

package net.macdidi5.kotlin.tutorial.ch17.test

import net.macdidi5.kotlin.tutorial.ch17.Visibility
import net.macdidi5.kotlin.tutorial.ch17.defaultPublicFunction
import net.macdidi5.kotlin.tutorial.ch17.explicitPublicFunction
import net.macdidi5.kotlin.tutorial.ch17.internalFunction

// 編譯錯誤，不可以import private函式
// import net.macdidi5.kotlin.tutorial.ch17.privateFunction

import java.util.Random

// 繼承Visibility的子類別
class SubVisibility : Visibility(1) {
    fun demo() {
        println("defaultPublicProperty: $defaultPublicProperty")
        println("explicitPublicProperty: $explicitPublicProperty")
        println("internalProperty: $internalProperty")

        // 可以使用Visibility定義為protected的屬性與函式
        println("protectedProperty: $protectedProperty")

        // 編譯錯誤，不可以使用private屬性
        // println("privateProperty: $privateProperty")
    }
}

// 把建構式定義為private
class PrivateConstructor private constructor() {

    internal constructor(_number : Int) : this() {
        println(_number)
    }

    companion object {
        fun game() = if (Random().nextInt(100) > 50) "Win" else "Lose"
    }

}

fun main(args: Array<String>) {

    println(defaultPublicFunction())
    println(explicitPublicFunction())
    println(internalFunction())
    // 編譯錯誤，
    // println(privateFunction())

    val v = Visibility(3)

    println("defaultPublicProperty: ${v.defaultPublicProperty}")
    println("explicitPublicProperty: ${v.explicitPublicProperty}")
    println("internalProperty: ${v.internalProperty}")
    // 編譯錯誤，不可以使用protected屬性
    // println("protectedProperty: ${v.protectedProperty}")
    // 編譯錯誤，不可以使用private屬性
    // println("privateProperty: ${v.privateProperty}")

    // 編譯錯誤，不可以呼叫private constructor
    // val pc = PrivateConstructor()

    println(PrivateConstructor.game())

}