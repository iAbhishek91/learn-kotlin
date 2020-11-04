var str = "12"
var num = str.toInt()

fun main() {
    println(if (num is Int) "int" else "not int" )
}

// "as is used for casting"