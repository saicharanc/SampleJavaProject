package com.leet.Sorting;

public class Palindrome {
	
	
	public static int reverse(int num){
		
		int reverse_num = 0;   //334
		while(num > 0){
			int remainder = num % 10 ;
			 reverse_num = reverse_num * 10 + remainder;
			 num  /= 10;
		}
		return reverse_num;
	}

	public static boolean isPalindrome(int num){
		return(num == reverse(num));
		
	}
	
	public static void main(String[] args) {
	
		System.out.println(isPalindrome(334));
	}
	
}
