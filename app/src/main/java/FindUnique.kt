fun main() {
    val input = listOf(4, 5, 4, 2, 5)
    val actual = findUnique(input)
    val expected = 2
    println("actual=$actual expected=$expected")
}

fun findUnique(input: List<Int>): Int {
    val list = mutableListOf<Int>()
    val duplList = mutableListOf<Int>()
    input.forEach { number ->
        if (list.contains(number)) {
            duplList.add(number)
        } else {
            list.add(number)
        }
    }
    duplList.forEach {
        list.remove(it)
    }
    return list.first()
}




