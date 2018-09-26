package com.sortcompare;

import java.util.*;

public class QuickSort {

    enum PivotType {RANDOM, FIRST, LAST}

    static ArrayList<Integer> sort(final ArrayList<Integer> unsortedList, final PivotType pivotType) {

        if (unsortedList.size() < 2) {
            return unsortedList;

        } else {
            int pivot = unsortedList.remove(0);
            final ArrayList<Integer> left = new ArrayList<>();
            final ArrayList<Integer> right = new ArrayList<>();

            for (Integer item : unsortedList) {
                if (item <= pivot) {
                    left.add(item);
                } else {
                    right.add(item);
                }
            }
            final ArrayList<Integer> sortedList = new ArrayList<>();
            sortedList.addAll(sort(left, pivotType));
            sortedList.add(pivot);
            sortedList.addAll(sort(right, pivotType));
            return sortedList;
        }
    }
}