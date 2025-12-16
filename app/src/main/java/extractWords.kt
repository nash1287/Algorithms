fun main() {
    val input =
        "Hello 7 89 robot j"
    val actual = extractWords(input)
    val exptected = listOf("Hello, robot, j")

    println("actual=$actual")
    println("exptected=$exptected")
}


fun extractWords(input: String): List<String> {
    return input.map { char ->
        if (char.isDigit() || char.isWhitespace()) {
            '_'
        } else {
            char
        }
    }
        .joinToString("")
        .split('_')
        .filterNot { it == "" }
}


//fun extractWords(input: String): List<String> {
//    return input.map { char ->
//        if (char.isDigit() || char.isWhitespace()) {
//            '_'
//        } else {
//            char
//        }
//    }
//        .joinToString("")
//        .split('_')
//        .filterNot {
//            it == ""
//        }
//}



