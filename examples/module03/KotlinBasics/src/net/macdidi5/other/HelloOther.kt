/* net.macdidi5.other.HelloOther.kt */

// 套件的宣告與程式碼檔案目錄都一樣
// 這是比較建議的作法
package net.macdidi5.other

// 一個計算平均的函式
fun average(vararg nums: Int): Int {
    var total: Int = 0

    for (n in nums) {
        total += n
    }

    return total / nums.size
}
