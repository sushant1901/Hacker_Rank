package com.company;
import java.io.*;
import java.util.*;

public class Solution23 {
    static int minSwap(int arr[],int n,int k){
        int count=0;
        for(int i=0;i<n;++i)
            if(arr[i]<=k)
                ++count;
        int bad=0;
        for(int i=0;i<count;++i)
            if(arr[i]>k)
                ++bad;
        int ans=bad;
        for(int i=0,j=count;j<n;++i,++j){
            if(arr[i]>k)
                --bad;
            if(arr[j]>k)
                ++bad;
            ans = Math.min(ans,bad);
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int n= sc.nextInt();
        int kcount =0;
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println(minSwap(arr,n,k)+"\n");

    }
}