/* net.macdidi5.kotlin.tutorial.ch18.ContainerDemo02.kt */

package net.macdidi5.kotlin.tutorial.ch18

class GenericClass<QQQ> {
    private var value : QQQ? = null

    fun get() : QQQ? {
        return value
    }

    fun set(value : QQQ?) {
        this.value = value
    }
}

fun main(args: Array<String>) {

    val stringGC = GenericClass<String>()
    val itemGC = GenericClass<Item>()

    // 建立包裝元素的容器物件，使用泛型設定元素為字串
    val sc = Container<String>(3)

    // 加入字串元素
    sc.add("Simon")
    sc.add("Mary")
    sc.add("John")

    for (i in 0..2) {
        println("$i : ${sc.get(i)}")
    }

    println()

    // 建立包裝元素的容器物件，使用泛型設定元素為Item
    val ic = Container<Item>(3)

    // 加入Item元素
    ic.add(Item(101, "Hello", "Kotlin"))
    ic.add(Item(102, "Hi", "Android"))
    ic.add(Item(103, "Chao", "Java"))

    for (i in 0..2) {
        println("$i : ${ic.get(i)?.details}")
    }

}