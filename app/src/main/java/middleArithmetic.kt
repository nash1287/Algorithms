import android.renderscript.ScriptGroup

fun main() {
    val list = listOf(50, 48, 49, 50, 49, 46, 47, 48, 500, 47, 48, 50)

    val actual = middleArithmetic(list)

    val expected = 85.66667f

    println("actual=$actual, expected=$expected")

}


fun middleArithmetic(input: List<Int>): Float {
    val sortInput = input.sorted()
    val sum = sortInput.sum()
    println(sum)
    return (sortInput.sum()/sortInput.size).toFloat()
}


//fun middleArithmetic(input: List<Int>): Float {
//
//    return input.sum()/input.size.toFloat()
//}
////fun middleArithmetic(input: List<Int>): Float {
////    var sum = 0
////    for (i in 0..input.lastIndex) {
////        val number = input.get(i)
////        sum += number
////    }
////    return sum / input.size.toFloat()
////}