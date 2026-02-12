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
    var figureSum = 0
    var roundSum = 0
    var squareSum = 0
    input.forEach {
        if (it == '{') {
            figureSum++
        } else if (it == '}') {
            figureSum--
        }
        if (it == '[') {
            squareSum++
        } else if (it == ']') {
            squareSum--
        }
        if (it == '(') {
            roundSum++
        } else if (it == ')'){
            roundSum--
        }
        if (figureSum < 0 || roundSum < 0 || squareSum < 0) {
            return false
        }
    }
    if (figureSum == 0 && roundSum == 0 && squareSum == 0) {
        return true
    } else {
        return false
    }
}
//fun isValidBrackets(input: String): Boolean {
//    var current1 = 0
//    var current2 = 0
//    var current3 = 0
//    input.forEach { char ->
//        if (char == '(') {
//            current1++
//        } else if (char == ')') {
//            current1--
//        }
//        if (char == '[') {
//            current2++
//        } else if (char == ']') {
//            current2--
//        }
//        if (char == '{') {
//            current3++
//        } else if (char == '}') {
//            current3--
//        }
//        if (current1 < 0 || current2 < 0 || current3 < 0) {
//            return false
//        }
//    }
//    if (current1 == 0 && current2 == 0 && current3 == 0) {
//        return true
//    } else {
//        return false
//    }
//}
//
//fun isValidBrackets(input: String): Boolean {
//    var counterFigure = 0
//    var counterSquare = 0
//    var counterRound = 0
//
//
//    input.forEach {char->
//        if (char == '{') {
//            counterFigure++
//        } else if (char == '}') {
//            counterFigure--
//        }else if (char == '[') {
//            counterSquare++
//        } else if (char == ']') {
//            counterSquare--
//        } else if (char == '(') {
//            counterRound++
//        }  else if (char == ')') {
//            counterRound--
//        }
//        if (counterFigure < 0 || counterSquare<0 || counterRound<0) {
//            return false
//        }
//    }
//    if (counterFigure == 0 && counterSquare==0 && counterRound==0) {
//        return true
//    } else {
//        return false
//    }
//}
//
