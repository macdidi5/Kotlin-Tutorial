package net.macdidi5.kotlin.tutorial.ch04

fun main(args: Array<String>) {
    // 從Byte到Double共六個不同數值型態的變數
    var vByte: Byte = 1
    var vShort: Short =  2
    var vInt: Int = 3
    var vLong: Long = 4L
    var vFloat: Float = 5.1F
    var vDouble: Double = 6.2

    var r: Int = vByte + vShort + vInt  // 計算結果為Int

//    var r2: Int = vByte + vLong         // 錯誤！計算結果為Long

    var r3: Long = vByte + vLong        // 計算結果為Long
    var r4 = vByte + vLong              // 變數r4的型態為Long

//    var r5: Float = vInt + vDouble      // 錯誤！計算結果為Double

    var r6: Double = vInt + vDouble     // 計算結果為Double
    var r7 = vInt + vDouble             // 變數r7的型態為Double
    var r8 = vFloat + vDouble           // 變數r8的型態為Double
}