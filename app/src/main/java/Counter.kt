fun main() {
    val text = ""

    val numberOfA = countA(text)

    println(numberOfA)
}

fun countA(text: String): Int {
    var counter = 0

    for (i in 0..text.lastIndex) {
        val char = text.get(i)

        if (char == 'a') {
            counter += 1

        }
    }

    return counter
}