import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	//Link to Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jumpCount = 0;
        int currInd = 0;
        while (1 == 1){
            if (currInd == n-1)
                break;
            else if (currInd < n-2){
                if (c[currInd + 2] == 0){
                    jumpCount++;
                    currInd += 2;
                }else {
                    jumpCount++;
                    currInd++;
                }
            }else {
                jumpCount++;
                currInd++;
            }
        }
        System.out.println(jumpCount);
    }
}
