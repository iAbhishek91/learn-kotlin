class Car(val name: String , val color: String){
    init {
        println("first init block")
    }
    init {
        println("second init block")
    }
    // secondary constructor is not required most of the time as we can pay around with default & named parameters
    constructor(): this("audi","red"){
        println("Secondary constructor")
    }
    init {
        println("third init block")
    }
}
