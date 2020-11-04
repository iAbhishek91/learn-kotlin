fun main() {
    val iLike = arrayOf("hammer", "chopper", "Linux")
    // operations are listed on

    // print out the size
    println(iLike.size)

    // print the first element
    println(iLike[0])
    println(iLike.get(0))



    // LOOP THROUGH ARRAY
    // traditional style
    for (x in iLike) {
        println(x)
    }

    // functional programming style
    // this is known as lambda syntax.
    iLike.forEach { x ->
        println(x)
    }

    iLike.forEachIndexed{i, x ->
        println("$i. $x")
    }
}