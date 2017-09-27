/* net.macdidi5.kotlin.tutorial.ch12.stage01.ImageItem.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage01

// 宣告封裝可以儲存照片項目的類別
//   包含編號、標題、內容與照片檔名四個屬性
class ImageItem(val id: Long,
                var title: String,
                var content: String,
                var imageFile: String)