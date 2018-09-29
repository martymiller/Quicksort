package sortcompare

import java.util.*

class SelectionSort {

    companion object {
        fun sort(unsortedList: ArrayList<Int>): ArrayList<Int> {
            val sortedList: ArrayList<Int> = ArrayList()
            val originalSize = unsortedList.size
            for(i in 1..originalSize) {
                val smallestIndex = findSmallestIndex(unsortedList)
                val smallest = unsortedList.removeAt(smallestIndex)
                sortedList.add(smallest)
            }
            return sortedList
        }

        fun findSmallestIndex(unsortedList: ArrayList<Int>): Int {
            var smallest = unsortedList[0]
            var smallestIndex = 0
            unsortedList.forEachIndexed { index, i ->
                if (i < smallest) {
                    smallest = i
                    smallestIndex = index
                }
            }
            return smallestIndex
        }
    }
}