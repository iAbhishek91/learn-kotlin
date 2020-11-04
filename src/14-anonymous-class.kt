open class Test0 {
    open fun name() {
        println("Abhishek")
    }
}


fun main () {
    // OBJECT EXPRESSION
    // create a class from another class
    val newObj = object : Test0() {
        override fun name(){
            super.name()
            println("some thing extra")
        }

        fun newMethod() {
            println("this method is not inherited")
        }
    }

    newObj.newMethod()
    newObj.name()
}