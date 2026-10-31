package example

//Funksiyalar 1
fun main (){
    println("A ededini daxil edin : ")
    val a = readln().toInt()
    println("B ededini daxil edin : ")
    val b = readln().toInt()
    println("Netice : ${topla(a,b)}")
}

fun topla (a : Int , b : Int ) : Int {
    return a + b
}
//