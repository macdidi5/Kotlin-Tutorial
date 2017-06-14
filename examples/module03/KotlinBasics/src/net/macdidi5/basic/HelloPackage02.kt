/* net.macdidi5.basic.HelloPackage02.kt */

package net.macdidi5.basic

// 使用import設定在某個套件的函式
import net.macdidi5.other.average
import net.macdidi5.root.summary

fun main(args: Array<String>) {
    // 呼叫的時候就可以省略函式名稱前面的套件名稱
    val t = summary(3, 5, 7)
    println("Total: $t")

    val a = average(3, 5, 7)
    println("Average: $a")
}
