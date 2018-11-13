import java.util.Date;


public class Driver {

	
	
	public static void main(String[] args) {

		
		Person p1 = new Person();
		p1.setAge(11);			
		p1.setDob(new Date());		
		p1.setFname("sai");
		p1.setLname("charan");
		
		
		Person p2 = new Person();
		p2.setAge(11);			
		p2.setDob(new Date());		
		p2.setFname("sai");
		p2.setLname("charan");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
		
	}

}
