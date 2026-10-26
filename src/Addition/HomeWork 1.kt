package Addition

fun main () {
    print("1-ci ededi daxil edin: ")
    var a = readln().toInt()
    print("2-ci ededi daxil edin: ")
    var b = readln().toInt()
    print("3-cu ededi daxil edin: ")
    var c = readln().toInt()
    print("4-cu ededi daxil edin: ")
    var d = readln().toInt()
    print("5-ci ededi daxil edin: ")
    var e = readln().toInt()

    sirala(a,b,c,d,e)

//
//    println("Artan sira :  ${ededler.sorted()}")
//    println("Azalan sira :  ${ededler.sortedDescending()}")



}

fun sirala (a:Int, b:Int, c:Int, d:Int, e: Int) {
    var newArray = arrayOf(a, b, c, d, e)

    println("Artan sira  :  ${newArray.sorted()}")
    println("Azalan sira  :  ${newArray.sortedDescending()}")
}

// BubbleSort - arashdir