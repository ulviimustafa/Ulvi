package example

fun main () {
//Arrays - Ededlerin cemi

var arrays = arrayOf(21,25,45,75,65)
    var cem = 0
    println(arrays.contentToString())

    for (array in arrays) {
        cem += array
    }
    println("Ededlerin cemi : $cem")
}