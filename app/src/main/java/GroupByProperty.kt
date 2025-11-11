fun main() {
    // Test Case 1
    val input1 = listOf(
        Product("apple", "fruit"),
        Product("carrot", "vegetables"),
        Product("banan", "fruit"),
        Product("potato", "vegetables"),
        Product("orange", "fruit")
    )
    val actual1 = groupProductsByCategory(input1)
    val expected1 = mapOf(
        "fruit" to listOf("apple", "banan", "orange"),
        "vegetables" to listOf("carrot", "potato")
    )
    println("Test 1: ${actual1 == expected1}")
    println("Actual: $actual1")
    println("Expected: $expected1")
    println()
}

fun groupProductsByCategory(products: List<Product>): Map<String, List<String>> {
return products
    .groupBy { product -> product.category }
    .mapValues {it.value.map {it.name} }
}
//    // Test Case 2
//    val input2 = listOf(
//        Product("Ноутбук", "Электроника"),
//        Product("Книга", "Литература"),
//        Product("Телефон", "Электроника")
//    )
//    val actual2 = groupProductsByCategory(input2)
//    val expected2 = mapOf(
//        "Электроника" to listOf("Ноутбук", "Телефон"),
//        "Литература" to listOf("Книга")
//    )
//    println("Test 2: ${actual2 == expected2}")
//    println("Actual: $actual2")
//    println("Expected: $expected2")
//    println()
//
//    // Test Case 3 (Empty list)
//    val input3 = emptyList<Product>()
//    val actual3 = groupProductsByCategory(input3)
//    val expected3 = emptyMap<String, List<String>>()
//    println("Test 3: ${actual3 == expected3}")
//    println("Actual: $actual3")
//    println("Expected: $expected3")
//}

data class Product(val name: String, val category: String)

