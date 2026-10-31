package example

//    Task 15 - Function HOF 3
fun main() {
    println("A ededini daxil edin : ")
    val a = readln().toInt()
    println("B ededini daxil edin : ")
    val b = readln().toInt()
    print("Toplama :")
    println(emeliyyat(a, b) { a, b -> a + b })
    print("Vurma : ")
    println(emeliyyat(a, b) { a, b -> a * b })
    print("Cixma : ")
    println(emeliyyat(a, b) { a, b -> a - b })
}

fun emeliyyat(
    a: Int,
    b: Int,
    hereket: (Int, Int) -> Int
): Int {
    return hereket(a, b)
//
}