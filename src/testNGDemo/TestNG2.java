package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
	@Test(priority=2)
	public void deleteuser() {
		Reporter.log("delete......",true);
	}
	@Test(priority=1)
	public void registeruser() {
		Reporter.log("registerr..............",true);
	}

}
