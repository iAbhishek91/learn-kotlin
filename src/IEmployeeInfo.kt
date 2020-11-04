// in kotlin we can implement function in interfaces as well
interface IEmployeeInfo {

    // value initialization are not allowed in interface
    // val someVar:String = "something"

    // however below is allowed
    val providerInfo:String


    // encapsulated function def in interface itself
    fun printEmp(emp: Employee) {
        println(providerInfo)
        emp.classMethod()
    }
}

// IMPLEMENT INTERFACE
class BasicInfoProvider : IEmployeeInfo {
    override val providerInfo:String
        get() = "Some Value"


    override fun printEmp(emp: Employee) {
        // optionally you can bring down the previous implementation
        super.printEmp(emp)
        println("adding some more line..")
    }
}

fun main() {
    var abhi = BasicInfoProvider()
    abhi.printEmp(Employee())
}