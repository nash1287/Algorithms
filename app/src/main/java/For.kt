fun main() {
    val list = listOf(3, 3, 5, 6)
    for (i in 0..list.lastIndex) {
        val number = list.get(i)
        println("index=$i number=$number")
    }
    println("=================")
    for (i in list.lastIndex downTo 0) {
        val number = list.get(i)
        println("index=$i number=$number")
    }
    println("=================")

    for (number in list) {
        println("number=$number")
    }
    println("=================")

    list.forEach { number ->
        println("number=$number")
    }
    println("=================")

    list.forEachIndexed { index, number ->
        println("index=$index number$number")
    }

    println("=================")
}