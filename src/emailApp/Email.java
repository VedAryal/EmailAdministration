package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10 ;
	private String alternateEmail;
	private String companySuffix = "ArlCompany.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
	 
		// call a method asking for the department - and return the department.
		this.department = setDepartment();
		// System.out.println("Department: " + this.department);
		
		System.out.println("-----------------------------------------------------------------");
		
		//Call and method to generate random password 
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your company email is : " + email);
		
		System.out.println("-----------------------------------------------------------------");
		
		
		
		
	}
	
	// Ask for the department.
	private String setDepartment() {
		  System.out.print("New Worker: "+ firstName + "\nPlease enter Department code:\n1 for sales\n2 for developmenet\n3 for Accountant\n0 for none\nEnter the department");
		  		Scanner read = new Scanner(System.in);
		  		int departChoice = read.nextInt();
		  		if(departChoice == 1) {
		  			return "Sales";
		  		}else if (departChoice == 2) {
		  			return "Development";
		  		}else if (departChoice == 3) {
		  			return "Accountant";
		  		}else {
		  			return "";
		  		}
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// set mail box capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() { return password;}
	

	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
	}
	
	
	
}
