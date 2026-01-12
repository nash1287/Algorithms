import android.renderscript.ScriptGroup

fun main() {
    val input = "pogoda"
    val expected = mapOf('p' to 1, 'o' to 2, 'g' to 1, 'd' to 1, 'a' to 1)
    val actual: Map<Char, Int> = countChars(input)
    println("expected=$expected, actual=$actual")
}


fun countChars(input: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    for (char in input) {
        val value = map.get(char)
        if (value == null) {
            map.put(char, 1)
        } else {
            map.put(char, value + 1)
        }
    }
    return map
}


//fun countChars(input: String): Map<Char, Int> {
//    val map = mutableMapOf<Char, Int>()
//    input.forEach { char->
//        val value = map.get(char)
//        if (value==null) {
//            map.put(char,1)
//        } else {
//            map.put(char,value+1)
//        }
//    }
//    return map
//}

//fun countChars(input: String): Map<Char, Int> {
//    val map = mutableMapOf<Char, Int>()
//    for (char in input) {
//        val currentValueInMap = map.get(char)
//        if (currentValueInMap == null) {
//            map.put(char, 1)
//        } else {
//            map.put(char, currentValueInMap + 1)
//        }
//    }
//    return map
//}

//fun countChars(input: String): Map<Char, Int> {
//    val map = mutableMapOf<Char, Int>()
//    for (i in 0..input.lastIndex) {
//        val char = input.get(i)
//        val currentValueInMap = map.get(char)
//        if (currentValueInMap == null) {
//            map.put(char, 1)
//        } else {
//            map.put(char, currentValueInMap + 1)
//        }
//    }
//    return map
//}