/* net.macdidi5.kotlin.tutorial.ch08.HelloString01.kt */

package net.macdidi5.kotlin.tutorial.ch08

fun main(args: Array<String>) {

    // 宣告可以更改字串值的變數
    var greeting = "Hello"
    greeting = "Hi"

    // 宣告不可以更改字串值的變數
    val greeting2 = "Hello"
    // 編譯錯誤，不可以更改字串值
    //greeting2 = "Hi"

    val literal: String = """
        for (c in name) {
            print(c)
        }
    """

    println(literal)
    // 顯示：
    //            for (c in name) {
    //                print(c)
    //            }

    val literal2: String = """
        |for (c in name) {
        |    print(c)
        |}
    """.trimMargin()

    println(literal2)
    // 顯示：
    //for (c in name) {
    //    print(c)
    //}

    val literal3: String = """
        #for (c in name) {
        #    print(c)
        #}
    """.trimMargin("#")

    println(literal3)
    // 顯示：
    //for (c in name) {
    //    print(c)
    //}

    val name: String = "simon"

    println("\n=== name: $name ====\n")

    // 字元個數
    println("name.length: ${name.length}")
    // 最後一個字元的編號
    println("name.lastIndex: ${name.lastIndex}")

    // 第一個與最後一個字元
    println("name.first(): ${name.first()}")
    println("name.last(): ${name.last()}")

    // 把第一個字元轉換為大寫
    println("name.capitalize(): ${name.capitalize()}")
    // 把第一個字元轉換為小寫
    println("name.decapitalize(): ${name.decapitalize()}")

    // 重複字串內容指定的次數
    println("name.repeat(3): ${name.repeat(3)}")

    // 傳回字元編號的範圍運算式
    for (i in name.indices) {
        // 取得指定編號的字元
        print("${name.get(i)}\t")
    }

    println()

    // 使用for迴圈依序處理所有字元
    for (c in name) {
        print("$c\t")
    }

    println()

    val name2 = "SIMON"

    println("\n=== name2: $name2 ====\n")

    // 判斷兩個字串是否一樣
    println("name.equals(name2): ${name.equals(name2)}")
    // 判斷兩個字串是否一樣，不分大小寫
    println("name.equals(name2): ${name.equals(name2, true)}")

    // 如果字串的字元個數小於指定的數字，在前面補上空白
    println("name2.padStart(5): [${name2.padStart(10)}]")
    // 如果字串的字元個數小於指定的數字，在前面補上指定的字元
    println("name2.padStart(5, '-'): [${name2.padStart(10, '-')}]")

    // 如果字串的字元個數小於指定的數字，在後面補上空白
    println("name2.padEnd(5): [${name2.padEnd(10)}]")
    // 如果字串的字元個數小於指定的數字，在後面補上指定的字元
    println("name2.padEnd(5, '-'): [${name2.padEnd(10, '-')}]")

    val URL = "http://www.CODEDATA.com.tw"

    println("\n=== URL: $URL ====\n")

    // 轉換為大寫
    println("URL.toLowerCase(): ${URL.toLowerCase()}")
    // 轉換為小寫
    println("URL.toUpperCase(): ${URL.toUpperCase()}")

    // 判斷字串前面是否為指定的內容
    println("URL.startsWith(\"http\"): ${URL.startsWith("http")}")
    // 判斷字串後面是否為指定的內容
    println("URL.endsWith(\"tw\"): ${URL.endsWith("tw")}")

    // 判斷字串內容是否為空白
    println("URL.isBlank(): ${URL.isBlank()}")
    println("URL.isNotBlank(): ${URL.isNotBlank()}")

    // 判斷是否沒有字元
    println("URL.isEmpty(): ${URL.isEmpty()}")
    println("URL.isNotEmpty(): ${URL.isNotEmpty()}")

    // 從字串前面往後搜尋，傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.indexOf(\"w\"): ${URL.indexOf("w")}")
    // 從字串後面往前搜尋，傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.lastIndexOf(\"w\"): ${URL.lastIndexOf("w")}")

    // 傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.indexOf(\"codedata\"): ${URL.indexOf("codedata")}")
    // 傳回指定內容的位置編號，沒有的話傳回-1，不分大小寫
    println("URL.indexOf(\"codedata\", 0, true): ${URL.indexOf("codedata", 0, true)}")

    // 移除字串前面指定的內容
    println("URL.removePrefix(\"http://\"): ${URL.removePrefix("http://")}")
    // 移除指定範圍的字元
    println("URL.removeRange(0..6): ${URL.removeRange(0..6)}")

}