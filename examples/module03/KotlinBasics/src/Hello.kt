/* Hello.kt */

// 雖然這個程式檔放在應用程式專案的根目錄
// 不過它使用package加入套件的宣告
// 在程式碼裡面宣告的內容，也是屬於net.macdidi5.root套件
package net.macdidi5.root

// 一個加總整數的函式
fun summary(vararg nums: Int): Int {
    var total: Int = 0

    for (n in nums) {
        total += n
    }

    return total
}