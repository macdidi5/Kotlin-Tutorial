/* net.macdidi5.kotlin.tutorial.ch11.Place.kt */

package net.macdidi5.kotlin.tutorial.ch11

import java.time.Instant
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


// 使用constructor宣告主要建構式
class Place constructor (val id: Long, var latitude: Double,
                         var longitude: Double, var accuracy: Double,
                         var datetime: String, var note: String) {

    // 宣告沒有參數的次要建構式
    // 使用this呼叫主要建構式
    constructor(): this(0, 0.0, 0.0, 0.0, "", "")

    // 宣告設定日期時間的函式
    fun setDatetime(now: Long) {
        val dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        datetime = dtf.format( LocalDateTime.ofInstant(
                Instant.ofEpochMilli(now), TimeZone.getDefault().toZoneId()) )
    }

    // 覆寫函式
    override fun toString(): String {
        return "Place(id=$id, latitude=$latitude, longitude=$longitude, accuracy=$accuracy, datetime='$datetime', note='$note')"
    }

}

fun main(args: Array<String>) {
    val p01 = Place(1, 25.04719, 121.516981, 10.0, "2011-12-31 08:30", "Hello!")
    val p02 = Place(2, 24.143033, 121.271982, 25.0, "2012-01-01 06:12", "Hi!")
//    val p03 = Place(3, 25.200854, 121.646714, 55.0, "2012-02-12 16:50", "Awesome!")

    println(p01)
    println(p02)

//    println(p03)

    val p03 = Place()
    println(p03)

//    p03.id = 11
    p03.latitude = 25.200854
    p03.longitude = 121.646714
    p03.accuracy = 55.0
    p03.setDatetime( System.currentTimeMillis() )
    p03.note = "Awesome!"

    println(p03)

}