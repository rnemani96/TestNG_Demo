package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG5 extends TestNG4 {
	@Test
	public void testA() {
		Reporter.log("testA()",true);
	}
	

}
