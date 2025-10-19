fun main() {
    val input =
        "!=34 =g @привет7мир5 7 33 589" // строка с целыми числами, которые разделены пробелами
    val actual = sumOfSquaresOfUniqueNumbers(input)
    val exptected = listOf(25, 49, 1089,1156,346921)

    // суть (3*3) (5*5) (7*7) - берем только уникальные, отсортированный значения значения чисел в квадрате

    println("actual=$actual")
    println("exptected=$exptected")
}

fun sumOfSquaresOfUniqueNumbers(input: String): List<Int> {
    return input
        .map { char ->
            if (char.isDigit()) {
                char
            } else {
                '_'
            }
        }
        .joinToString("")
        .split('_')
        .mapNotNull { str -> str.toIntOrNull() }
        .distinct()
        .sorted()
        .map { it * it }
}
//fun sumOfSquaresOfUniqueNumbers(input: String): List<Int> {
//    return input
//        .split(" ")
//        .map {str-> str.toIntOrNull() }
//        .filterNotNull()
//        .distinct()
//        .sorted()
//        .map {it*it}
//}
