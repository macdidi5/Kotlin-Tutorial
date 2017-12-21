/* net.macdidi5.kotlin.tutorial.ch15.PrintableDemo03.kt */

package net.macdidi5.kotlin.tutorial.ch15

// 宣告一個接收Printable03物件參數的函式
fun report03(printable03 : Printable03) {
    println(printable03.getMessage("Prefix", "Message03"))
}

fun main(args: Array<String>) {

    // 宣告與實作Printable03介面的物件
    val p0301 = object : Printable03 {
        override fun getMessage(prefix : String?,
                                message : String?) : String {
            return "Printable03 implementation: $prefix-$message"
        }
    }

    report03(p0301)

    // 使用Lambda實作
    val p0302 = Printable03 {
        // 因為方法有多個參數宣告，所以必須在「->」前面定義所有參數名稱
        // 在「->」後面才是方法的實作
        prefix, message ->
        // 最後一行敘述是回傳值
        "Lambda Printable03 implementation: $prefix-$message"
    }

    report03(p0302)

    val p0303 = Printable03 {
        // 不需要使用的參數可以使用底線代替
        _, message ->
        "Lambda Printable03 implementation: $message"
    }

    report03(p0303)

}