fun spreadExample(vararg array:String) {
    array.forEach { x ->
        println(x)
    }
}

fun main() {
    // PASS STATIC VALUES
    spreadExample("a", "b", "c")



    // PASS ARRAY
    var arr = arrayOf("ab","bc", "cd")
    spreadExample(*arr)

}