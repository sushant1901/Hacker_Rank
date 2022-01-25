package com.company;

import java.util.*;
import java.io.*;
class Calc{
    public int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n,p);
    }
}
//Write your code here

class Solution14{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calc myCalculator = new Calc();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
