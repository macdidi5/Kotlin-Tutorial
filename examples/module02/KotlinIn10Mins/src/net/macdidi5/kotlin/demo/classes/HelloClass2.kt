package net.macdidi5.kotlin.demo.classes

// 宣告Employee類別，沒有使用open，表示這個類別不可以被繼承
// (name: String)是一個字串參數的主要建構式（primary constructor）
// 使用Person(name)呼教父類別的建構式
class Employee(name: String) : Person(name) {

    // 一個可以改變值的屬性（property）
    var salary: Double = 0.0

    // 其它建構式，使用this(name)呼叫主要建構式
    constructor(name: String, gender: Char, salary: Double): this(name) {
        // 設定繼承自父類別的屬性值
        super.gender = gender
        // 設定屬性值
        this.salary = salary
    }

    // 覆寫繼承自父類別的函式
    override fun printInformation() {
        // 呼叫父類別的函式
        super.printInformation()
        println("Salary: $salary")
    }

}

fun main(args: Array<String>) {
    // 呼叫其它建構式建立Employee物件
    val simon = Employee("Simon", 'M', 25000.0)
    // 呼叫函式
    simon.printInformation()
    // 執行後顯示：
    //      Name: Simon
    //      Gender: M
    //      Salary: 25000.0
}