package com.sortcompare

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class SortCompare {

    fun main( args: Array<String>) {
        val unsortedList = ArrayList<Int>()
        val file = File("../random_numbers.txt")
        try {
            val buffer = BufferedReader(FileReader(file))
            var st = buffer.readLine()
            while((!st.isNullOrEmpty())) {
                unsortedList.add(Integer.valueOf(st))
                st = buffer.readLine()
            }
            print(unsortedList)
        }
        catch(e: Exception) {}
    }
}