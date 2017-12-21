/* net.macdidi5.kotlin.tutorial.ch15.OnKeyDemo01.kt */

package net.macdidi5.kotlin.tutorial.ch15

// 宣告實作View.OnKeyListener介面的類別
class OnKeyListenerImpl : View.OnKeyListener {
    override fun onKey(view: View,
                       keyCode: Int,
                       event: KeyEvent): Boolean {
        println("$view : $keyCode : ${event.action}")
        return true
    }
}

fun main(args: Array<String>) {

    // 建立View物件
    val view01  = View()
    // 設定按鍵監聽物件
    view01.setOnKeyListener(OnKeyListenerImpl())
    // 按下按鍵
    view01.keyDown()

    val view02 = View()

    // 使用lambda實作View.OnKeyListener介面
    view02.setOnKeyListener({
        view, keyCode, event ->
        println("$view : $keyCode : ${event?.action}")
        true
    })

    // 放開按鍵
    view02.keyUp()

    val view03 = View()

    // 使用lambda實作View.OnKeyListener介面
    view03.setOnKeyListener({
        // 不需要使用的參數使用底線（_）代替
        _, _, event ->
        println("Action: ${event.action}")
        true
    })

    // 放開按鍵
    view03.keyUp()

}