fun main() {
    val text = "hallo"

    val filteredWord = filter(text,'l')

    println(filteredWord)
}

fun filter(text: String, char: Char): String {
    var result = ""

    for (i in 0..text.lastIndex) {
        val charInCycle = text.get(i)
        if (char!=charInCycle) {
            result += charInCycle

        }
    }

    return result
}