package assignment36;


import java.util.Arrays;

public class Special_Character {

	
	public static int Count = 0;
    public static int Count1 = 0;
    
	public static void main(String[] args) 
	{
	    String s = "swati #&";
	    
	    System.out.println("Lenght of String :");
	    System.out.println(s.length());
	    
	    char c1[] = s.toCharArray();
	    System.out.println(Arrays.toString(c1));
	    for(int i = 0; i < s.length(); i++)
	    {
	    	boolean ans = Character.isAlphabetic(c1[i]);
	    	System.out.println(ans);
	    	if(ans == true)
	    	{
	    		Count++;
	    	}
	    }
          
	    System.out.println(Count);
	    
	    
	    System.out.println(" finding Space ");
	    char c2[] = s.toCharArray();
	    System.out.println(Arrays.toString(c2));
	    for(int i = 0; i < s.length(); i++)
	    {
	    	boolean ans1 = Character.isSpaceChar(c2[i]);
	    	System.out.println(ans1);
	    	if(ans1 == true)
	    	{
	    		Count1++;
	    	}
	    }
	   
	    System.out.println(Count1);
	    System.out.println("Finding Spacial character :"); 
	    int c = s.length()-(Count+Count1);
	    System.out.println(c);
	}

}
