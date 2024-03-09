package Selenium;

public class alphacount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String values = "66687sasdasdssssssssssjjjjjjjjkkkkkkkkko";
		char arr[] = values.toCharArray();
		int count = 0;

		for (int i = 0; i < values.length(); i++) {
			if ((arr[i] > 'a' && arr[i] < 'z') 
					|| ((arr[i]) > 'A' && (arr[i]) < 'Z')) 
			
			{
				//System.out.print(arr[i]);
				count = 1;
				for(int k =i+1;k<values.length();k++) 
				{ 
					if(arr[i]==arr[k]) 
					{ 
						count++;
				  arr[k]='*';
				  
				  } 
					
				}
				System.out.println("character="+ arr[i]+" " +" ," +"count="+count);
			}
			// System.out.println("character ="+arr[i]+ " " + "count" +count);

		}

	}

}

  
  
 