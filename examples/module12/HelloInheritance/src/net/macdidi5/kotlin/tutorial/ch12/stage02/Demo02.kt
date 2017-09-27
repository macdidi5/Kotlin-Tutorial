/* net.macdidi5.kotlin.tutorial.ch12.stage02.Demo02.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage02

fun main(args: Array<String>) {
    val i = Item(1, "Hello", "Hello Kotlin!")
    println("id=${i.id}, title=${i.title}, content=${i.content}")

    // 建立ImageItem物件後，包含從父類別Item繼承的id、title與content
    val i02 = ImageItem(2, "Hi", "Hello", "kotlin.jpg")
    println("id=${i02.id}, title=${i02.title}, " +
            "content=${i02.content}, imageFile=${i02.imageFile}")
}
