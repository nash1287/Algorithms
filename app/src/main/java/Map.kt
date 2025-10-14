fun main() {
    val map = mapOf(1 to 'r', 2 to 'b', 6 to 'j')
    println("map=$map")
    println("==================")

    map.forEach { key, value ->
        println("key=$key value=$value")
    }
    println("====================")

    val mapCharKey = mutableMapOf('g' to 12, 'h' to 34)
    mapCharKey.forEach { key, value ->
        println("key=$key value=$value")
        mapCharKey.put(key, value + 1)
    }
    println(mapCharKey)
}