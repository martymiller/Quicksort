package com.sortcompare;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class SortCompare {

    public static void main(String[] args) {
        final ArrayList<Integer> unsortedList = new ArrayList<>();
        final File file = new File("../random_numbers.txt");
        try {
            final BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                unsortedList.add(Integer.valueOf(st));
        } catch (Exception e) {
        }
        long startingTime, finishingTime;
        float totalTime;

        //Quick Sort
        startingTime = System.currentTimeMillis();
        System.out.print("Quick Sorting...");
        QuickSort.sort(unsortedList, QuickSort.PivotType.FIRST);
        System.out.println("DONE!");
        finishingTime = System.currentTimeMillis();
        totalTime = (float)(finishingTime - startingTime) / 1000f;
        System.out.println("Time to complete: " + totalTime + " seconds");

        //Selection Sort
        startingTime = System.currentTimeMillis();
        System.out.print("Selection Sorting...");
        SelectionSort.sort(unsortedList);
        System.out.println("DONE!");
        finishingTime = System.currentTimeMillis();
        totalTime = (float)(finishingTime - startingTime) / 1000f;
        System.out.println("Time to complete: " + totalTime + " seconds");
    }
}