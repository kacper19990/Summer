import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long highest = 0;
        long lowest = 2147483647;
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest){
                lowest =  arr[i];
            }
            if (arr[i] > highest){
                highest = arr[i];
            }
            total += arr[i];

        }
        long lowestr = total - highest;
        highest = total - lowest;
        System.out.println(lowestr + " " + highest);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
