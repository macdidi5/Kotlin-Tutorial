/* net.macdidi5.kotlin.tutorial.ch18.ContainerDemo01.kt */

package net.macdidi5.kotlin.tutorial.ch18

fun main(args: Array<String>) {

    // 建立包裝字串的容器物件
    val sc = StringContainer(3)

    // 加入字串元素
    sc.add("Simon")
    sc.add("Mary")
    sc.add("John")

    for (i in 0..2) {
        println("$i : ${sc.get(i)}")
    }

    println()

    // 建立包裝Item的容器物件
    val ic = ItemContainer(3)

    // 加入Item元素
    ic.add(Item(101, "Hello", "Kotlin"))
    ic.add(Item(102, "Hi", "Android"))
    ic.add(Item(103, "Chao", "Java"))

    for (i in 0..2) {
        println("$i : ${ic.get(i)?.details}")
    }

}