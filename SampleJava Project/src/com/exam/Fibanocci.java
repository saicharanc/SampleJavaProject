package com.exam;

public class Fibanocci {

	
	public static int fibanocci(int n){
		
		int a =0; int b =1, c;
		
		if(n==0){
			return a;
		}
		if(n==1){					// a    b   c    c
									// 0    1   1    2     3    5    8  13   21
			return b;
		}
		
		for(int i=2; i<=n; i++){
			
			c = a +b;
			a = b;
			b = c;
			
		}
		return b;
		
		
	}
	
	
	public static void main(String[] args) {
				int n =9;
				
				System.out.println(fibanocci(n));
		
	}

}
