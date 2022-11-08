import java.io.*;
import java.util.*;

public class Solution {
    public static boolean frustatingNum(int n)
    {
        int[] freq = new int[10];
        String val = "" + n + n * 2 +n * 3;
        for (int i = 0; i < val.length(); i++)
        {
            int digit = val.charAt(i) - '0';
            if (freq[digit]>0 && digit != 0)
                return false;
            else
                freq[digit]++;
        }
        for (int i = 1; i < freq.length; i++)
        {
            if (freq[i] == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n =sc.nextInt();
        // Not a valid number
        if (n < 100)
            System.out.println("0");

        else
        {
            boolean ans = frustatingNum(n);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
        }
    }
}
