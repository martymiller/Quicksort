package sortcompare

import java.util.*

class SelectionSort {

    fun sort(unsortedList: ArrayList<Int>): ArrayList<Int> {
        val sortedList: ArrayList<Int> = ArrayList()
        val originalSize = unsortedList.size - 1
            for(i in 0..originalSize) {
                val smallestIndex = findSmallestIndex(unsortedList)
                val smallest = unsortedList.removeAt(smallestIndex)
                sortedList.add(smallest)
            }
            return sortedList
        }

    fun findSmallestIndex(unsortedList: ArrayList<Int>): Int {
        var smallest: Int = 0
        var smallestIndex: Int = 0
        unsortedList.forEachIndexed { index, i ->
            run {
                if (i < smallest) {
                    smallest = i
                    smallestIndex = index
                }
            }
        }
        return smallestIndex
    }
}