package sorth_algorithms

import kotlin.system.measureTimeMillis

fun main() {
    BubbleSortAlgorithm.sortArrayKotlinWay(shortUnsortedArray)
}

object BubbleSortAlgorithm: SortAlgorithm {

    override fun sortArrayKotlinWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            for (lastUnsortedIndex in array.lastIndex downTo 1) {
                array.forEachIndexed { index, _ ->
                    if (index < lastUnsortedIndex && array[index] > array[index + 1]) {
                        array.swap(index, index + 1)
                    }
                }
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }

    override fun sortArrayJavaWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            for (lastUnsortedIndex in array.size - 1 downTo 1) {
                for (i in 0 until lastUnsortedIndex) {
                    if(array[i] > array[i + 1]) {
                        array.swap(i, i + 1)
                    }
                }
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }
}
