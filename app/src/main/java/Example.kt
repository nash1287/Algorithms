fun main() {
    val listChar = listOf("456", "56", "-5", "45")
    val dubl = listChar
        .map { strNumber -> strNumber.toInt() }
        .map { it * it }
        .map { number -> "#$number" }
        .map { str -> str.substring(1,str.lastIndex)  }
        .map { number->number.toInt() }
        .sorted()

    println(dubl)
}