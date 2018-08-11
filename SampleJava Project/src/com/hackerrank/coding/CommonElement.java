package com.hackerrank.coding;

public class CommonElement {

	public int isCommon(int[] a1, int[] a2 ){
		
		int count =0 ;
		
		for (int element1 : a1) {
			
			for (int element2 : a2) {
				
				if(element1 == element2) count ++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		int[] x = { 2, 3, 4, 5, 7, 9};
		int[] y = { 2, 7, 9, 0, 10, 1};
		
		CommonElement commonElement = new CommonElement();
		System.out.println(commonElement.isCommon(x, y));
	}

}
