 package emailApp;

public class EmailApp {

	public static void main(String[] args) {
	
		Email em1 = new Email("John", "Aryal"); 
	System.out.println(em1.showInfo());
	
	System.out.println("--------------------------------------------");
	
	
	Email em2 = new Email("John", "snow");
	System.out.println(em2.showInfo());
		

	}

}
