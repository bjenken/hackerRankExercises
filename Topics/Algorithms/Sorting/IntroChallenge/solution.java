import java.io.*;
import java.util.*;

public class Solution {
	//Link to Problem: https://www.hackerrank.com/challenges/tutorial-intro
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int arrSize = scanner.nextInt();
        for(int i = 0; i < arrSize; i++){
            int curr = scanner.nextInt();
            if (curr == v){
                System.out.println(i);
                break;
            }
        }
    }
}