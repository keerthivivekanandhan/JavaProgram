package Selenium;

import java.util.Scanner;

public class secondlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,6,4,5};
		int size = array.length;
		int temp = 0;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}System.out.println(array[i]);
		}
System.out.println(array[size-2]);
	}

}
