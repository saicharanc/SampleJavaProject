package com.leet.Sorting;

import java.util.Arrays;

public class Anagrams {

	
	
	 public static boolean areAnagrams(String str1, String str2){
		 
		 if(str1.length() != str2.length()){
			 return false;
		 }
		 String str1UpperCase =  str1.toUpperCase();
		 String str2UpperCase =  str2.toUpperCase();
		 
		char[] str1_charArray = str1UpperCase.toCharArray();
		      Arrays.sort(str1_charArray);
		char[] str2_charArray =  str2UpperCase.toCharArray();
		 	  Arrays.sort(str2_charArray);
 		 return (Arrays.equals(str1_charArray, str2_charArray));
 			 
	 }
	 
	 
	public static void main(String[] args) {
			String str1 = "Reserved";
			String str2 = "reversed";
			
			System.out.println(areAnagrams(str1, str2));
		
	}

}
