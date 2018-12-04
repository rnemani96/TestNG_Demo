package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
	@Test
	public void test() {
		Reporter.log("hiiii",true);
	}

}
