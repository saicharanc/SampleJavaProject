package com.fun.codewars;

public class Counter {

	
	
	public int countSheeps(Boolean[] arrayOfSheeps) {
		int count = 0;
		for(int i =0; i< arrayOfSheeps.length; i++){
			if(arrayOfSheeps != null){
			if(arrayOfSheeps[i]  == true){
				count ++;
			}
		  }
		}
		return count; 
		
	}
	public static void main(String[] args) {
		
		
	}

}
