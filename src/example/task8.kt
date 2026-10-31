package example

fun main (){
//    String ile emeliyyatlar (UpperCase, LowerCase, Length)

    println("Adinizi daxil edin : ")
    val name = readln()
    println("Istifadechi adiniz : $name")

    println("Adiniz Boyuk herflerle bu cur yazilir : ")
    println(name.uppercase())

    println("Adiniz kicik herflerle bu cur yazilir : ")
    println(name.lowercase())
}