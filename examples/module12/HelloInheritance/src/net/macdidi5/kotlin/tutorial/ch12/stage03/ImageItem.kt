/* net.macdidi5.kotlin.tutorial.ch12.stage03.ImageItem.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage03

class ImageItem(id: Long,
                title: String,
                content: String,
                var imageFile: String): Item(id, title, content){

    // 不用覆寫繼承自父類別的getReduceContent函式

    // 加入override關鍵字覆寫父類別的函式
    //   顯示繼承自父類別的id、title與content
    //   還有自己宣告的imageFile
    override fun getDetails() = "id=$id, title=$title, " +
            "content=$content, imageFile=$imageFile"
}