/* net.macdidi5.kotlin.tutorial.ch19.HelloList01.kt */

package net.macdidi5.kotlin.tutorial.ch19

fun main(args: Array<String>) {

    // 建立元素型態為String的ArrayList物件
    val names01 = ArrayList<String>()

    names01.add("Simon")
    names01.add("Mary")
    names01.add("Sam")
    names01.add("Simon")

    // 不可以加入null元素
    //names01.add(null)

    // 不可以加入String型態以外的元素
    // names01.add(LocalDate.now())

    println("names01.size: ${names01.size}")
    // 顯示： names01.size: 3

    // 呼叫get函式取得參數指定索引編號的元素
    println("names01.get(1): ${names01.get(1)}")
    // 顯示： names01.get(1): Mary

    // 建議使用這樣的作法取得指定索引編號的元素
    println("names01[1]: ${names01[1]}")
    // 顯示： names01[1]: Mary

    for (n in names01) {
        println("Hello01! $n!")
    }
    // 顯示：
    //    Hello01! Simon!
    //    Hello01! Mary!
    //    Hello01! Sam!
    //    Hello01! Simon!

    println()

    // 建立元素型態為String的ArrayList物件，元素可以接受null
    val names02 : ArrayList<String?> = ArrayList()

    names02.add("Simon")
    names02.add("Mary")
    names02.add("Sam")
    names02.add("Simon")
    names02.add(null)

    // 使用List的元素索引編號
    for ( (i, n) in names02.withIndex()) {
        println("$i : Hello02! $n!")
    }
    // 顯示：
    //    0 : Hello02! Simon!
    //    1 : Hello02! Mary!
    //    2 : Hello02! Sam!
    //    3 : Hello02! Simon!
    //    4 : Hello02! null!

}