import java.io.*;
import java.util.*;

public class Solution {
	//Link to Problem: https://www.hackerrank.com/challenges/library-fine
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int da = scanner.nextInt();
        int ma = scanner.nextInt();
        int ya = scanner.nextInt();
        
        int de = scanner.nextInt();
        int me = scanner.nextInt();
        int ye = scanner.nextInt();
        
        int fine = -1;
        if (ya > ye)
            fine = 10000;
        else if (ma > me && ya == ye)
            fine = 500 *(ma - me);
        else if (da > de && ma == me && ya == ye)
            fine = 15 * (da - de);
        else
            fine = 0;
        System.out.println(fine);
    }
}