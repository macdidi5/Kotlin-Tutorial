/* net.macdidi5.kotlin.tutorial.ch18.GenericFunction01.kt */

package net.macdidi5.kotlin.tutorial.ch18

// 接收兩個字串陣列參數，結合兩個陣列以後傳回新的字串陣列
fun combineArray(a1 : Array<String>, a2 : Array<String>) : Array<String?> {
    val newSize = a1.size + a2.size
    val result = a1.copyOf(newSize)

    for ( (i, v) in a2.withIndex() ) {
        result[ i + a1.size ] = v
    }

    return result
}

// 接收兩個Item陣列參數，結合兩個陣列以後傳回新的Item陣列
fun combineArray(a1 : Array<Item>, a2 : Array<Item>) : Array<Item?> {
    val newSize = a1.size + a2.size
    val result = a1.copyOf(newSize)

    for ( (i, v) in a2.withIndex() ) {
        result[ i + a1.size ] = v
    }

    return result
}

// 接收兩個泛型陣列，結合兩個陣列以後傳回新的泛型陣列
fun <T> combineArrayGeneric(a1 : Array<T>, a2 : Array<T>) : Array<T?> {
    val newSize = a1.size + a2.size
    val result = a1.copyOf(newSize)

    for ( (i, v) in a2.withIndex() ) {
        result[ i + a1.size ] = v
    }

    return result
}

fun main(args: Array<String>) {

    // 建立兩個字串陣列
    val names01 = arrayOf("Simon", "Mary")
    val names02 = arrayOf("Sam", "John")

    // 結合兩個字串陣列
    val namesAll = combineArray(names01, names02)

    for ( (i, v) in namesAll.withIndex()) {
        println("$i: $v")
    }

    println()

    val item01 = Item(101, "Hello", "Kotlin")
    val item02 = Item(102, "Hi", "Android!")
    val item03 = Item(103, "Chao", "Java")

    // 建立兩個Item陣列
    val items01 = arrayOf(item01, item02)
    val items02 = arrayOf(item03)

    // 結合兩個Item陣列
    val itemsAll = combineArray(items01, items02)

    for ( (i, v) in itemsAll.withIndex()) {
        println("$i: ${v?.details}")
    }

    println()

    // 呼叫泛型版本的函式，由傳遞的參數決定泛型為String
    val names = combineArrayGeneric(names01, names02)

    for ( (i, v) in names.withIndex()) {
        println("$i: $v")
    }

    println()

    // 呼叫泛型版本的函式，由傳遞的參數決定泛型為Item
    val items = combineArrayGeneric(items01, items02)

    for ( (i, v) in items.withIndex()) {
        println("$i: ${v?.details}")
    }

}