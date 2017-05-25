/* net/macdidi5/kotlin/demo/classes/HelloClass.kt */
package net.macdidi5.kotlin.demo.classes

// 宣告Person類別，使用open讓這個類別可以被繼承
// (var name: String)是一個字串參數的主要建構式（primary constructor）
open class Person(var name: String) {

    // 一個可以改變值的屬性（property）
    var gender: Char = 'U'
    // 一個不可以改變值的屬性
    val information: String
        // 為information加入getter方法
        get() = "$name(${if (gender=='M') "Male" else "Female"})"

    // 其它建構式，使用this(name)呼叫主要建構式
    constructor(name: String, gender: Char) : this(name) {
        // 設定屬性
        this.gender = gender
    }

    // 函式
    fun sayGreeting() {
        println("Hello, $name!")
    }

    // 函式，使用open讓子類別可以覆寫這個方法
    open fun printInformation() {
        println("Name: $name")
        println("Gender: $gender")
    }

}

fun main(args: Array<String>) {
    // 呼叫主要建構式建立Person物件
    val simon: Person = Person("Simon")
    // 呼叫函式，顯示： Hello, Simon!
    simon.sayGreeting()
    // 設定屬性值
    simon.gender = 'M'
    // 使用屬性值，顯示： Simon(Male)
    println(simon.information)

    println()

    // 呼叫其它建構式建立Person物件
    val mary = Person("Mary", 'F')
    // 呼叫函式，顯示： Hello, Mary!
    mary.sayGreeting()
    // 使用屬性值，顯示： Mary's gender is F
    println("${mary.name}'s gender is ${mary.gender}")
}