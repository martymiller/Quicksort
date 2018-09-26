package sortcompare

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class SortCompare {

    fun init() {
        val unsortedList = ArrayList<Int>()
        val file = File("../random_numbers.txt")
        try {
            val br = BufferedReader(FileReader(file))
            var st = br.readLine()
            while(!st.isNullOrEmpty()) {
                unsortedList.add(Integer.valueOf(st))
                st = br.readLine()
            }
        }
        catch(e: Exception) {}

        var startingTime: Long = 0L
        var finishingTime: Long = 0L
        var totalTime: Float = 0F

        //Quick Sort


        //Selection Sort
        startingTime = System.currentTimeMillis()
        print("Selection Sorting...")
        println(SelectionSort().sort(unsortedList))
        println("DONE!")
        finishingTime = System.currentTimeMillis()
        totalTime = (finishingTime.toFloat() - startingTime.toFloat()) / 1000
        println("Time to complete: $totalTime seconds")
    }

}