fun main(args: Array<String>) {
    val bigFour = listOf<String>("Federer","Nadal","Djokovich","Murry")
    val bigThree = arrayListOf<String>("Federer","Nadal","Djokovich","Murry")

    println(bigFour.indexOf("Federer"))
    bigThree.add(0,"Cilic")
    println(bigFour)
    println(bigThree)

    val rebelVehicalMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehicalMap["Solo"])

    val rebelVehical = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    rebelVehical.put("Leiah", "Tantive IV")
    rebelVehical["Luke"] = "XWing"
    println(rebelVehical)
    //rebelVehical.remove("Luke")
    //println(rebelVehical.clear())
    println(rebelVehical.isEmpty())
    println(rebelVehical.getOrDefault("Han Slolo", "Doesn't exist"))

    for (rebel in rebelVehical) {
        println("Name: $rebel")

    }
    println()
    for ((rebel,vehicle) in rebelVehical) {
        println("Name: $rebel + $vehicle")
    }

}