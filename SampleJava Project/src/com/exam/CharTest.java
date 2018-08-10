package com.exam;

public class CharTest {

	
	
	    public static void main(String[] args) {
	             //converts string to lowercase and replaces everything except numbers
	             // and alphabets
	        String s = "Ah, Satan sees Natasha ".toLowerCase().replaceAll("\\W", "");
	        int j=0;
	        int k = s.length() - 1;
	        while(j < s.length() / 2) { //loops until half the length of the string if 
	                                        //even and floor value if odd.
	            if (s.charAt(j++) != s.charAt(k--)){//check for first and last chars                                                                                                
	                                              //and  go inwards. if char do not match print 'Not a Palindrome' and exit 
	                System.out.println("Not a Palindrome");
	            System.exit(0);}
	        }
	        System.out.println("Palindrome");  //if every chars match print "Palindrome"
	    }
	
}
