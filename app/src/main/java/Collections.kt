fun main() {
    val mutList = mutableListOf(2, 2, 4, 5, 22)
    println(mutList)

    mutList.get(mutList.lastIndex)
    mutList[mutList.lastIndex]
    val isEmpty = mutList.isEmpty()
    mutList.clear()
    mutList.last()
    mutList.first()
    mutList.remove(4)
    mutList.removeAt(mutList.lastIndex)
    mutList.add(4,4)
    mutList.addAll(5,listOf())
    mutList.set(1,3)
    mutList.size
    mutList.subList(1,5)
    val isContains =mutList.contains(1)
    mutList.containsAll(listOf())
    mutList.sort()
    val sortedList = mutList.sorted()
    val evenNumbers = mutList.filter {it % 2 == 0}
    val oddNumbers = mutList.filterNot {it % 2 == 0}
    mutList.reverse()
    val reversedList = mutList.reversed()
    mutList.forEachIndexed {index,number ->
        println(number)
    }
    val newList = mutList.map {  "#$it#"    }
    println(newList)













}
