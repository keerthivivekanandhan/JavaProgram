
package Selenium;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
        
    long min=arr.get(0);
    long max=arr.get(0);
    long totalsum=0;
   // long minsum=0;
    
    for(int i=0;i<(arr.size());i++)
    {
        
            if(max<arr.get(i)|| max == arr.get(i))
                    
                
            {
                max = arr.get(i);
            }
        
    
    
        
        
            if(min>arr.get(i) || min == arr.get(i))
                    
                
            {
                min=arr.get(i);
            }
       totalsum+=arr.get(i); 
     
    }
   // System.out.println(min);
    
System.out.println((totalsum-max) +" "+ (totalsum-min));

    }

    }



public class Minmaxsum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}


// Another way

/*
 * import java.util.*;
 * 
 * class Result { public static void miniMaxSum(List<Integer> arr) { long min =
 * Collections.min(arr); long max = Collections.max(arr); long totalSum = 0;
 * 
 * for (int num : arr) { totalSum += num; }
 * 
 * System.out.println((totalSum - max) + " " + (totalSum - min)); } }
 * 
 * public class Solution { public static void main(String[] args) { Scanner
 * scanner = new Scanner(System.in); List<Integer> arr = new ArrayList<>();
 * 
 * for (int i = 0; i < 5; i++) { arr.add(scanner.nextInt()); }
 * 
 * Result.miniMaxSum(arr); scanner.close(); } }
 */