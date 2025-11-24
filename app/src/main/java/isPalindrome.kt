import android.R

fun main() {
    val number1 = 9008009
    val number2 = 70080099

    val b1 = isPalindrome(number1)
    val b2 = isPalindrome(number2)

    println(b1) // должно быть true
    println(b2) // должно быть false
}


fun isPalindrome(input: Int): Boolean {
    val reversedInput = input.toString().reversed().toInt()
    return reversedInput == input
}


//fun isPalindrome(number1: Int): Boolean {
//    val reversedNumber = number1.toString().reversed().toInt()
//    if (reversedNumber == number1) {
//        return true
//    } else {
//        return false
//    }
//}
//    var reverseNumber1 = ""
//    val number1Str = number1.toString()
//
//    for (i in number1Str.lastIndex downTo 0) {
//        val char = number1Str.get(i)
//        reverseNumber1 += char
//    }
//
//    return reverseNumber1 == number1Str
//}

