
public class Notes {

	//Array is a collection of homogeneous elements. means elements of same data type.
	
	int a = 10;
	int b[] = {10, 20, 30, 40};
	
	//Anything you pass in the command line arguments will be taken as Strings only.
	//That Strings need to be converted in the required data format.
	//Java is said to be 70% component base 30% custom based 
	//Know how to google java api, with api you can find java docs and find the methods suitable for your requirement.


	//javac Example.java
	//gets converted to Example.class
	//java Example
	
	//Simple
	//Secure
	//portable
	//Robust
	//Architecturally neutral
	//multi threaded
	//distributed
	//interoperable
	//dynamic
	
	//polymorphism - method overloading
	
	//abstract key word- It is used to define the members of a class with no body. - Concrete methods

	//FINAL keyoword
	//you can not change a final variable, it is a constant.., you can not override a final method,
	//you cannot inherit a final class.
	// why do we inherit ? to change it behavior.


	//static key word
	// anything that is defined as static is a class member( at class level), they can be accessed by 
	//class name as well as with object. 
	//thats why class members take priority over object members .i.e., executed first.
	//other members are object members - you need objects to access those members.
	
	//ABSTRACT classes:
	//you cannot create objects for abstract classes
	//Objects cannot be instantiated for abstract classes.
	
	
	//static blocks
	static{
		//inside static block, some code...
	} //these blocks get executed prior to main method.
}


// YOU CAN NOT OVERRIDE STATIC METHODS IN JAVA
/*You can overload static method, that's ok. But you can not override a static method.
Static methods cannot be overridden because method overriding only occurs in the context of dynamic
(i.e. runtime) lookup of methods. Static methods (by their name) are looked up statically 
(i.e. at compile-time). Method overriding happens in the type of subtype polymorphism that exists in 
languages like Java and C++.*/