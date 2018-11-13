import java.util.Scanner;


public class David {
	 
	    public static void main(String[] args) {
	        System.out.println("Enter a String: ");
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        sc.close();
	        int length = s.length();
	        char[] a = s.toCharArray();
	 
	        for (int i = 0; i < length; i++) {
	            for (int j = 0; j < i; j++)
	                System.out.print(a[j]);
	            System.out.println();
	        }
	        for (int i = length; i >= 0; i--) {
	            for (int j = 0; j < i; j++)
	                System.out.print(a[j]);
	            System.out.println();
	        }
	 
	    }

}
