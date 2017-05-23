/* net/macdidi5/kotlin/demo/variable/HelloVariable.kt */
package net.macdidi5.kotlin.demo.variable

fun main(args: Array<String>) {
    val x: Int = 3  // 使用val宣告不可改變的變數
    val y = 5       // 使用設定值推論變數型態
    val z: Int      // 沒有設定值的變數就一定要指定型態
    z = 7           // 設定值以後就不可以改變

    println("X: " + x)
    println("Y: " + y)
    println("Z: " + z)

    // 下面的敘數都會造成錯誤： Val cannot be reassigned
    /*
    x = 13
    y = 15
    z = 17
    */

    var v: Int = 3          // 使用var宣告可以改變的變數
    v = 13                  // 不會發生錯誤
    println("V: " + v)
}