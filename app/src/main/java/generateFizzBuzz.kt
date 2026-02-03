// Написать программу, которая генерирует последовательность от 1 до N, где:
// числа, кратные 3, заменяются на "Fizz",
//числа, кратные 5 — на "Buzz",
//числа, кратные и 3, и 5 — на "FizzBuzz".

fun main() {
    val actual = generateFizzBuzz(15)
    val exptected = listOf(
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
    )

    println("actual=$actual")
    println("exptected=$exptected")
}


fun generateFizzBuzz(input: Int): List<String> {
    val listInt = mutableListOf<Int>()
    val listString = mutableListOf<String>()
    for (number in 1..input) {
        listInt.add(number)
    }
    listInt.forEach {
        if(it % 3 == 0 && it % 5 == 0) {
            listString.add("FizzBuzz")
        }
        else if (it % 3 == 0) {
            listString.add("Fizz")
        }
        else if (it % 5 == 0) {
            listString.add("Buzz")
        }
        else {
            listString.add("$it")
        }
    }
    return listString
}















//fun generateFizzBuzz(n: Int): List<String> {
//
//    val listOfInt = mutableListOf<Int>()
//    for (i in 1 ..n){
//        listOfInt.add(i)
//    }
//    return listOfInt.map {
//        if (it % 3 == 0 && it % 5 == 0){
//            "FizzBuzz"
//        } else if (it % 3 == 0){
//            "Fizz"
//        } else if (it % 5 == 0){
//            "Buzz"
//        } else "$it"
//    }
//}