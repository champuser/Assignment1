package com.company;

import java.util.Scanner;

public class Assignment_Question {

    /*
    Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.

Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.

Example 1:

Input: [1, 2, 3, 4, 6], target=6 Output: [1, 3] Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

Example 2:

Input: [2, 5, 9, 11], target=11 Output: [0, 2] Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        int [] indices = getPair(arr,target);


    }

    public static int[] getPair(int[] arr, int target){

       // Approach 1

        int index1=0;
        int index2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    index1=i;
                    index2=j;
                }
            }
        }
        int result[]=  new int[]{index1,index2};
        return result;
    }
}
