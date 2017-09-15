package net.macdidi5.kotlin.tutorial.ch11

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

// 使用constructor宣告主要建構式
class Place01 constructor(_id: Long = 0, _latitude: Double = 0.0,
                          _longitude: Double = 0.0, _accuracy: Double = 0.0,
                          _datetime: String = "", _note: String = "") {

    // 宣告類別的屬性，並設定為主要建構式的參數
    var id = _id
    var latitude = _latitude
    var longitude = _longitude
    var accuracy = _accuracy

    var datetime = _datetime
        set(value) {
            var valid = true
            val dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")

            try {
                LocalDateTime.parse(value, dtf)
            }
            catch(e: DateTimeParseException) {
                valid = false
            }

            if (valid) field = value
        }

    var note = _note

    // 傳回物件資訊的字串
    fun getDetails(): String {
        return "Place01(id=$id, latitude=$latitude, longitude=$longitude, accuracy=$accuracy, datetime='$datetime', note='$note')"
    }

    // 設定日期時間
    fun setDatetime(now: Long) {
        val dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        datetime = dtf.format( LocalDateTime.now() )
    }

}

fun main(args: Array<String>) {

    val p01 = Place01(1, 25.04719, 121.516981, 10.0, "2011-12-31 08:30", "Hello!")
    println(p01.getDetails())
    println()

    val p02 = Place01(2, 24.143033, 121.271982, 25.0)
    println(p02.getDetails())

    p02.datetime = "Hello"
    println(p02.getDetails())
    p02.datetime = "2012-01-01 06:12"
    println(p02.getDetails())
    println()

    val p03 = Place01()
    println(p03.getDetails())

    p03.id = 11
    p03.latitude = 25.200854
    p03.longitude = 121.646714
    p03.accuracy = 55.0
    p03.setDatetime( System.currentTimeMillis() )
    p03.note = "Awesome!"
    println(p03.getDetails())

}