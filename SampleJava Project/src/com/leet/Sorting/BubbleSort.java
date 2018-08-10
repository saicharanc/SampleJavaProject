package com.leet.Sorting;

public class BubbleSort {

	public void sort(int a[]){
		
		for(int i=a.length-1; i>0; i--){
			for( int j=0; j<i; j++){
				
				if(a[j] > a[j+1]){
				int	temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
				
			}
		}
	}
	public void printArray(int a[]){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int a[] = { 34, 78, 21, 8, 10, 9};
		bubbleSort.sort(a);
		bubbleSort.printArray(a);
		
	}
	
}
