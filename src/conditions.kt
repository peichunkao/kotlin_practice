fun main(args: Array<String>) {
    val a = 5

    when(a) {
        1 -> println("hi")
        2 -> println("hi there")
        else -> println("no one was there")
    }

    fun chocoIsFeeling(mood: String = "happy") {
        println("choco is $mood")
    }

    chocoIsFeeling("hungary")

}