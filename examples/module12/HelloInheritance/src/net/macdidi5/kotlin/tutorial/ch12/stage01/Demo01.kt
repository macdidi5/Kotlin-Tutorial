/* net.macdidi5.kotlin.tutorial.ch12.stage01.Demo01.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage01

fun main(args: Array<String>) {
    val i = Item(1, "Hello", "Hello Kotlin!")
    println("id=${i.id}, title=${i.title}, content=${i.content}")

    val i02 = ImageItem(2, "Hi", "Hello", "kotlin.jpg")
    println("id=${i02.id}, title=${i02.title}, " +
            "content=${i02.content}, imageFile=${i02.imageFile}")
}