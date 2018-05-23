import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int lenght = arr.length;
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for (int anArr : arr) {
            if (anArr > 0) {
                pos++;
            } else if (anArr == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        pos = pos / lenght;
        neg = neg / lenght;
        zero = zero /  lenght;
        System.out.println(String.format("%5f", pos));
        System.out.println(String.format("%5f", neg));
        System.out.println(String.format("%5f", zero));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
