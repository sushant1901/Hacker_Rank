package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution17 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr1=new String[n];
        String[] arr2=new String[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextLine();
        }
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i].contains("HR")==true)
            {
                arr2[count]=arr1[i];
            }

        }
        if(count>0)
        {
            System.out.println(count);
            for(int i=0;i<count;i++)
            {
                System.out.println(arr2[i].toUpperCase());
            }
        }
        else{
            System.out.println("-1");
        }
    }
}