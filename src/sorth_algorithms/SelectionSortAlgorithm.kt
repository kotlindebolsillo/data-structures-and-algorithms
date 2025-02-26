package sorth_algorithms

import kotlin.system.measureTimeMillis

fun main() {
    SelectionSortAlgorithm.sortArrayKotlinWay(veryLongUnsortedArray)
}

object SelectionSortAlgorithm : SortAlgorithm {

    override fun sortArrayKotlinWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {

            for (lastUnsortedIndex in array.lastIndex downTo 1) {
                var largest = 0

                array.forEachIndexed { index, value ->
                    if (index in 1..lastUnsortedIndex && value > array[largest]) largest = index
                }

                if (largest != lastUnsortedIndex) array.swap(largest, lastUnsortedIndex)
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }

    override fun sortArrayJavaWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            for (lastUnsortedIndex in array.size - 1 downTo 1) {

                var largest = 0

                for (i in 1 .. lastUnsortedIndex) {
                    if(array[i] > array[largest]) largest = i
                }

                array.swap(largest, lastUnsortedIndex)
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }
}