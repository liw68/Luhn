package luhn;

import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.*;
import java.io.*;


public class Main 
{
	public static boolean Checkluhn(String mod10)throws LuhnException

	{
		
		int sum = 0;
		
		boolean alt = false;
		
		if(!(mod10.length()==16)) {
			throw new LuhnException("\n" + "Luhn must be 16 digits");
			
		}
		
		else {
	
	
			for(int i = mod10.length() - 1; i >= 0; i--) {
			
				int n = Integer.parseInt(mod10.substring(i, i + 1));
				
				if (alt) {
						
						n *= 2;
						
						if (n > 9)
						{
							
							n = (n % 10) + 1;
							
						}
					}
					
				sum += n;
				alt = !alt;
				
				
				}
					
	
			
				return (sum % 10 == 0);
	
	
				
			}
	
	};
	

	public static void main(String[] args) throws LuhnException 
	{
	
		String mod10 = "8756896056000870";
		
		
		try {
		
		Checkluhn(mod10);
		}
		catch(Exception e){
			
			System.out.println("A problem occured:" + e);
			
		}
		
		
		
		
		boolean result = Checkluhn(mod10);
		
		if (result) {
			
			System.out.println("Luhn Passed");
		}
		
		else {
			
			System.out.println("Luhn Failed");
		}
		
		
		
		
	}
		

	
		
}	
	
	
		

	
