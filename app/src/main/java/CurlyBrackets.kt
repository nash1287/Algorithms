fun main() {
    val input = "{}"
    val actual = curlybrackets(input)
    val expected = true

    val input1 = "{}}{"
    val actual1 = curlybrackets(input1)
    val expected1 = false

    val input2 = "{{{}}}"
    val actual2 = curlybrackets(input2)
    val expected2 = true

    val input3 = "}{"
    val actual3 = curlybrackets(input3)
    val expected3 = false

    val input4 = "}}}{{"
    val actual4 = curlybrackets(input4)
    val expected4 = false

    println("input=$input,actual=$actual,expected = $expected")
    println("input1=$input1,actual1=$actual1,expected1 = $expected1")
    println("input2=$input2,actual2=$actual2,expected2 = $expected2")
    println("input3=$input3,actual3=$actual3,expected3 = $expected3")
    println("input4=$input4,actual4=$actual4,expected4 = $expected4")

}

fun curlybrackets(input: String): Boolean {
    var counter = 0

    for (i in input) {
        if (i == '{') {
            counter++
        } else {
            counter--
        }
        if (counter<0) {
            return false
        }
    }
    if (counter == 0) {
        return true
    } else {
        return false
    }
}

