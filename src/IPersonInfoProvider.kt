// same file can be used for interface and classes

// this is valid interface in kotlin
// interface IPersonInfoProvider

interface IPersonInfoProvider {
    fun printEmp(emp: Employee)
}


// ABSTRACT CLASS
// a class which do not implement all the function of a interface
// features:
// cannot create of an abstract class
abstract class BasicInfoProvider0 : IPersonInfoProvider



// IMPLEMENT INTERFACE
class BasicInfoProvider1 : IPersonInfoProvider {
    // override is required keyword
    override fun printEmp(emp: Employee) {
        println("implemented")
        emp.classMethod()
    }
}
fun main() {
    var abhi = BasicInfoProvider()
    abhi.printEmp(Employee())
}