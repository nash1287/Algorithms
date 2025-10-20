fun main() {
    val lambda: (Float) -> String = { number ->

        "Hello"
    }
    val n = lambda.invoke(5f)

    val list = listOf(1, 2, 3)
    val l = {}

    helloFromLambda {

    }
}


fun helloFromLambda(lam:()->Unit) :Int {
    lam.invoke()
    return 0
}