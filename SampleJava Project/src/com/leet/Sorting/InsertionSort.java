package com.leet.Sorting;

public class InsertionSort {

	
	public void sort(int a[]){
		
		for(int i=1; i<a.length; i++){
			
			int marker = a[i];
			
			int j= i-1;
			
			while(j>=0 && a[j] > marker){
				
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = marker;
		}
	}
	
	
	public static void main(String[] args) {

	}

}
