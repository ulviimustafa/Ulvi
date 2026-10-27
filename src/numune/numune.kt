package numune

import java.awt.AWTEventMulticaster.add

fun main() {

//    Variables and Types
//
//    Task 1
//
//    val name = "Ulvi"
//    val age = 24
//    val city = "Baku"
//
//    println("Adiniz : $name , Yaşınız : $age , Şəhər : $city")
//
//    Task 2
//
//    var money = 100
//    println(money)
//    money = 150
//    println(money)
//
//    Task 3
//
//    println("Adınız :")
//    var name = readln().toString()
//    println("Yaşınız :")
//    var age = readln().toInt()
//
//    println("Salam $name, sənin $age yaşın var")
//.

//    Task 4

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