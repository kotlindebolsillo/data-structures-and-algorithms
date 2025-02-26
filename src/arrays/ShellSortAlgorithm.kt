package arrays

import utils.printArray
import utils.printTimeInMillis
import utils.veryLongUnsortedArray
import kotlin.system.measureTimeMillis

fun main () {
    ShellSortAlgorithm.sortArrayKotlinWay(veryLongUnsortedArray)
}

object ShellSortAlgorithm : SortAlgorithm {

    override fun sortArrayKotlinWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            var gap = array.size / 2
            while (gap > 0) {
                (gap until array.size).forEach { i ->
                    val newElement = array[i]
                    var j = i

                    while (j >= gap && array[j - gap] > newElement) {
                        array[j] = array[j - gap]
                        j -= gap
                    }
                    array[j] = newElement
                }
                gap /= 2
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }

    override fun sortArrayJavaWay(array: IntArray) {
        val timeInMillis = measureTimeMillis {
            var gap: Int = array.size / 2
            while (gap > 0) {
                for (i in gap..<array.size) {
                    val newElement: Int = array[i]
                    var j = i
                    while (j >= gap && array[j - gap] > newElement) {
                        array[j] = array[j - gap]
                        j -= gap
                    }
                    array[j] = newElement
                }
                gap /= 2
            }
        }
        array.printArray()
        timeInMillis.printTimeInMillis()
    }
}