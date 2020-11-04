// to implement multiple inheritance we need to use interfaces
private interface Ifirst {
    fun add(num1:Int, num2:Int): Int
}


private interface Isecond {
    fun add(str1:String, str2:String): String
}


// MULTIPLE INHERITANCE WITH OVERRIDING "add" FUNCTION
class MultiInheritance : Ifirst,Isecond {
    override fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun add(str1: String, str2: String): String {
        return "$str1$str2"
    }
}


fun main() {
    var obj = MultiInheritance()
    println(obj.add(1,2))
    println(obj.add("abhi","sona"))
}