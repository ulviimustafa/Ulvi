package example

//Task 12 - Higher-Order Function - Calculator
fun main () {
    println("A ededini daxil edin : ")
    val a = readln().toInt()
    println("B ededini daxil edin : ")
    val b = readln().toInt()
    println("Netice : ")
    println(hesabla(a,b) {a , b -> a+b})
}

fun hesabla (
    a : Int,
    b : Int,
    emeliyyat : (Int, Int) -> Int
) : Int {
    return emeliyyat(a, b)
}