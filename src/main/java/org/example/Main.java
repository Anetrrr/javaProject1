package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//3. ⁠Write a program to find the largest number in an array
//    array    int[] arrayOfInt = { 22, 54, 332, 5958, 332, 985};
//        List<Integer> newList = new ArrayList<>();
//
//        for (int i = 0; i < arrayOfInt.length; i++) {
//            newList.add(arrayOfInt[i]);
//        }
//
//        int MaxNumInArray = Collections.max(newList);
//
//        System.out.println("The largest number in the arrayOfInt array is " + MaxNumInArray);

//#2 Write a program that finds the duplicate number in aan array of integers

        int[] arrNew = new int[] { 22, 43, 332, 23, 23, 22, 55, 12};
        for (int i=0; i < arrNew.length; i++) {
            for (int j = i+1; j < arrNew.length; j++) {
                if (arrNew[i] == arrNew[j]){

                    System.out.println(arrNew[j]);
                }
            }
        }



    }

        /*
        2. ⁠Write a program that finds the duplicate number in an array of integers
        */









    public static boolean checkValue(int[] numbers, int target) {
        for (int num : numbers) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

        /*
        2. ⁠Write a program that finds the duplicate number in an array of integers
        */









}

