package testNGPackage;

import org.testng.annotations.Test;

public class FirstTestngClass {
	
	@Test (groups= {"Login"})
	public void usersignup() {
		System.out.println("user Signup");
	}
	
	@Test
	public void membersingup() {
		System.out.println("This is Member singup");
	}
	
	@Test
	public void customersingup() {
		System.out.println("This Customer signup");
	}
	
	@Test (dependsOnMethods= {"customersingup"})
	public void customerdetails() {
		System.out.println("This Customer Details");
	}

}
