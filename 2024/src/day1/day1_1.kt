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
    calc_distance(list1, list2)
}

fun calc_distance(list1: MutableList<Int>, list2: MutableList<Int>): Int {
    val sortedList1 = list1.sortedDescending()
    val sortedList2 = list2.sortedDescending()
    var total = 0
    for (i in list1.indices) {
        var distance = sortedList1[i] - sortedList2[i]
        if (distance < 0) {
            distance *= -1
        }
        total += distance
    }
    println("total = $total")
    return total
}