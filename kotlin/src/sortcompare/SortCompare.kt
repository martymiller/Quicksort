package sortcompare

import java.util.*

class SortCompare {

    fun init() {
        val sublistMin = 20

        val randonNumberQuanity = 5000

        print("Generating $randonNumberQuanity random numbers...")
        val unsortedList = ArrayList<Int>()
        for(i in 0 until randonNumberQuanity) {
            unsortedList.add( (0..randonNumberQuanity).random())
        }
        println("Done! \n")

        var startingTime: Long
        var finishingTime: Long
        var totalTime: Long

        //Quick Sort
        println("QuickSorting list of size $randonNumberQuanity\n")

        startingTime = System.currentTimeMillis()
        println("First Pivot: ${QuickSort.sort(unsortedList, QuickSort.Companion.PivotType.FIRST).subList(0,sublistMin)}")
        finishingTime = System.currentTimeMillis()
        totalTime = finishingTime - startingTime
        println("Time to complete ${totalTime.toFloat()/1000} seconds\n")

        startingTime = System.currentTimeMillis()
        println("Last Pivot: ${QuickSort.sort(unsortedList, QuickSort.Companion.PivotType.LAST).subList(0,sublistMin)}")
        finishingTime = System.currentTimeMillis()
        totalTime = finishingTime - startingTime
        println("Time to complete ${totalTime.toFloat()/1000} seconds\n")

        startingTime = System.currentTimeMillis()
        println("Random Pivot: ${QuickSort.sort(unsortedList, QuickSort.Companion.PivotType.RANDOM).subList(0,sublistMin)}")
        finishingTime = System.currentTimeMillis()
        totalTime = finishingTime - startingTime
        println("Time to complete ${totalTime.toFloat()/1000} seconds\n")

        println("")

        //Selection Sort
        startingTime = System.currentTimeMillis()
        println("SelectionSorting list of size $randonNumberQuanity\n")
        println(SelectionSort.sort(unsortedList).subList(0,sublistMin))
        finishingTime = System.currentTimeMillis()
        totalTime = finishingTime - startingTime
        println("Time to complete ${totalTime.toFloat()/1000} seconds\n")
    }

    fun IntRange.random() =
            Random().nextInt((endInclusive + 1) - start) +  start

}