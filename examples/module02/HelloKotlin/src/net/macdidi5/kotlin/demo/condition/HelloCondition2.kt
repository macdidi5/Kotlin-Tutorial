/* net/macdidi5/kotlin/demo/condition/HelloCondition2.kt */
package net.macdidi5.kotlin.demo.condition

fun main(args: Array<String>) {
    val x = 3
    val y = 5
    val z: Int

    // 一般的寫法
    if (x > y) {
        z = x
    }
    else {
        z = y
    }
    // 顯示： 5
    println(z)

    val v: Int

    // if-else運算式的寫法
    v = if (x > y) x else y
    // 顯示： 5
    println(v)
}