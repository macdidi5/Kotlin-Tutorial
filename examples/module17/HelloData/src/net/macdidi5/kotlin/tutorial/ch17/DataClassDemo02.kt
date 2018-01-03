/* net.macdidi5.kotlin.tutorial.ch17.DataClassDemo02.kt */

package net.macdidi5.kotlin.tutorial.ch17

fun main(args: Array<String>) {

    val item01 = Item02(101, "Hello", "Kotlin")
    println(item01)
    // 顯示： 101	Hello	Kotlin

    val item02 = Item02(102)
    println(item02)
    // 顯示： 102

    item02.title = "Hi"
    item02.content = "Android"
    println(item02)
    // 顯示： 102	Hi	Android

    println(item02.details)

}