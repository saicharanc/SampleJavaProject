package com.hackerrank.coding;

public class FindingPairs {
	
	
	public  static void isAPair(int a1[], int a2[]){
		
		
		for (int i : a1) {
			
			for (int j : a2) {
				
				if(i==j)
				System.out.println(i +"," + j);
			}
			
		}
	}
	

	public static void main(String[] args) {
		int[] x = { 2, 3, 4, 5, 7, 9};
		int[] y = { 2, 7, 9, 0, 10, 1};
		isAPair(x, y);
		
		
	}

}
