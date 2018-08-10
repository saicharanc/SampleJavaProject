package com.exam;

import java.util.Scanner;

public class Palendrome {

	
	
	    public static void main(String[] args) {
	            
	        System.err.println("Enter a String");      
	    	Scanner userInput = new Scanner(System.in);
	    	String str = userInput.nextLine();
	    	
	    	//converts the string to lower case and replaces everything except numbers and alphabets
	        String s = str.toLowerCase().replaceAll("\\W", "");
	        
	        int j=0;
	        int k = s.length() - 1;
	        
	        while(j < s.length() / 2) { 
	                                        
	            if (s.charAt(j++) != s.charAt(k--)){                                                                                
	                                              
	                System.out.println("NO");
	            System.exit(0); 
	            }
	        }
	        System.out.println("YES");  
	    }
	
}
