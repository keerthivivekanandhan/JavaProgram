package Selenium;

public class Printalphacount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String values = "aei342ou8798";
		char[] array= values.toCharArray();
		char[] vowels = {'a','e','i','o','u'};
		int count =0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<vowels.length;j++)
			{
				if(array[i]==vowels[j])
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
