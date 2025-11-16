/**
 * Задача 3: Найти пару чисел с заданной суммой
 *
 * Дан массив целых чисел и целевое число (target).
 * Необходимо найти индексы двух элементов массива, сумма которых равна target.
 *
 * Гарантируется, что существует ровно одно решение.
 * Один элемент нельзя использовать дважды.
 *
 * Верните пару индексов Pair(index1, index2), где index1 < index2.
 *
 * Пример:
 * Input: numbers = [3, 7, 15, 2], target = 9
 * Output: Pair(0, 1)  // numbers[0] + numbers[1] = 3 + 7 = 9
 */

fun main() {
    // Test Case 1
    val input1 = listOf(3, 7, 15, 2)
    val target1 = 9
    val actual1 = findTwoSum(input1, target1)
    val expected1 = Pair(1, 3)
    println("Test 1: ${actual1 == expected1}")
    println("Input: numbers = $input1, target = $target1")
    println("Actual: $actual1")
    println("Expected: $expected1")
    println()
}

fun findTwoSum(input1: List<Int>, target: Int): Pair<Int, Int> {
    for (i in 0..input1.lastIndex) {
        for (j in i + 1..input1.lastIndex) {
            if (input1.get(i) + input1.get(j) == target) {
                return Pair(i, j)
            }
        }
    }
    return throw Exception("Not Pair")
}
//
//    // Test Case 2
//    val input2 = listOf(5, 2, 8, 1, 9)
//    val target2 = 10
//    val actual2 = findTwoSum(input2, target2)
//    val expected2 = Pair(1, 4)  // 2 + 9 = 10
//    println("Test 2: ${actual2 == expected2}")
//    println("Input: numbers = $input2, target = $target2")
//    println("Actual: $actual2")
//    println("Expected: $expected2")
//    println()
//
//    // Test Case 3
//    val input3 = listOf(10, 20, 30, 40, 50)
//    val target3 = 90
//    val actual3 = findTwoSum(input3, target3)
//    val expected3 = Pair(3, 4)  // 40 + 50 = 90
//    println("Test 3: ${actual3 == expected3}")
//    println("Input: numbers = $input3, target = $target3")
//    println("Actual: $actual3")
//    println("Expected: $expected3")
//    println()
//
//    // Test Case 4 (Negative numbers)
//    val input4 = listOf(-5, 3, 8, -2, 10)
//    val target4 = 6
//    val actual4 = findTwoSum(input4, target4)
//    val expected4 = Pair(1, 3)  // 3 + (-2) = 1... wait, that's wrong
//    // Actually: -5 + 11? No. 3 + 3? No. 8 + (-2) = 6
//    val expected4Corrected = Pair(2, 3)  // 8 + (-2) = 6
//    println("Test 4: ${actual4 == expected4Corrected}")
//    println("Input: numbers = $input4, target = $target4")
//    println("Actual: $actual4")
//    println("Expected: $expected4Corrected")
//    println()
//
//    // Test Case 5 (First and last elements)
//    val input5 = listOf(1, 5, 3, 9)
//    val target5 = 10
//    val actual5 = findTwoSum(input5, target5)
//    val expected5 = Pair(0, 3)  // 1 + 9 = 10
//    println("Test 5: ${actual5 == expected5}")
//    println("Input: numbers = $input5, target = $target5")
//    println("Actual: $actual5")
//    println("Expected: $expected5")
//    println()
//
//    // Test Case 6 (Two adjacent elements)
//    val input6 = listOf(4, 6, 10, 2)
//    val target6 = 16
//    val actual6 = findTwoSum(input6, target6)
//    val expected6 = Pair(1, 2)  // 6 + 10 = 16
//    println("Test 6: ${actual6 == expected6}")
//    println("Input: numbers = $input6, target = $target6")
//    println("Actual: $actual6")
//    println("Expected: $expected6")

