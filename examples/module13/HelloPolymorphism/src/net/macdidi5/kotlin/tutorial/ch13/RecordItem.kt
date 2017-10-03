/* net.macdidi5.kotlin.tutorial.ch13.RecordItem.kt */

package net.macdidi5.kotlin.tutorial.ch13

// 錄音記事資料類別
class RecordItem(id: Long,
                title: String,
                content: String,
                var recordFile: String): Item(id, title, content){

    // 使用super關鍵字呼叫父類別的函式
    override fun getDetails() = "${super.getDetails()}, recordFile=$recordFile"
}