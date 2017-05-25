/* HelloImport.kt */
import net.macdidi5.kotlin.demo.function.getGreeting
import net.macdidi5.kotlin.demo.function.getGreeting2
import net.macdidi5.kotlin.demo.function.sayGreeting

// 如果使用下面的敘述，就可以省略上面的三個import敘述
/* import net.macdidi5.kotlin.demo.function.* */

fun main(args: Array<String>) {

    // 使用import敘述後就可以直接呼叫
    println( getGreeting("Hello", "Simon") )
    println( getGreeting2("Hello", "Simon") )
    sayGreeting("Hello", "Simon")

    // 沒有使用import敘述就必須使用包含套件的全名
    net.macdidi5.kotlin.demo.function.sayGreeting2("Hello", "Simon")

}