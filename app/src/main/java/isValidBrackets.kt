fun main() {

    val input1 = "({[]})"
    val actual1 = isValidBrackets(input1)
    val expected1 = true

    val input2 = "()]"
    val actual2 = isValidBrackets(input2)
    val expected2 = false

    val input3 = "()[]{"
    val actual3 = isValidBrackets(input3)
    val expected3 = false

    val input4 = "()[}]{"
    val actual4 = isValidBrackets(input4)
    val expected4 = false

    val input5 = "{[)(]}"
    val actual5 = isValidBrackets(input5)
    val expected5 = false


    println("input1=$input1,actual1=$actual1,expected1 = $expected1")
    println("input2=$input2,actual2=$actual2,expected2 = $expected2")
    println("input3=$input3,actual3=$actual3,expected3 = $expected3")
    println("input4=$input4,actual4=$actual4,expected4 = $expected4")
    println("input5=$input5,actual5=$actual5,expected5 = $expected5")

}

fun isValidBrackets(input: String): Boolean {
    var counter = 0

    for (i in 0..input.lastIndex) {
        val char = input.get(i)
        if (char == '{') {
            counter++
        } else if (char == '[') {
            counter++
        } else if (char == '(') {
            counter++
        } else {
            counter--
        }
        if (counter < 0) {
            return false
        }
    }
    if (counter == 0) {
        return true
    } else {
        return false
    }
}

