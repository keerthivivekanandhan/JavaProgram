package Selenium;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Resultsolution {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = arr.size();

        // Calculate the sum of the primary diagonal
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i);
        }

        // Calculate the sum of the secondary diagonal
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i);
        }

        // Return the absolute difference between the two sums
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Resultsolution.diagonalDifference(arr);

        System.out.println(result);
       // bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}
