package example

//Task 14 - Lambda Function 2

fun main(){
    println("A ededini daxil edin : ")
    val a = readln().toInt()
    println(emeliyyat(a))
}

var emeliyyat : (Int) -> Int = { a ->
    println("Netice : ")
    if (a > 10) {
        a * 2
    } else {
        a + 5
    }
}

//