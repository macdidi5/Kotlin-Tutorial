/* net.macdidi5.kotlin.tutorial.ch12.stage02.ImageItem.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage02

// 在宣告主要建構式的時候
//   從父類別繼承的id、title與content屬性
//   不使用val或var宣告，所以它們只是參數
//   另外使用var宣告ImageItem需要的imageFile屬性
// 在類別宣告的最後面
//   使用Item(id, title, content)呼叫父類別Item的主要建構式
//   設定編號、標題與內容
class ImageItem(id: Long,
                title: String,
                content: String,
                var imageFile: String): Item(id, title, content)