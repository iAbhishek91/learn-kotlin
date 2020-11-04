interface Ifirst0
interface Isecond0

class Test : Ifirst0,Isecond0


fun checkTypes(data:String) = if(data is String) "str" else "non str"
fun checkTypes(data:Int) = if(data !is Int) "not int" else "int"
fun checkTypes(data:Test) = if(data is Ifirst0 && data is Isecond0) "Ifirst0 & Isecond0" else "not Ifirst0 & Isecond0"


fun main() {
    // CHECK BASIC DATATYPE ===>
    println(checkTypes("abhi"))
    println(checkTypes(90))

    // CHECK COMPLEX TYPE ===>
    var obj = Test()
    println(checkTypes(obj))
}