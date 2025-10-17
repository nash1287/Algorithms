//fun main() {
//    val input = "привет 7 мир 5 7 3" // строка с целыми числами, которые разделены пробелами
//    val actual = sumOfSquaresOfUniqueNumbers(input)
//    val exptected = listOf(9, 25, 49)
//
//    // суть (3*3) (5*5) (7*7) - берем только уникальные, отсортированный значения значения чисел в квадрате
//
//    println("actual=$actual")
//    println("exptected=$exptected")
//}
//fun sumOfSquaresOfUniqueNumbers(input: String): List<Int> {
//    val parts = input.split(" ")
//    val uniqueNumbers = parts.map { it. }
//
//
//    return uniqueNumbers.sorted().map { it * it }
//}
////fun sumOfSquaresOfUniqueNumbers(input: String): List<Int> {
////    val uniqueNumbers = mutableSetOf<Int>()
////    val parts = input.split(" ")
////
////    for (part in parts) {
////        if (part.isNotEmpty() && part.all { it.isDigit() }) {
////            uniqueNumbers.add(part.toInt())
////        }
////    }
////    return uniqueNumbers.sorted().map { it * it }
////}
//
//
//
//
//
//
