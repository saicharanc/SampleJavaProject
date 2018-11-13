import java.util.Date;
import java.io.*;

import com.sun.xml.internal.fastinfoset.stax.events.ReadIterator;


public class Example {
//class is a template to create data members - data variables + data methods
	//data variables used to hold and represent data
	// data methods used to hold and represent functionality
	
	int a;  //data variables  //we have to ensure that our data variables are initialized 
	int b;	// since we need objects to access our data members
	//and also we need a constructor to create objects. So, why shouldn't I pass the control of initializing objects to 
	//the constructor.It is not mandatory to do that. But it is a good practice.
	
	public Example() {
		a = 10;
		b = 30;
	}
	
	public Example(int p, int q) {  //same method name with different parameters is called method overloading. 
		a = p;
		b = q;
	}

	public void add(){ //data methods 
		
		int c;  //the scope of this c is only inside this method
		c = a+b;
		
		System.out.println("The value of c is : "+ c); //inside the System class, out object we have a method called 
														//println to print or display stuff to console.
	}
	
	public static void main(String[] args) {  //The arguments you pass in the command line will be copied to the string[] args array.
		//Example e = new Example();
		Example e = new Example(30, 40); //new keyword allocates memory to the object
		//we can access the data members of a class only thru objects
		
		e.a = Integer.parseInt(args[0]);
		e.b = Integer.parseInt(args[1]); // we can also access data members with the dot(.) operator. like objet.member
		e.add();
		
		
		Date d = new Date();
		System.out.println(d.getDate());
		System.out.println(new Date());
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
			try {				//user can understand try catch custom messages, prefer try catch always.
				e.a =Integer.parseInt(br.readLine());
			} catch (Exception e1) {
				System.out.println("custom message");
			}
		
		
	}
	
}
