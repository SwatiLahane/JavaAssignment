package assignment46;

import java.util.Arrays;

public class Array {
     
	
	//WAP take a array of size 4 and 5
	public static void main(String[] args) 
	{
		//datatype variable[] = new datatype[size]
		
		int  Arr[] = new int[4];
		
		Arr[0] = 10; 
		Arr[1] = 20; 
		Arr[2] = 30; 
		Arr[3] = 40; 
		Arr[4] = 60; 
		
		
		System.out.println(Arrays.toString(Arr));
		try
 		{
			for(int i = 0; i <= 5; i++)
			{
				System.out.println(Arr[i]+" ");
				//System.out.println(Arrays.toString());
			}
			
		  
		 }
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception Handled");
		}

	}

}
