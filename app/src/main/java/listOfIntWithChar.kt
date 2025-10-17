fun main() {
    val input = listOf("!", "2", "g")
    val exptected = listOf("-!", "-2", "-g")
    val actual = listOfIntWithChar(input)

    println("actual=$actual")
    println("exptected=$exptected")
}
fun listOfIntWithChar(input: List<String>): List<String> {
    val newList = input.map {"-$it"}
    return newList
}
//fun listOfIntWithChar(input: List<String>): List<String> {
//    val list = mutableListOf<String>()
//    for (str in input) {
//        list.add("-$str")
//    }
//    return list
//}