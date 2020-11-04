fun main () {
    // "new" keyword is not required
    val abhi = Person("Doctor","D");
    abhi.nickName = "abhi"
    // "getter" nd "setter" are not required
    println("${abhi.firstName} ${abhi.lastName}")
    println("${abhi.nickName}")
}