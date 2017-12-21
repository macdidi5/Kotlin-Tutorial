/* net.macdidi5.kotlin.tutorial.ch15.Greeting03.kt */

package net.macdidi5.kotlin.tutorial.ch15

// 使用interface宣告介面，指定Greeting01為父介面（super interface）
interface Greeting03 : Greeting01 {
    // 宣告沒有實作的抽象函式
    fun getGreeting() : String
}