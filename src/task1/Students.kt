package task1

class Student (
    val name : String,
    val scores : IntArray,
){
    fun getFullInfo() {
        println("task1.Student : $name - ${scores.joinToString { it.toString() }}")
    }

//    Qiymetlerin ortalamasi

    fun average () : Double {
        var sum = 0.0

        for (score in scores) {
            sum += score
        }
        return sum / scores.size
    }

//    En yuksek qiymet
    fun highestScore() : Int {
        var max = scores[0]

    for (score in scores) {
        if (score > max) {
            max = score
        }
    }
    return max
    }

//    Herfe uygun qiymet

    fun letterGrade () : String {
        return when {
            average() >= 90 -> "A"
            average() >= 80 -> "B"
            average() >= 70 -> "C"
            average() >= 60 -> "D"
            else -> "F"
        }
    }

//    Telebelerin kecib kecmediyini yoxlamaq

    fun isPassed () : Boolean {
        if (average() < 60) {
            return false
        }else return true
    }

}

fun printReport (students : Array<Student>) {
    for (student in students) {
        val status = if (student.isPassed()) "Passed" else "Failed"

        println("| max : ${student.highestScore()}|" + "grade : $student.grade |" + "$status|")
    }
}

// telebelerin sayini hesablamaq
fun countStudents (students : Array<Student> , condition: (Student) -> Boolean): Int {
    var count = 0
    for (student in students) {
        if (condition(student)) {
            count++
        }
    }
    return count
}

// En yaxsi telebeni tapmaq

fun findBest (students : Array<Student>) : Student? {
    if (students.isEmpty()) {
        return null
    }

    var best = students[0]

    for (student in students) {
        if (student.average() > best.average()) {
            best = student
        }
    }
    return best
}

fun main() {
    val std1 = Student(
        name = "Ulvi",
        scores = intArrayOf(94, 76, 84, 99, 75)

    )

    val std2 = Student(
        name = "Ali",
        scores = intArrayOf(65, 53, 78, 88, 78)
    )

    val std3 = Student(
        name = "Huseyn",
        scores = intArrayOf(81, 76, 87, 67, 66)
    )

    val students = arrayOf(std1, std2, std3)
    for (std in students) {
        std.getFullInfo()

    }
    println("-----------------Telebelerin hesabati --------------")
    printReport (students)
    println("-----------------Kecen telebelerin sayi --------------")

    val passed = countStudents(students) {
        it.isPassed()
    }
    println("Passed: $passed")

    val gradeACount = countStudents(students) {
        it.letterGrade() == "A"
    }
    println("A alanlarin sayi: $gradeACount")

    val perfectScoreCount = countStudents(students) {
        it.scores.contains(100)
    }
    println("En azi bir 100 qiymeti olan telebelerin sayi: $perfectScoreCount")

    val bestStudent = findBest(students)
    if (bestStudent != null) {
        println("Best student found ${students}")
    }else println("Best student not found")

//    Ortalamaya gore siralama :

    val ranking = students.sortedByDescending {
        it.average()
    }
    println("-------------RANKING---------------")
    for ((index,student) in ranking.withIndex()) {
        println(
            "${index + 1}. ${student.name} - ${"%.1f".format(student.average())}"
        )
    }
}
///