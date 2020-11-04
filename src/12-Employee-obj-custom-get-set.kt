fun main() {

    // GETTER & SETTER are invoked
    var me = Employee()
    me.classMethod()

    me.role = "Quality engineer"
    me.role = "Developer"
    me.role = "DevOps engineer"
    println(me.role)

    // CLASS METHOD are invoked
    me.classMethod()
}