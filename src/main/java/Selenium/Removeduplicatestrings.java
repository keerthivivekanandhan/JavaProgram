package Selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicatestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String duplicatevalues ="my my name name is naveen naveen";
		String[] splitter = duplicatevalues.split(" ");
		int size = splitter.length;
		
		Set<String> removeduplicate = new LinkedHashSet<>();
		for(String values:splitter)
		{
			removeduplicate.add(values);
		}
		
	//String values = removeduplicate.toString();
	System.out.println(removeduplicate);
	
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
		if(splitter[i].equals(splitter[j]))
		{
			splitter[j]="#";
		}
		}
		
	}
	for(int k=0;k<size;k++)
	{
		if(splitter[k]!="#")
		{
			System.out.print (splitter[k]+" ");
		}
	}
	
	}

}
