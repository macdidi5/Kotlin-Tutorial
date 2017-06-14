fun main(args: Array<String>) {
    // 顯示字串
    println("String message")

    // 顯示計算結果
    println(35 * 60)

    // 使用＋號連接字串與計算結果
    println("I am " + (35 * 12) + " months old.")

    // 上面的工作建議使用下面這種「string template」的作法
    // 在字串裡面使用「${數字、計算或其它資料}」
    // Kotlin依照「${」和「}」之間的內容，執行計算與替換
    println("I am ${35 * 12} months old.")
}
