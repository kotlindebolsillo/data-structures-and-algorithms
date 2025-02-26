package utils

val shortUnsortedArray = (-10..10).shuffled().take(8).toIntArray()
val longUnsortedArray = (-100..100).shuffled().take(50).toIntArray()
val veryLongUnsortedArray = (-1000000..1000000).shuffled().take(10000).toIntArray()

fun IntArray.swap(i: Int, j: Int) {
    this[i] = this[j].also { this[j] = this[i] }
}

fun IntArray.printArray() {
    forEach { println(it) }
}
