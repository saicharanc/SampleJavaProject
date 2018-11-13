
public class ChildSample extends ParentSample{
	
	static{
		System.out.println("isnide static block");
	}
	
	public void childMethod(){
		System.out.println("inside child method...");
	}
	
	public void hi(){  //if you're not satisfied with the parent class method behaviour, 
	                  // you can override it and change change the logic
		System.out.println("hi dawww..!");
	}
	
	public static void main(String[] args) {
		ChildSample cs = new ChildSample();
		cs.childMethod();
		cs.hello();//accessing parent class method  here with child class object
		//vice versa is not possible. parent class object cannot access the child class method.
		cs.hi(); // accessing child class over riden method.
		ParentSample ps = new ParentSample();
		ps.hi(); //accessing parent class method.
	}
}
