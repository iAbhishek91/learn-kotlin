class Employee(val fname:String = "Abhishek", val lname:String = "Das") {
    var role:String? = null

    // trigger a function when a role is set
    // setter is used
        set(value) {
            // filed is keyword, and cant be anything
            field = value
            println("SETTER: the new role is $field")
        }
        get() {
            // default getter is already set
            println("GETTER: you are fetching the value of role...")
            return field
        }

    fun classMethod() {
        val roleToPrint = role ?: "--"
        println("PRINTING INFO: fname: $fname, lname: $lname, role $roleToPrint")
    }
}