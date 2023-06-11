package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h6[normalize-space()='Dashboard']")
	WebElement wordDashboard;
	
	
	public boolean iswordDashboardExists() {
		
		boolean target =wordDashboard.isDisplayed();
		
		return target;
	}
}
