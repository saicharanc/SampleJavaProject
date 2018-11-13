
public interface Exampleinterface {
		
	//data variables
	
	int p = 10;   //need to be initialized.
	//by default the variables inside interface are public static and final.
	
	
	//data methods
	
	
	public void add();  //by default the methods inside interface are abstract.
						//Thats why no need to use the keyword abstract, preceding to method declaration.
		
}

//Interface inheritance uses 'implements' keyword. 

class A implements Exampleinterface{ //multiple inheritance allowed with interfaces 
									//but only one class can be extended.
	public void add() {
		//you have to override all the methods if you inherit an interface.
	}  
}