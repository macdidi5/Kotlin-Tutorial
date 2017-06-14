/* net.macdidi5.basic.HelloPackage.kt */

package net.macdidi5.basic

fun main(args: Array<String>) {
    // 呼叫在其它套件的函式，必須在函式名稱前面加上套件名稱
    val t = net.macdidi5.root.summary(3, 5, 7)
    println("Total: $t")

    val a = net.macdidi5.other.average(3, 5, 7)
    println("Average: $a")
}
