import java.util.*

fun main() {
    namecheck()
    country()
    mynumbers()
    names("Mary","Ann","Winny")

}
fun namecheck(){
    var name= arrayOf("Serah","Lynn","Ann","Mercy")
    println(name.contentToString())

}
fun country() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var gramaticalycorrecting = println(cities.map { it.capitalize() })
}
fun mynumbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sumElement = numbers[1] + numbers[4]
    println(sumElement)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun names(name1:String,name2: String,name3: String):Array<String>{
    return arrayOf(name1,name2,name3)

}




