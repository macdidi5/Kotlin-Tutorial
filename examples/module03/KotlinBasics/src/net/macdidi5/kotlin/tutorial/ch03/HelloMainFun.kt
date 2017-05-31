/* net.macdidi5.kotlin.tutorial.ch03.HelloMainFun.kt */

// 套件宣告，把這個程式寫的內容放在這個套件
// 雖然原始程式碼不用放在與套件對應的目錄
// 不過建議你還是這麼作，專案裡面的程式碼會比較容易管理
package net.macdidi5.kotlin.tutorial.ch03

// Kotlin程式的進入點，只有「args」可以改變其它自己取的名稱，其它都是固定的
// IntelliJ IDEA偵測到Kotlin程式的進入點，會在左側顯示Kotlin圖示
// main函式的範為從「{」開始，到「}」結束，通常稱為區塊（block）
// 把需要執行的敘述寫在main函式區塊裡面
fun main(args: Array<String>) {
    // 使用Kotlin的println函式顯示左右括號裡面的內容到終端機
    // 現在左右括號裡面是使用雙引號（"）包圍的字串（String）
    // 一個敘述的最後面不需要使用分號（;）
    println("main function")

    // println的左右括號裡面沒有東西，執行後只會換行
    println()

    // 如果在同一行寫多個敘述，就要使用分號隔開
    println(1); println(2); println(3)

    // println是顯示並換行，print是只有顯示不換行
    // 如果顯示的訊息是一般的數學運算，就不要使用雙引號
    print("1+1");print(2+2);print(3+3)

}
