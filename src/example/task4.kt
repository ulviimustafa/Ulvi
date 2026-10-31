package example

//Ortalama bal hesablayan

fun main () {
    println("Azerbaycan  dili : ")
    val a = readln().toInt()
    println("Ingilis dili : ")
    val b = readln().toInt()
    println("Riyaziyyat : ")
    val c = readln().toInt()

    balHesablama(a, b, c)

    val kecidBali = if ((a+b+c) / 3 >= 51  && a >=51 && b>=51  && c>=51 ) {
        println("Kecid balini kecdiniz!")
    }else {
        println("Kesildiniz")
    }
}
//
fun balHesablama (a : Int, b : Int , c: Int) : Int {
    val i = (a + b + c) / 3
    println("Ortalama baliniz : $i")
    when {
        i >=91 -> println("Mukemmel")
        i >=81 -> println("Ela")
        i >=71 -> println("Yaxsi")
        i >=61 -> println("Orta")
        i >=51 -> println("Zeif")
    }
    return i
}