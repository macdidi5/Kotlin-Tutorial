package net.macdidi5.kotlin.tutorial.ch11

enum class Colors01 {
    LIGHTGREY, BLUE, PURPLE,
    GREEN, ORANGE, RED
}

enum class Colors02(val value: Int) {
    LIGHTGREY(0XD3D3D3), BLUE(0X33B5E5), PURPLE(0XAA66CC),
    GREEN(0X99CC00), ORANGE(0XFFBB33), RED(0XFF4444)
}

enum class Colors03(val value: Int) {
    LIGHTGREY(0XD3D3D3), BLUE(0X33B5E5), PURPLE(0XAA66CC),
    GREEN(0X99CC00), ORANGE(0XFFBB33), RED(0XFF4444)
}

fun parseColor(value: Int): Colors03? {
    var result: Colors03? = null

    for (c in Colors03.values()) {
        if (value == c.value) {
            result = c
            break
        }
    }

    return result
}

class Item07(val id: Long, var title: String, var content: String,
             var color: Colors02 = Colors02.LIGHTGREY) {

    fun getDetails() = "Item07(id=$id, title=$title, content=$content), color=${color}"
}

fun main(args: Array<String>) {
    val item07 = Item07(7, "Hello", "Hello Kotlin!")
    println(item07.getDetails())
    // 顯示： Item07(id=7, title=Hello, content=Hello Kotlin!), color=LIGHTGREY

    item07.color = Colors02.RED
    println(item07.getDetails())
    // 顯示： Item07(id=7, title=Hello, content=Hello Kotlin!), color=RED

    val ac: Array<Colors02> = Colors02.values()

    for (c in ac) {
        println("${c.ordinal}: ${c.name}, ${c.value}, ${c.value.toString(16)}")
    }

    // 顯示：
    // 0: LIGHTGREY, 13882323, d3d3d3
    // 1: BLUE, 3388901, 33b5e5
    // 2: PURPLE, 11167436, aa66cc
    // 3: GREEN, 10079232, 99cc00
    // 4: ORANGE, 16759603, ffbb33
    // 5: RED, 16729156, ff4444

    val red: Colors02 = Colors02.valueOf("RED")
    val green: Colors02 = Colors02.valueOf("GREEN")
    val blue: Colors02 = Colors02.valueOf("BLUE")

    println("${red.ordinal}: ${red.name}, ${red.value}, ${red.value.toString(16)}")
    // 顯示： 5: RED, 16729156, ff4444
    println("${green.ordinal}: ${green.name}, ${green.value}, ${green.value.toString(16)}")
    // 顯示： 3: GREEN, 10079232, 99cc00
    println("${blue.ordinal}: ${blue.name}, ${blue.value}, ${blue.value.toString(16)}")
    // 顯示： 1: BLUE, 3388901, 33b5e5

}