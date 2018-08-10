package com.leet.Sorting;

public class BinarySearch {

	public void search(int value, int a[]){
		int lowindex = 0;
		int highIndex = a.length-1;
		
		while(lowindex <= highIndex){
			int middleindex = (lowindex + highIndex)/2;
			if (a[middleindex] < value){
				lowindex = middleindex;
			}
				else if(a[middleindex] > value){
					highIndex = middleindex;
				}
					else {
						System.out.println("value found at middle index " + middleindex);
						lowindex = highIndex+1;
					}
						
						
				}
			}
		
		
	
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int a[] = {1, 2, 3 ,4 ,5 ,6, 7}; 
		binarySearch.search(1, a);
	//	System.out.println( "value found at" + );
	}

}
