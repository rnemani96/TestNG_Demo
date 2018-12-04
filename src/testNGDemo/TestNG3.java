package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG3 {
	@Test
	public void registeruser() {
		Reporter.log("register......",true);
	}
	@Test(dependsOnMethods="registeruser")
	public void deleteuser() {
		Reporter.log("delete........",true);
	}
	

}
