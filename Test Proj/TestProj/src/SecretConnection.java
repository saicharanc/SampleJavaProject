import java.io.Serializable;


public class SecretConnection implements Serializable {


	private static SecretConnection singleInstance;

	private String s;

	private SecretConnection(){

		s = "Hello world";
	}


	public static SecretConnection getInstance(){
		
		if(singleInstance == null){
			
		synchronized(SecretConnection.class){

			 if(singleInstance == null)
				singleInstance	 = new SecretConnection();

		}
	}	
		return singleInstance; 
	
}

	public static void main(String[] args) {

		SecretConnection  x  = SecretConnection.getInstance();

		SecretConnection y = SecretConnection.getInstance();



	}


}
