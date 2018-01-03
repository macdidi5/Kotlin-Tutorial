/* net.macdidi5.kotlin.tutorial.ch17.Item02.kt */

package net.macdidi5.kotlin.tutorial.ch17

// 宣告資料類別
data class Item02(val id: Long,
                  var title: String = "",
                  var content: String = "") {

    // 覆寫toString函式
    override fun toString(): String =
        "$id\t$title\t$content"

    // 宣告其它函式
    var details : String = toString()
        // 禁止使用setter
        private set
        // 宣告getter
        get() {
            return "Item02: ${toString()}"
        }

}