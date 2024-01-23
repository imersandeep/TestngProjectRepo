package testNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderinTestNG
{
	@Test(dataProvider="getdata")
	public void datp(String urname ,String passwd) {
	System.out.println(urname );
	System.out.println(passwd );

	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data=new Object[3][2];
		
		data[0][0]="1232";
		data[0][1]="12@312";
		
		data[1][0]="12323";
		data[1][1]="12@312";
		
		data[2][0]="12324";
		data[2][1]="12@3245";
		return data;

		
		
	}

}
