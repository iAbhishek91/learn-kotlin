// USER DEFINED FUNCTIONS ====>
// Note: the below function CANT return null
fun functionName(param1:Int, param2:Int): Int {
 return param1 + param2
}

// Note: can return null
fun  nullableReturn(): String? {
    return null
}

// "Unit": means this function do not return nothing useful
// Note: "Unit" are omitted
fun sayHello() : Unit {
    println("Hello.....")
}

// Function expression
fun sayHelloInShort() = println("Hello, I'm smart")


fun main() {
    println(functionName(2, 4))
    println(nullableReturn())
    sayHello()
    sayHelloInShort()
}