/*
Refer: https://kotlinlang.org/docs/reference/data-classes.html
There are always requirement to create class just to hold data.
In Kotlin, hence there are a separate type of class known as `data class`.

Mandatory requirements of data classes:
- primary classes should have at least one parameter
- all parameter should be marked as val or var
- cant be open, sealed, inner or abstract
- only primary constructor parameters are considered as for auto generated function

All the members in the primary constructor are automatically provided with following members:

- equals() / hashCode() - compare a object with other obj
- toString() -- example below
- copy() - copy to other object
- componentN()
 */
data class MyData (
        var a: String,
        var b: Int,
        var c:Boolean = false
)

fun main() {
    val myData = MyData("a String", 10, true)

    println(myData.toString())
}