package testNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTestNGClass {
	@Parameters({"URL"})
	@Test 
	public void  managerlogin(String baseurl) {
		System.out.println(baseurl);
		
	}
	

}
