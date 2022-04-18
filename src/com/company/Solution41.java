package com.company;
import java.io.*;
import java.util.*;

public class Solution41 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int len1=sc.nextInt();
        int nums1[]=new int[len1];
        for(int i=0;i<len1;i++)
            nums1[i]=sc.nextInt();
        int len2=sc.nextInt();
        int nums2[]=new int[len2];
        for(int i=0;i<len2;i++)
            nums2[i]=sc.nextInt();

        int len3 = len1 + len2;
        int sum;
        int result;
        int[] arr = new int[len3];

        for(int i = 0; i < len1; i++){
            arr[i] = nums1[i];
        }
        for(int i = 0; i < len2; i++){
            arr[len1 + i] = nums2[i];
        }
        Arrays.sort(arr);

        if(len3%2 == 0){
            sum = arr[len3/2 - 1] + arr[len3/2];
            result = sum/2;

        }
        else
        {
            result = arr[len3/2];

        }
        System.out.println(result);
    }
}