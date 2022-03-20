package edu.neu.csye6200;

public class ConvertUtility {

	public static int returnInt(String string) {
		// TODO Auto-generated method stub
		
		try {
		return Integer.parseInt(string);
		}
		catch(NumberFormatException e) {
		System.out.println("\nID can only be a integer value");
		e.printStackTrace();
		}
		return 0;
	}	
	
	
	public static double returnDouble(String string) {
		// TODO Auto-generated method stub
		
		try {
		return Double.parseDouble(string);
		}
		catch(NumberFormatException e) {
		System.out.println("\nPrice can only be a double value");
		e.printStackTrace();
		}
		return 0;
	}		
}
