import sun.font.TrueTypeFont
import javax.annotation.processing.Completion

fun main(args: Array<String>) {
    val sumA = {x: Int, y: Int -> x + y}
    val sumB : (Int, Int) -> Int = {x,y -> x+y}
    println(sumA(1,3) + sumB(1,3))

    fun downloadData(url: String, completion: () -> Unit) {
        completion()
    }

    downloadData("fakeUrl") {
        println("Show after completion.")
    }

    fun downloadCar(url: String, completion: (car) -> Unit) {
        val tesla = car("Tesla","ModelX","red")
        completion(tesla)
    }

    downloadCar("fakeUrl") { tesla ->
        println("Show after completion. ${tesla.color} ${tesla.maker}")
        tesla.accerlate()
    }

    fun downloadCar2(url: String, completion: (truck?, Boolean) -> Unit) {
        val webRequestSuccess = true
        if (webRequestSuccess) {
            val truck = truck("Toyota", "Tow Car", "White")
            completion(truck, true)
        } else {
            completion(null, false)
        }
        downloadCar("fakeUrl") { tesla ->
            println("Show after completion. ${tesla.color} ${tesla.maker}")
            tesla.accerlate()
        }    }

    downloadCar2("fakeURL") {truck, success ->
        if(success) {
            truck?.tow()
        } else {
            println("Something went wrong.")
        }
    }
}