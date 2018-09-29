package sortcompare

import java.util.*

class QuickSort {

    companion object {
        enum class PivotType { FIRST, LAST, RANDOM}

        fun IntRange.random() =
                Random().nextInt((endInclusive + 1) - start) +  start

        fun sort(unsortedList: ArrayList<Int>, pivotType: PivotType): ArrayList<Int> {
            if(unsortedList.size < 2) {
                return unsortedList
            }
            else {
                val i: Int = when(pivotType) {
                    PivotType.FIRST -> 0
                    PivotType.LAST -> unsortedList.size - 1
                    PivotType.RANDOM -> (0 until unsortedList.size).random()
                }
                val pivot = unsortedList.removeAt(i)

                val left = unsortedList.filter { it <= pivot } as ArrayList<Int>
                val right = unsortedList.filter { it > pivot } as ArrayList<Int>
                val sortedList: ArrayList<Int> = ArrayList()
                sortedList.addAll(sort(left, pivotType))
                sortedList.add(pivot)
                sortedList.addAll(sort(right, pivotType))
                return sortedList
            }
        }
    }
}