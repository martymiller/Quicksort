package com.sortcompare;

import java.util.*;

//Performs the Selection Sort algorithm. Performance is O(n^2)

class SelectionSort {

    static ArrayList<Integer> sort(final ArrayList<Integer> unsortedList) {
        final ArrayList<Integer> result = new ArrayList<>();
        final int originalSize = unsortedList.size();
        for (int i = 0; i < originalSize; i++) {
            int smallestIndex = findSmallestIndex(unsortedList);
            result.add( unsortedList.remove(smallestIndex));
        }
        return result;

    }

    private static int findSmallestIndex(final ArrayList<Integer> unsortedList) {
        int smallest = unsortedList.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < unsortedList.size(); i++) {
            if( unsortedList.get(i) < smallest) {
                smallest = unsortedList.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}





