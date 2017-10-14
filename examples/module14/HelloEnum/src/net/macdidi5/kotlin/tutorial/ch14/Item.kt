package net.macdidi5.kotlin.tutorial.ch14

// 為記事類別加入顏色屬性，預設值為Colors02.LIGHTGREY
class Item(val id: Long, var title: String, var content: String,
             var color: Colors02 = Colors02.LIGHTGREY) {

    fun getDetails() =
            "Item(id=$id, title=$title, content=$content), color=${color}"
}

fun main(args: Array<String>) {
    val item01 = Item(1, "Hello", "World", Colors02.RED)
    println(item01.getDetails())
    // 顯示： Item(id=1, title=Hello, content=World), color=RED

    val item02 = Item(2, "Hi", "Kotlin", Colors02.BLUE)
    println("id: ${item02.id}, color.value: ${item02.color.value}")
    // 顯示： id: 2, color.value: 3388901

    val item03 = Item(3, "Greeting", "Good morning")
    println("id: ${item03.id}, color: ${item03.color}, color.value: ${item03.color.value}")
    // 顯示： iid: 3, color: LIGHTGREY, color.value: 13882323
}