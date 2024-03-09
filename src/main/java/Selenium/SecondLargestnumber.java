package Selenium;
import java.io.*;
import java.util.*;

class resultssecondlargest {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void secondlargest(List<Integer> arr) {
    // Write your code here
    int size = arr.size();
        
       arr.sort(Comparator.naturalOrder());
       
       System.out.println(arr.get(size-1));
}
}
public class SecondLargestnumber {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = 
        		new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = 
        		bufferedReader;

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        resultssecondlargest.secondlargest(arr);

        bufferedReader.close();
    

}
}
