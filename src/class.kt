open class vehical (open val maker:String, open val model: String) {
    fun accerlate() {
        println("accerlate")
    }
    fun brake() {
        println("STOP")
    }
    open fun park() {
        println("parking the vehical")
    }
}

class car(override val maker:String, override val model: String, val color: String): vehical(maker, model) {
    override fun park() {
        println("Tesla is parking.")
    }
}

class truck(override val maker:String, override val model: String, val color: String): vehical(maker, model) {
    fun tow() {
        println("tow something")
    }
}

fun main(args: Array<String>) {
/*    class car constructor(val maker: String, val model: String) {
        fun details() {
            println("$maker + $model")
        }
    }*/

    var tesla = car("Tesla","ModelX","red")
    tesla.accerlate()
    tesla.brake()
    tesla.park()


}