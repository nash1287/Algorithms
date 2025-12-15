fun main() {
    val input = listOf("Cat", "dog", "cat", "DOG", "bird", "dog")

    val actual = countWords(input)
    val expected = mapOf("bird" to 1, "cat" to 2, "dog" to 3)

    println("actual=$actual expected=$expected")
}


fun countWords(input: List<String>): Map<String, Int> {
    val map = mutableMapOf<String,Int>()
    val inputLowercase = input.map{it.lowercase()}
    inputLowercase.forEach { word->
        val value = map.get(word)
        if(value==null) {
            map.put(word,1)
        } else {
            map.put(word,value+1)
        }
    }
    return map.toSortedMap()
}

//fun countWords(input: List<String>):Map<String, Int> {
//    val map = mutableMapOf<String, Int>()
//    input.map{it.toLowerCase()}.forEach { word->
//        val value = map.get(word)
//        if(value==null) {
//            map.put(word,1)
//        } else {
//            map.put(word,value+1)
//        }
//    }
//    return map.toSortedMap()
//}

//fun countWords(input: List<String>): Map<String, Int> {
//    val inputLower = input.map { it.lowercase() }
//    println(inputLower)
//    val map = mutableMapOf<String, Int>()
//    inputLower.forEach { str ->
//        val value = map.get(str)
//        if (value == null) {
//            map.put(str, 1)
//        } else {
//            map.put(str,value+1)
//        }
//    }
//    return map.toSortedMap()
//}


//fun countWords(input: List<String>): Map<String, Int> {
//    val sortedList = input.sorted().map{it.lowercase()}
//    val map = mutableMapOf<String, Int>()
//    sortedList.forEach { str->
//        val number = map.get(str)
//        if (number==null) {
//            map.put(str, 1)
//        } else {
//            map.put(str, number+1)
//        }
//    }
//    return map
//}