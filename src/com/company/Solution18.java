package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution18 {


    public static double medianOfArrays(int[] arr1,int[] arr2){
        double median;
        int j=0;
        int[] arr= new int[arr1.length + arr2.length];
        for(int i=0;i<arr.length;i++){
            if(i<arr1.length){
                arr[i]= arr1[i];
            }else{
                if(j<arr2.length){
                    arr[i]= arr2[j];
                    j++;
                }
            }
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            int k=arr.length/2-1;
            int m=k+1;
            double sum=(arr[k]+arr[m]);
            median = sum/2;
        }else{
            int k=arr.length/2;
            median=arr[k];
        }
        return median;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;++i)
            arr1[i]=sc.nextInt();

        for(int i=0;i<n2;i++)
            arr2[i]=sc.nextInt();

        System.out.println(medianOfArrays(arr1,arr2));
    }
}