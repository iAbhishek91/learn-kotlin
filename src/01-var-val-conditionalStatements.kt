// TOP LEVEL VARIABLES
var topLevelVar : Int = 10
val topLevelVal : Float = 3.14F


fun main () {
    // LOCAL VARIABLE =====>
    // "val" VARIABLE CAN'T B REASSIGNED
    val myvalvar: String = "abhishek"
    // myvalvar = "skjl" // this is not allowed
    println("val varaible do not change: ${myvalvar}")

    // "var" VARIABLE CAN B REASSIGNED
    var myvarvar: Boolean = false
    myvarvar = true
    println("val varaible do not change: ${myvarvar}")



    // TOP LEVEL VARIABLES, accessing ====>
    println("top level variables ${topLevelVar}")
    println("top level value(constants) ${topLevelVal}")



    // NULLABLE and NON-NULLABLE VARIABLES ======>
    // NOTE: unlike java, types in kotlin are not-null by default
    // i.e, there is a diff between string and nullable string

    // the below statement will throw error, "null cannot be value of a nullable string"
    // var notNullableString : String = null

    // the question mark, after the datatype makes it nullable.
    var nullableString: String? = null

    // NOTE: shorthand is not allowed with nullable variables
    // var varName = null



    // VARIABLE SHORTHAND  ========>
    // Kotlin automatically understands datatype.

    // var name : String = "something"
    // OR
    // var name = "something"
    // are same.



    // CONDITIONS & LOOPS ARE ALMOST SAME AS JAVA ====>
    // if, if else and if else ladder are exactly same



    // WHEN =====>
    val condition = "ab"
    when(condition) {
        "ab" ->
            println("condition in when statements if ab")
        "cd" ->
            println("condition in when statements if cd")
        else ->
            println("in default/else block as per kotlin")
    }



    // CONDITIONAL STATEMENTS ====>
    // elvis operator
    val nullValue:String? = null
    println(nullValue ?: "no")
    // if expression
    val condIfStatement = "OK"
    val isItCondIfStatement = if(condIfStatement == "OK") true else false
    println("Is this IF conditional statement: ${isItCondIfStatement}")

    // when expression
    val condWhenStatement = "OK"
    val isItCondWhenStatement = when (condWhenStatement) {
        "OK" -> true
        else -> false
    }
    println("Is this WHEN conditional statement: ${isItCondWhenStatement}")
}