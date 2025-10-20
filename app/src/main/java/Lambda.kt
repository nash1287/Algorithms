fun main() {
    val lambda: (Int)->Int = { number->
        println("Hello")
        10
    }
    val n = lambda.invoke(5)
}
