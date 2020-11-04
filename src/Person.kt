// we can remove the Curly braces as well
// class Person


// DEFAULT CONSTRUCTOR ===>
// Default parameter are automatically attached in kotlin.
// the below is same as.
// class Person constructor() OR
// class Person () OR
// class Person


// PARAMETERIZED CONSTRUCTOR & INIT block===>
// values are automatically attached.
// the below examples are same
/* class Person constructor(_firstName:String, _lastName:String) {
    val firstName:String
    val lastName:String

    // always called when a class is invoked.
    // there can be multiple init block
    init {
        firstName = _firstName
        lastName = _lastName
    }
} */
/* class Person constructor (_firstName:String, _lastName:String) {
    val firstName = _firstName
    val lastName = _lastName
}
* */
// class Person constructor(val firstName:String, val lastName:String)
class Person constructor(val firstName:String, val lastName:String) {
    var nickName: String? = null
}