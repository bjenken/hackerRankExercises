import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		//Link to Problem: https://www.hackerrank.com/challenges/manasa-and-stones
        Scanner scanner = new Scanner(System.in);
  
        int numTests = scanner.nextInt();
        int[][] values = new int[numTests][3]; //[3] -> height of tree, a, b 
        for (int i = 0; i < numTests; i++){
            for (int j = 0; j < 3; j++){
                values[i][j] = scanner.nextInt();
            }
            int a = Math.min(values[i][1], values[i][2]);
            int b = Math.max(values[i][1], values[i][2]);
            
            int diff = b - a;
            int stones = values[i][0]-1;
            int curr = a*stones; //min
            int max = b*stones;
            
            if (a == b) //aka no diff, infinite loop condition
                System.out.print(curr + " ");
            else{
                while(curr <= max){
                    System.out.print(curr + " ");
                    curr+=diff;
                }
            }
            System.out.println("");
        }
        
    }
    
  
}