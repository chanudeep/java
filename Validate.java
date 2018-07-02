package Validate;

import java.util.regex.Pattern;


public class Validate {
	
	public static boolean ValidateName(String name){
		if(Pattern.matches("[a-zA-Z]{5,15}",name)){
			return true;
		}
		else{
			System.out.println("The user name should be between 5 to 15 characters");
			return false;
		}
		
	}
	
	public static boolean ValidateAge(String age){
		if(Pattern.matches("[0-9]{1,2}",age)){
			return true;
		}
		else{
			System.out.println("The Age should be between 1 and 100");
			return false;
		}
	}
	
	public static boolean ValidateNo(String phoneno){
		if(phoneno.length()==10){
		return true;
		}
		else{
			System.out.println("The Phone number should be between 10 digits");
			return false;
		}
	}
	
	public static boolean ValidateDesc(String desc){
		if(Pattern.matches("[a-zA-Z0-9]{10,40}",desc)){
			return true;
		}
		else{
			System.out.println("Description can be maximum 40 characters");
			return false;
		}
	}
	
}
