package Addition////Artan, azalan ededler
//
//var numbers = arrayOf(32, 31, 93, 22, 54)
//fun artan (numbers: Array<Int>) {
//    println(numbers.sorted())
//}
//fun azalan (numbers: Array<Int>) {
//    println(numbers.sortedDescending())
//}
//
//fun task1.Addition.Addition.Addition.main() {
//    println("Artan sira:")
//    artan(numbers)
//    println("Azalan sira:")
//    azalan(numbers)
//}

//Ortalama bal  hesablama :

//fun ortalama (a: Int, b: Int, c: Int , d: Int): Int {
//    return (a + b + c + d) / 4
//}
//
//fun task1.Addition.Addition.Addition.main () {
//    println("Riyaziyyat:")
//    var a = readln().toInt()
//    println("Azerbaycan dili:")
//    var b = readln().toInt()
//    println("English:")
//    var c = readln().toInt()
//    println("Informatika:")
//    var d = readln().toInt()
//
//    println("Ortalama ; ${ortalama(a, b, c, d)}")
//
//    when  {
//        ortalama(a, b, c, d) >= 51 -> println("Pis")
//        ortalama(a, b, c, d) >= 71 -> println("Yaxsi")
//        ortalama(a, b, c, d) >= 81 -> println("Ela")
//        else -> println("Kesildiniz")
//    }
//}
//
//fun task1.Addition.Addition.Addition.main() {
//    val xana = CharArray(9) { ' ' }
//    var oyunçu = 'X'
//    var say = 0
//
//    while (true) {
//        // Oyun taxtasını göstəririk
//        println()
//        println(" ${xana[0]} | ${xana[1]} | ${xana[2]} ")
//        println("---+---+---")
//        println(" ${xana[3]} | ${xana[4]} | ${xana[5]} ")
//        println("---+---+---")
//        println(" ${xana[6]} | ${xana[7]} | ${xana[8]} ")
//        println()
//
//        println("$oyunçu oyunçusu, xana seç (1-9):")
//        val secim = readln().toIntOrNull()
//
//        if (secim == null || secim !in 1..9) {
//            println("Yanlış seçim! 1-dən 9-a qədər rəqəm daxil et.")
//            continue
//        }
//
//        val index = secim - 1
//
//        if (xana[index] != ' ') {
//            println("Bu xana artıq doludur! Başqa xana seç.")
//            continue
//        }
//
//        xana[index] = oyunçu
//        say++
//
//        // Qalibiyyəti yoxlayırıq
//        val qalibiyyet = listOf(
//            listOf(0, 1, 2),
//            listOf(3, 4, 5),
//            listOf(6, 7, 8),
//            listOf(0, 3, 6),
//            listOf(1, 4, 7),
//            listOf(2, 5, 8),
//            listOf(0, 4, 8),
//            listOf(2, 4, 6)
//        )
//
//        val qalib = qalibiyyet.any { kombinasiya ->
//            kombinasiya.all { xana[it] == oyunçu }
//        }
//
//        if (qalib) {
//            println()
//            println(" ${xana[0]} | ${xana[1]} | ${xana[2]} ")
//            println("---+---+---")
//            println(" ${xana[3]} | ${xana[4]} | ${xana[5]} ")
//            println("---+---+---")
//            println(" ${xana[6]} | ${xana[7]} | ${xana[8]} ")
//            println()
//            println("Təbriklər! $oyunçu oyunçusu qalib gəldi!")
//            break
//        }
//
//        if (say == 9) {
//            println("Oyun heç-heçə bitdi!")
//            break
//        }
//
//        // Oyunçunu dəyişirik
//        oyunçu = if (oyunçu == 'X') 'O' else 'X'
//    }
//}