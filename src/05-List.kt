fun main() {
    var iLike = listOf<String>("Mango", "Cashew", "Neem")

    println(iLike[0])
    println(iLike.get(2))


    // LOOP THROUGH LIST ===>
    iLike.forEach{ x ->
        println(x)
    }
    iLike.forEachIndexed{ i,x ->
        println("$i: $x")
    }



    // ADD VALUES TO LIST ====>

    // Below will throw err as List are immutable by default
    // iLike.add("")

    // Define a mutable list
    var iLikeModified = mutableListOf<String>(
        "a","b","c"
    )
    iLikeModified.add(3, "d")
    println(iLikeModified[3])
}