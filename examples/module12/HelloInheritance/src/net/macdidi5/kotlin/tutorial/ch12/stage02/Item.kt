/* net.macdidi5.kotlin.tutorial.ch12.stage02.Item.kt */

package net.macdidi5.kotlin.tutorial.ch12.stage02

// 在宣告項目類別的時候，使用open關鍵字讓它可以被繼承
open class Item (val id: Long,
                 var title: String,
                 var content: String)