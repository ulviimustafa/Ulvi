package example

//Task 9 - Istifadeci 5 eded daxil etsin ve onlarin ortalamasini hesabla

fun main() {
//
    val ededler = IntArray(5)
    var cem = 0

    for (i in ededler.indices) {
        println("${i + 1}-ci ededi daxil et :  ")
        ededler[i] = readln().toInt()
        cem += ededler[i]
    }
    println("Ededlerin cemi : $cem")

    val ortalama = cem.toDouble() / ededler.size
    println("Ededlerin ortalamasi : $ortalama")
}