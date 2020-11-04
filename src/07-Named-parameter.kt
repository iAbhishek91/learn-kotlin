fun sayHello (greeting:String, name:String) {
    println("$greeting, $name")
}


fun main() {
    // Note if you name one argument, you need to name everything
    sayHello(name = "hi", greeting = "abhishek")
}