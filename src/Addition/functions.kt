package Addition//fun calculate (op : (num1 : Int, num2 : Int) -> Int) {
//    println("1-ci eded")
//    val num1 = readlnOrNull()?.toIntOrNull()?:0
//    println("2-ci eded")
//    val num2 = readlnOrNull()?.toIntOrNull()?:0
//    return op(num1, num2)
//}


fun onMyForEach (array : Array<Int> , onEach : (Int) -> Unit) {
    for (i in array) {
        onEach(i)
    }
}

fun main() {

}