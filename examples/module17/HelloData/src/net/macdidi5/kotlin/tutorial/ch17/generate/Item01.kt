/* net.macdidi5.kotlin.tutorial.ch17.generate.Item01.kt */

package net.macdidi5.kotlin.tutorial.ch17.generate

class Item01(val id: Long,
             var title: String,
             var content: String) {

    // 判斷物件是否一樣
    override fun equals(other: Any?): Boolean {
        // 如果物件參考值一樣
        if (this == other) return true
        // 如果參數不是ItemData
        if (other !is Item01) return false

        // 判斷編號、標題與內容
        if (id != other.id) return false
        if (title != other.title) return false
        if (content != other.content) return false

        return true
    }

    // 傳回物件hash code
    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + content.hashCode()
        return result
    }

    // 轉換為字串
    override fun toString(): String {
        return "net.macdidi5.kotlin.tutorial.ch17.generate.Item01(id=$id, title='$title', content='$content')"
    }


    // 依照屬性宣告的順序傳回屬性值
    operator fun component1() = id
    operator fun component2() = title
    operator fun component3() = content

    // 複製並傳回一個新的物件
    fun copy(id : Long = this.id,
             title : String = this.title,
             content : String = this.content)
        = Item01(id, title, content)

}

fun main(args: Array<String>) {
    val item = Item01(101, "Hello", "Kotlin")
    // 呼叫toString函式
    println(item)
    // 顯示： Item01(id=101, title='Hello', content='Kotlin')

    // 解構函式
    val (id, title, content) = item
    println("$id, $title, $content")
    // 顯示： 101, Hello, Kotlin

    // 複製一個新的物件
    val item02 = item.copy()
    println(item02)
    // 顯示： Item01(id=101, title='Hello', content='Kotlin')

    // 指定部份的屬性複製一個新的物件
    val item03 = item.copy(content = "Java")
    println(item03)
    // 顯示： Item01(id=101, title='Hello', content='Java')

}