import java.util.Scanner;



class NumOfOccurances {

    static final int MAX = 256;
 		
    static void getOccurancesOfAString(String str ){
 				
        int count[] = new int[MAX]; //creating an array with max 265 because of Ascii
        int length = str.length();
 
			for(int i=0; i<length-1; i++){ 		//Intializing count array index
      		count[str.charAt(i)]++;
      }
 
 			char ch[] = new char[str.length()];	//creating an array of the given string size
      for(int i=0; i<length; i++){
      ch[i] = str.charAt(i);
      	int find = 0;
        for(int j=0; j<=i; j++){
        	
        	if(str.charAt(i) == ch[j])  //if it finds any matches
          find ++;
        }
        
        if(find ==1){
          	System.out.println("number of occurances of" + str.charAt(i) + " is : " + count[str.charAt(i)]);
          }
      }
      
     
      
 }
 
 			public static void main(String args[]){
 				Scanner sc = new Scanner(System.in);
 				String str = "paypal";
 				getOccurancesOfAString(str);
     }  
 }