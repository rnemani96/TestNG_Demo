package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG4 {
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method",true);
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("after method ",true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("before class ",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("after class ",true);
	}
	
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("before suite ",true);
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite ",true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test ",true);
	}
	
	@AfterTest
	public void aftertestd() {
		Reporter.log("after test",true);
	}

}
