package Selenium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Resul {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    
    int count =n;
    int k =0;

    for(int i=0;i<count;i++)
    {
        
        for(k =count-i;k>1;k--)
        {
            System.out.print(" ");
        }
        for(int j=i;j>=0;j--)
        {

            System.out.print("#");
        }
        
        System.out.println();
    }
    }

}

public class Printingrightsidetriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Resul.staircase(n);

        bufferedReader.close();
    }
}
