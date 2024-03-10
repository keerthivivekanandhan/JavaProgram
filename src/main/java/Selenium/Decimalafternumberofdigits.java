package Selenium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Res {

  public static void plusMinus(List<Integer> arr) {
        
        int n = arr.size();
        int positivecount =0;
        int negativecount=0;
        int zeroscount=0;
        double postivevalues;
        double negativevalues;
        double zerovalues;
        
    // Write your code here
    
    for(int i=0;i<n;i++)
    {
        if((arr.get(i))>0)
        {
            positivecount++;
        }
        else if((arr.get(i))<0)
        {
            negativecount++;
        }
        else
        {
        zeroscount++;    
        }
    
    }
        postivevalues=(double)positivecount/n;
        negativevalues=(double)negativecount/n;
        zerovalues=(double)zeroscount/n;
        
    
System.out.println(String.format("%.6f", postivevalues));

System.out.println(String.format("%.6f", negativevalues));

System.out.println(String.format("%.6f", zerovalues));



    }

}

public class Decimalafternumberofdigits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = 
        		new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = 
        		bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Res.plusMinus(arr);

        bufferedReader.close();
    }
}
