import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        String[] stairs = new String[n];
        int j = n -1;
        for (int x = 0; x < n; x++){
            Arrays.fill(stairs, " ");
        }
        do{
            stairs[j] = "#";
            for (int x = 0; x < n; x++){
                System.out.print(stairs[x]);
            }
            System.out.println();
            j--;
        }while (j >= 0);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
