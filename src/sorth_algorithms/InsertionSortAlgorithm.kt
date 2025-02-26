package sorth_algorithms

import kotlin.system.measureTimeMillis

fun main() {
    InsertionSortAlgorithm.sortArrayKotlinWay(shortUnsortedArray)
}

object InsertionSortAlgorithm : SortAlgorithm {

    override fun sortArrayKotlinWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            for (firstUnsortedIndex in 1 until array.size) {
                val newElement = array[firstUnsortedIndex]
                var i = firstUnsortedIndex

                while (i > 0 && array[i - 1] > newElement) {
                    array[i] = array[i - 1]
                    i--
                }

                array[i] = newElement
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }

    override fun sortArrayJavaWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            for (firstUnsortedIndex in 1..<array.size) {
                val newElement: Int = array[firstUnsortedIndex]

                var i = firstUnsortedIndex
                while (i > 0 && array[i - 1] > newElement) {
                    array[i] = array[i - 1]
                    i--
                }

                array[i] = newElement
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }
}