fun main() {
    val list = mutableListOf(1, 2, null, 3, null, 4, null, 6, 34)
    list.shuffle()
    //1
    val first = list.first()
    var nonNullble = 0
    if (first != null) {
        nonNullble = first
    }
    println(nonNullble)
    //2
    println(list.first() ?: 0)
    //3
   val number = list.filterNot { it==null }.first()!!
    println(number)
}



