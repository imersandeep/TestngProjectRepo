package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotaions {
	@BeforeSuite
	public void testsuite() {
		System.out.println("This is before suite");
	}
	@BeforeTest
	public void beofretest() {
		System.out.println("This is before test");
	}
	@BeforeClass
	public void beofreclass() {
		System.out.println("This is before Class ");
	}
	@BeforeMethod
	public void beofremethod() {
		System.out.println("This is before method ");
	}
	@Test
	public void testmetnod() {
		System.out.println("This is Test Method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is after Method ");
	}
@AfterClass
public void afterclass() {
	System.out.println("This is after Class ");
}
@AfterTest
public void aftertest() {
	System.out.println("This is after Test ");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is after suite ");
}
}
