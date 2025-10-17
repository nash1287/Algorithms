fun main() {
    val numberOfChar = countChar("hello Sasnha", 'n')

    println(numberOfChar)
}
fun countChar(text: String, char: Char): Int {
    var counter = 0
    for (_char in text) {
        if (_char == char) {
            counter += 1
        }
    }
    return counter
}
//    val numberOfChar = countChar("hello Sasnha",'n')
//fun countChar(text: String, char: Char): Int {
//    var counter = 0
//    for (i in 0..text.lastIndex) {
//        val _char = text.get(i)
//        if (_char == char) {
//            counter += 1
//        }
//    }
//    return counter
//}

