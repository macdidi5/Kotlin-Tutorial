/* net.macdidi5.kotlin.tutorial.ch12.stage04.Demo04.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage04

fun main(args: Array<String>) {
    val i = Item(1, "Hello", "Hello Kotlin!")
    println(i.getDetails())

    val i02 = ImageItem(2, "Hi", "Hello", "kotlin.jpg")
    println(i02.getDetails())
}