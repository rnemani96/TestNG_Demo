package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG6 extends TestNG5 {
	@Test
	public void testB() {
		Reporter.log("testB()",true);
	}
	@Test
	public void test() {
		Reporter.log("test()",true);
	}
	}


