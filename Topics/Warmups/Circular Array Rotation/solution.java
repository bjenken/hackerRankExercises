import java.io.*;
import java.util.*;

public class Solution {
	
	//link to problem: https://www.hackerrank.com/challenges/circular-array-rotation

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int rotations = scanner.nextInt();
        int displayNum = scanner.nextInt();
        
        int reducedRotations = rotations % arrSize;
        
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize; i++)
            arr[i] = scanner.nextInt();
        

        for (int i = 0; i < displayNum; i++){
            int currIndex = scanner.nextInt();
            if (currIndex - reducedRotations >= 0)
                System.out.println(arr[currIndex-reducedRotations]);
            else
                System.out.println(arr[currIndex-reducedRotations + arrSize]);
        }
    }
    
}