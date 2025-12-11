fun main() {
    val input = 6
    val actual = fibonacci(input)
    val expected = 8
    println("actual=$actual expected=$expected")
}
//    0,1,1,2,3,5,8,13


fun fibonacci(input: Int): Int {
    val list = mutableListOf(0, 1)
    while (list.size < input + 1) {
        val previosNumber = list.get(list.lastIndex-1)
        val lastNumber = list.get(list.lastIndex)
        val number = lastNumber+previosNumber
        list.add(number)
    }
    return list.last()
}


//fun fibonacci(input: Int): Int {
//    val list = mutableListOf<Int>(0,1)
//    while (list.size<input+1) {
//        val previosNumber = list.get(list.lastIndex-1)
//        val lastNumber = list.get(list.lastIndex)
//        val number = previosNumber+lastNumber
//        list.add(number)
//    }
//    return list.last()
//}

//fun fibonacci(input: Int): Int {
//    val list = mutableListOf(0, 1)
//    while (list.size < input + 1) {
//        val lastNumber = list.get(list.lastIndex)
//        val previosLastNumber = list.get(list.lastIndex - 1)
//        val number = lastNumber + previosLastNumber
//        list.add(number)
//    }
//    return list.last()
//}