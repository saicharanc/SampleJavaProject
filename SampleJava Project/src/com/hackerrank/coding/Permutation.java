package com.hackerrank.coding;

public class Permutation {

	public static void main(String[] args) {
		
		String str = "abc";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n-1);
		
	}
	
	public void permute(String str, int l, int r){
		if (l==r)
			System.out.println(str);
		else{
			for(int i=l; i<=r; i++){
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}
	
	/**
	 * 
	 * @param str
	 * @param i position 1
	 * @param j position 2
	 * @return
	 */
	public String swap(String str, int i, int j){
		
		char[] s = str.toCharArray();
		char temp;
		temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		return String.valueOf(s);
	}

}
