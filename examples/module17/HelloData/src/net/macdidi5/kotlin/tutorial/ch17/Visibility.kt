/* net.macdidi5.kotlin.tutorial.ch17.Visibility.kt */

package net.macdidi5.kotlin.tutorial.ch17

// 沒有使用private或internal，預設為public
fun defaultPublicFunction() = "Default public"

public fun explicitPublicFunction() = "Explicit public"

internal fun internalFunction() = "Internal"

private fun privateFunction() = "Private"

// 建構式沒有使用private或internal，預設為public
open class Visibility(_value : Int) {

    // 沒有使用private、protected或internal，預設為public
    val defaultPublicProperty = _value
    public val explicitPublicProperty = _value
    internal val internalProperty = _value
    protected val protectedProperty = _value
    private val privateProperty = _value

    fun privateDemo() {
        println("${privateFunction()}, $privateProperty")
    }

}

