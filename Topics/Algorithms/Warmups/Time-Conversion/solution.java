import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		//Link to problem: https://www.hackerrank.com/challenges/time-conversion
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.contains("AM")){
            if (input.startsWith("12"))
                System.out.println("00".concat(input.substring(2, 8)));
            else
                System.out.println(input.substring(0, 8));
        }
        else{
            if (!input.startsWith("12")){
                int hours = Integer.parseInt(input.substring(0,2)) + 12;
                String hoursStr = "" + hours;
                System.out.println(hoursStr.concat(input.substring(2,8)));
            }else
                System.out.println(input.substring(0, 8));
            
        }
    }
}