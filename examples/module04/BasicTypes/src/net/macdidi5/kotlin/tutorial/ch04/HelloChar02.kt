package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    var message = "This is\na book."       // 使用\n
    println(message)
    // 顯示兩行訊息：
    // This is
    // a book.

//    var s  = "Double quote(") in string"   // 錯誤
    var s2 = "Double quote(\") in string"  // 使用\"
    var s3 = "Dollar sign(\$) in string"
    // $在字串裡面為使用String template，如果需要顯示$，就必須使用\$
}