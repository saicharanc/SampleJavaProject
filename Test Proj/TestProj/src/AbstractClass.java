
public abstract class AbstractClass { // abstract class may or may not have abstract methods

	public void add(){    // not an abstarct method, you can use it directly. 
		
	}
//RULE:	
// Subclasses of an abstract class must implement (override) all abstract methods of its abstract superclass. 
//The non-abstract methods of the superclass are just inherited as they are. 
//They can also be overridden, if needed.
	
	abstract public void sub(); // if you want to use this method, you have to override it.
								// over ride it and write  your logic to it and then use it.
								//this is a concrete method.
		
}   //IMP: //you cannot create objects for abstract classes
		  //Objects cannot be instantiated for abstract classes. so what should we do? 
		 // we have to inherit the abstract class and thru child class only we can access the members of the abstract class.

//Abstract classes can have both abstract methods and non abstract methods.
//thats why we use abstract keyword to differentiate

//Area is an example for abstract method
//Implementation could be area of a circle, triangle or any other polygon etc..