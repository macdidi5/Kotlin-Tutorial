/* net/macdidi5/kotlin/demo/condition/HelloCondition3.kt */
package net.macdidi5.kotlin.demo.condition

fun main(args: Array<String>) {
    val grade = 'B'
    val bonus: Int

    when (grade) {
        'A'     -> bonus = 5000
        'B'     -> bonus = 3000
        'C'     -> bonus = 1000
        else    -> bonus = 50
    }

    // 顯示： Bonus: 3000
    println("Bonus: $bonus")

    val bonus2 =
            when (grade) {
                'A'     -> 5000
                'B'     -> 3000
                'C'     -> 1000
                else    -> 50
            }

    // 顯示： Bonus: 3000
    println("Bonus2: $bonus2")
}