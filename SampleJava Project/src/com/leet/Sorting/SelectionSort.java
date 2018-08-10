package com.leet.Sorting;

//Step 1 − Set MIN to location 0
//Step 2 − Search the minimum element in the list
//Step 3 − Swap with value at location MIN
//Step 4 − Increment MIN to point to next element
//Step 5 − Repeat until list is sorted
										   // since it has 2 for loops.Time complexity best & worst O(n2)
public class SelectionSort {						//  i      j

	public void sort(int arr[]){					// 64	  25	 12		22		11	
		
		for(int i=0; i<arr.length-1; i++ ){
			
			int min_index = i; // Set MIN to location 0
			
			for(int j=i+1; j<arr.length; j++){    
				 
				if(arr[j] < arr[min_index]){    //Search the minimum element in the list
					min_index = j;				
				}
				
				//swap the found minimum element with the first element in the list
				
			}	
			
			int	temp = arr[min_index] ;		//Swap with value at location MIN
			arr[min_index] = arr[i];			
			arr[i] = temp;
			
		}
	
	}
	
}
