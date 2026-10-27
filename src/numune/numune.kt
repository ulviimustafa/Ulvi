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

////    Task 4 - Ortalama bali hesablayan
//
//    println("Azerbaycan  dili : ")
//    val a = readln().toInt()
//    println("Ingilis dili : ")
//    val b = readln().toInt()
//    println("Riyaziyyat : ")
//    val c = readln().toInt()
//
//    balHesablama(a, b, c)
//
//    val kecidBali = if ((a+b+c) / 3 >= 51  && a >=51 && b>=51  && c>=51 ) {
//        println("Kecid balini kecdiniz!")
//    }else {
//        println("Kesildiniz")
//    }
//}
//
//fun balHesablama (a : Int, b : Int , c: Int) : Int {
//    val i = (a + b + c) / 3
//    println("Ortalama baliniz : $i")
//    when {
//        i >=91 -> println("Mukemmel")
//        i >=81 -> println("Ela")
//        i >=71 -> println("Yaxsi")
//        i >=61 -> println("Orta")
//        i >=51 -> println("Zeif")
//    }
//    return i

//    Task 5 - For dovru

//    for (i in 1..20)
//        if (i % 2 == 0) {
//            println(i) // Cut ededleri ekrana cixarir
//        }
//        if (i % 2 != 0) {
//        println(i) // Tek ededleri ekrana cixarir
//    }


//    Task 6 - While  /  do-while

//    10-dan 1-ə qədər geriyə say və sonda “Başladı!” yaz.
//    for (i in 10 downTo 1) {
//        println(i)
//        }
//        println("Basladi")
//    }

//    Task 7  - Arrays (Ededlerin cemi)
//
//    var arrays = arrayOf(21,25,45,75,65)
//    var cem = 0
//    println(arrays.contentToString())
//
//    for (array in arrays) {
//        cem += array
//    }
//    println("Ededlerin cemi : $cem")

//    Task 8 - String (UpperCase, LowerCase, Length)
//
//    println("Adinizi daxil edin : ")
//    val name = readln()
//    println("Istifadechi adiniz : $name")
//
//    println("Adiniz Boyuk herflerle bu cur yazilir : ")
//    println(name.uppercase())
//
//    println("Adiniz kicik herflerle bu cur yazilir : ")
//    println(name.lowercase())


// Task 9 - Istifadeci 5 eded daxil etsin ve onlarin ortalamasini hesabla
//
//    var ededler = IntArray(5)
//    var cem = 0
//
//    for (i in ededler.indices) {
//        println("${i + 1}-ci ededi daxil et :  ")
//        ededler[i] = readln().toInt()
//        cem += ededler[i]
//    }
//    println("Ededlerin cemi : $cem" )
//
//    val ortalama = cem.toDouble() / ededler.size
//    println("Ededlerin ortalamasi : $ortalama")
//.
//
}