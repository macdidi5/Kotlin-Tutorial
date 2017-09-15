package net.macdidi5.kotlin.tutorial.ch11

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

// 使用constructor宣告主要建構式
data class Place02 (var id: Long = 0, var latitude: Double = 0.0,
                    var longitude: Double = 0.0, var accuracy: Double = 0.0,
                    var datetime: String = "", var note: String = "") {

    // 傳回物件資訊的字串
    fun getDetails(): String {
        return "Place02(id=$id, latitude=$latitude, longitude=$longitude, accuracy=$accuracy, datetime='$datetime', note='$note')"
    }

    // 設定日期時間
    fun setDatetime(value: Long) {
        val dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        val dt = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(value), ZoneId.systemDefault())
        datetime = dtf.format( dt )
    }

    // 設定日期時間
    fun setDatetime() {
        val dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        datetime = dtf.format( LocalDateTime.now() )
    }

    companion object {
        fun isValidDatetime(value: String): Boolean {
            var valid = true

            try {
                val dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
                LocalDateTime.parse(value, dtf)
            }
            catch(e: DateTimeParseException) {
                valid = false
            }

            return valid
        }
    }

}

fun main(args: Array<String>) {

    val p01 = Place02(1, 25.04719, 121.516981, 10.0, "2011-12-31 08:30", "Hello!")
    println(p01.getDetails())
    println()

    val p02 = Place02(2, 24.143033, 121.271982, 25.0)
    println(p02.getDetails())

    var dt = "Hello"

    if (Place02.isValidDatetime(dt)) {
        p02.datetime = dt
    }

    println(p02.getDetails())

    dt = "2012-01-01 06:12"

    if (Place02.isValidDatetime(dt)) {
        p02.datetime = dt
    }

    println(p02.getDetails())
    println()

    val p03 = Place02()
    println(p03.getDetails())

    p03.id = 3
    p03.latitude = 25.200854
    p03.longitude = 121.646714
    p03.accuracy = 55.0
//    p03.setDatetime( System.currentTimeMillis() )
    p03.setDatetime()
    p03.note = "Awesome!"
    println(p03.getDetails())
    println()

    val p11 = Place02(11, 25.04719, 121.516981, 10.0, "2011-12-31 08:30", "Hello!")
    val p12 = Place02(11, 25.04719, 121.516981, 10.0, "2011-12-31 08:30", "Hello!")

    println(p11)
    println(p12)

    println( p11.equals(p12) )
    println( p11 == p12 )

    println( p11.hashCode() )
    println( p12.hashCode() )

}