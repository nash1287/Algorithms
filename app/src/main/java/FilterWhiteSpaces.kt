fun main() {
    val text = "h        @#$        KJHKHKUGJ        e     l l   o    "

    val filteredWord = filterWhiteSpaces(text)

    println(filteredWord)
}

fun filterWhiteSpaces(text: String): String {
    var result = ""

    for (i in 0..text.lastIndex) {
        val char = text.get(i)
        if (char!=' ') {
            result += char

        }
    }

    return result
}