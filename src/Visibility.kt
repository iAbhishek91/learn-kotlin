// Class, Methods & properties are public by default
// public,
// internal (within the module),
// private  (within the file)
// protected (within inheritance)
internal class Visibility {
    private var name:Int? = null
    fun setName (_name:Int) {
        name = _name
    }

    fun print () {
        println(name)
    }
}