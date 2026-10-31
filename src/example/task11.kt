package example

//Funksiya ile kvadrat ededler

fun main () {
    println("Ededi yazin : ")
    val eded = readln().toInt()
    println("Ededin kvadrati : ${ededinKvadrati(eded)}")

}

//
fun ededinKvadrati (eded : Int ) : Int {
    return eded * eded
}