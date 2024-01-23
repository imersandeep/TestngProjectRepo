package testNGPackage;

import org.testng.annotations.Test;

public class SecondTestngClass {
	@Test
	public void usersignin() {
		System.out.println("user Sign in");
	}
	
	@Test 
	public void membersingin() {
		System.out.println("This is Member singin");
	}
	
	@Test 
	public void customersingin() {
		System.out.println("This Customer signin");
	}
}
