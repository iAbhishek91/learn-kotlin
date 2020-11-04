fun main() {
    var iLike = mapOf<Int, String>(
        1 to "Hammar",
        2 to "Mango",
        3 to "Mystic"
    )


    iLike.forEach{k, v ->
        println("$k: $v")
    }


    // Also have mutable Map
    var iLikeMutable = mutableMapOf("name" to "abhishek")
    iLikeMutable.put("age", "29")
    println(iLikeMutable.get("age"))
}