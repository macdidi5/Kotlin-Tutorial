/* net.macdidi5.kotlin.tutorial.ch12.stage04.ImageItem.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage04

class ImageItem(id: Long,
                title: String,
                content: String,
                var imageFile: String): Item(id, title, content){

    // 使用super關鍵字呼叫父類別的函式
    override fun getDetails() = "${super.getDetails()}, imageFile=$imageFile"
}