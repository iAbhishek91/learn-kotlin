// By default classes in Kotlin are final
// and cant be inherited

// open key word is used to allow the class to inherit
open class first {
    protected open fun getName() {
        println("I am in first")
    }
}


open class second : first() {
    override fun getName() {
        super.getName()
        println("I am in second")
    }
}


class third : second() {
    public override fun getName() {
        super.getName()
        println("I am in third")
    }
}

fun main() {
    var obj = third()
    obj.getName()
}