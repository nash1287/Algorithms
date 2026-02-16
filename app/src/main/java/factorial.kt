fun main() {
    val actual = factorial(5)
    val expected = 120

    println("actual=$actual expected=$expected")
}

fun factorial(input:Int):Int {
    var factorial = 1
    for (i in 1..input) {
        factorial*=i
    }
    return factorial
}

//fun factorial(input:Int): Int {
//    var factorial = 1
//    for (number in 1..input) {
//        factorial*=number
//    }
//    return factorial
//}

//fun factorial(input: Int): Int {
//    var factorial = 1
//    for (number in 1..input) {
//        factorial*=number
//    }
//    return factorial
//}

















//fun factorial(number: Int): Int {
//    var factorial = 1
//    for (i in 1..number) {
//        factorial *= i
//    }
//    return factorial
//}