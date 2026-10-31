package example

fun main () {
    for (i in 1..20) {
        if (i % 2 == 0) {
            println(i) // Cut ededleri ekrana cixarir
        }
    }

    for (i in 1..20) {
        if (i % 2 != 0) {
            println(i) //tek ededleri ekrana cixarir
        }
    }
}
