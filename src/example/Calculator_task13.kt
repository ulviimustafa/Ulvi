package example

//Task 13 - Lambda Function - Calculator
fun main () {
    println("A ededini daxil edin : ")
    val a = readln().toInt()
    println("B ededini daxil edin : ")
    val b = readln().toInt()
    println("Operator : ")
    val op = readln()
    println("Netice : ")

    when  {
        (op=="+") -> println(toplama(a,b))
        (op=="-") -> println(cixma(a,b))
        (op=="*") -> println(vurma(a,b))
        (op=="/") -> println(bolme(a,b))
    }

}

val toplama = {a : Int ,b : Int -> a+b}
val cixma = {a : Int ,b : Int -> a-b}
val vurma = {a : Int ,b : Int -> a*b}
val bolme = {a : Int ,b : Int -> a/b}