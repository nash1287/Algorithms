import android.renderscript.ScriptGroup

/**
 * Задача 2: Найти первый уникальный элемент
 *
 * Дан список чисел. Необходимо найти первое число, которое встречается
 * в списке только один раз. Если таких чисел нет, вернуть null.
 *
 * Пример:
 * Input: [5, 3, 5, 2, 3, 7, 2, 8]
 * Output: 7 (первое число, которое встречается один раз)
 */

fun main() {
    // Test Case 1
    val input1 = listOf(5, 3, 5, 2, 3, 7, 2, 8)
    val actual1 = findFirstUniqueNumber(input1)
    val expected1 = 7
    println("Test 1: ${actual1 == expected1}")
    println("Input: $input1")
    println("Actual: $actual1")
    println("Expected: $expected1")
    println()
}
fun findFirstUniqueNumber(input: List<Int>): Int {
    val listUnique = mutableListOf<Int>()
    val listDublicate = mutableListOf<Int>()
    for(number in input) {
        if(!listUnique.contains(number)) {
            listUnique.add(number)
        } else {
            listDublicate.add(number)
        }
    }
    listDublicate.forEach {
        listUnique.remove(it)
    }

    return listUnique.first()
}
//
//    // Test Case 2
//    val input2 = listOf(1, 2, 1, 3, 2, 4, 3)
//    val actual2 = findFirstUniqueNumber(input2)
//    val expected2 = 4
//    println("Test 2: ${actual2 == expected2}")
//    println("Input: $input2")
//    println("Actual: $actual2")
//    println("Expected: $expected2")
//    println()
//
//    // Test Case 3 (No unique elements)
//    val input3 = listOf(1, 1, 2, 2, 3, 3)
//    val actual3 = findFirstUniqueNumber(input3)
//    val expected3 = null
//    println("Test 3: ${actual3 == expected3}")
//    println("Input: $input3")
//    println("Actual: $actual3")
//    println("Expected: $expected3")
//    println()
//
//    // Test Case 4 (All unique, return first)
//    val input4 = listOf(10, 20, 30, 40)
//    val actual4 = findFirstUniqueNumber(input4)
//    val expected4 = 10
//    println("Test 4: ${actual4 == expected4}")
//    println("Input: $input4")
//    println("Actual: $actual4")
//    println("Expected: $expected4")
//    println()
//
//    // Test Case 5 (Empty list)
//    val input5 = emptyList<Int>()
//    val actual5 = findFirstUniqueNumber(input5)
//    val expected5 = null
//    println("Test 5: ${actual5 == expected5}")
//    println("Input: $input5")
//    println("Actual: $actual5")
//    println("Expected: $expected5")
//}
