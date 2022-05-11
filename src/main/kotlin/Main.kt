fun main() {
    val entries = intArrayOf(9, 529, 20, 15, 1041, 32)
    entries.forEach { println("$it -> ${solution(it)}") }
}

fun solution(N: Int): Int {

    val key = '0'
    val zero = 0
    var counter = zero
    val gaps = arrayListOf<Int>()

    Integer.toBinaryString(N).map {
        if (it == key)
            counter++
        else {
            gaps.add(counter)
            counter = zero
        }
    }

    return gaps.reduce { a, b -> if (a < b) b else a }
}