package com.coding.graphs;

public class ServerTrack{
	  
	
	/**
	 *  Utility function that puts all non-positive numbers on left side of 
	 * arr[] and return count of such numbers.
	 * @param arr
	 * @param size
	 * @return
	 */
	  static int seperate(int[] arr, int size){
	   
	        int i, j =0;
	  
	    for(i =0; i< size; i++){
	        if(arr[i] <= 0 ){
	          
	          int temp; 
	      temp = arr[i];
	      arr[i] = arr[j];
	      arr[j] = temp;
	      
	      j++;
	     }
	   }
	    return j;    
	  }
	  
	  /**
	   * Find the smallest positive missing number in an array that 
	   * contains both positive and negative integers 
	   * @param arr
	   * @param size
	   * @return
	   */
	   public static int isMissingNumber(int[] arr, int size){
	      
	     int shift =  seperate(arr, size);
	     int newarr[] =  new int[size - shift];
	     int j =0;
	     for(int i = shift; i < size; i++){
	      
	       newarr[j]  = arr[i];
	        j++;
	      }
	     
	      return theMissingPositiveNumber(newarr , j);
	   }
	  
	  /**
	   * Finds the smallest positive missing number in the array that contains  
	   * all positive integers 
	   * @param arr
	   * @param size
	   * @return
	   */
	  public static int theMissingPositiveNumber(int arr[], int size){
	    
	    int i;
	    
	      /* Marking arr[i] as visited by making 
	       arr[arr[i] - 1] negative. Also I'm subtracting 1  because index start 
	       from 0 and positive numbers start from 1 */
	    for(i =0; i < size; i++){
	     
	      if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) -1] > 0 )
	       
	        arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
	        
	      }
	      
	    
	      /* Return the first index value at which 
	       is positive */
	      for(i =0; i<size; i++){
	       if(arr[i] > 0) 
	         return i+1;  
	      }

	     return size + 1;
	  }
	  
	  /**
	   * main function or driver function
	   * @param args
	   */
	  public static void main(String args[]){
	    int arr[] = { -1, -3, 1, 5};
	    int size = arr.length;
	    int missedNumber = theMissingPositiveNumber(arr, size);
	    System.out.println( "The smallest number that is missing is :" +  missedNumber);
	  }
	}
	  
