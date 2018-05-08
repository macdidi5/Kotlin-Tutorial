/* net.macdidi5.kotlin.tutorial.ch19.HelloMap01.kt */

package net.macdidi5.kotlin.tutorial.ch19

import java.util.*

fun main(args: Array<String>) {


    // 建立key與value的型態都為String的HashMap物件
    val names01 = HashMap<String, String>()

    // 呼叫put函式加入元素，第一個參數為key，第二個參數為value
    names01.put("S", "Simon")
    names01.put("M", "Mary")

    // 建議使用類似陣列的語法加入元素
    names01["J"] = "John"
    names01["S"] = "Sam"

    println("names01.size: ${names01.size}")
    // 顯示： names01.size: 3

    // 呼叫get函式取得與key對應的value
    println("names01.get(\"M\"): ${names01.get("M")}")
    // 顯示： names01.get("M"): Mary

    // 建議使用類似陣列的方式取得與key對應的value
    println("names01[\"M\"]: ${names01["M"]}")
    // 顯示： names01["M"]: Mary

    // 如果指定的key不存在就傳回null值
    println("names01.get(\"X\"): ${names01.get("X")}")
    println("names01[\"X\"]: ${names01["X"]}")
    // 顯示：
    //    names01.get("X"): null
    //    names01["X"]: null

    // 使用搭配Map物件特殊的for迴圈，讀取所有元素的key與value
    for ((key, value) in names01.entries) {
        println("$key = $value")
    }
    // 顯示：
    //    S = Sam
    //    J = John
    //    M = Mary

}