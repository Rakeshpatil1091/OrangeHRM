package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {

	@Test
	public void test_login()
	{
		try
		{
		logger.info("**** Starting TC_OO1_LoginTest *****");
	
		LoginPage lp=new LoginPage(driver);
		logger.info("Providing login details");
		
		lp.setUsername(rb.getString("username")); //valid email , get it from config.properties
		lp.setPassword(rb.getString("password")); // valid password, get it from config.properties
		lp.clickLogin();
		logger.info("clicked on Login button");
		
		DashboardPage macc=new DashboardPage(driver);
	     boolean target=macc.iswordDashboardExists();
		Assert.assertEquals(target,true,"Invalid login data");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**** Finished TC_001_LoginTest *****");
		
	}
}
