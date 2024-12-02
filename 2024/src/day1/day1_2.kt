package day1

fun main() {
    val lines = text_input.trim().lines()

    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    for (line in lines) {
        val parts = line.trim().split("   ".toRegex())
        if (parts.size == 2) {
            list1.add(parts[0].toInt())
            list2.add(parts[1].toInt())
        }
    }
    calculateSimilarity(list1, list2)
}

fun calculateSimilarity(list1: MutableList<Int>, list2: MutableList<Int>): Int {

    var totalSimilarity = mutableListOf<Int>()
    for (i in list1.indices) {
        val inList2 = list2.count{ it == list1[i] }
        val simil = list1[i] * inList2
        totalSimilarity.add(simil)
    }
    val total = totalSimilarity.sum()
    println("Total Similarity: $total")
    return total
}
