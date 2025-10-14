fun main() {

    val number = 46738
    val reversedNumber = reverse2(number)
    println(reversedNumber)
}

fun reverse2(input: Int): Int {
    var reverseNumber = ""
    val numberStr = input.toString()
    for (i in numberStr.lastIndex downTo 0) {
        val char = numberStr.get(i)
        reverseNumber += char
    }
    return reverseNumber.toInt()
}

