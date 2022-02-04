package jawaban_automation_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jawaban_automation_test.driver.DriverSingleton;

public class Logout {

	private WebDriver driver;

	public Logout() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"user-links\"]/details/details-menu")
	private WebElement dropdown;

	@FindBy(xpath = "//*[@id=\"user-links\"]/details/details-menu/form/button")
	private WebElement signOut;

	@FindBy(xpath = "//*[@id=\"js-pjax-container\"]/div/form/input[2]")
	private WebElement signOut1;

	@FindBy(xpath = "//*[@id=\"new_gist\"]/div/div[2]/div/button")
	private WebElement btnCreate;


	public void LogoutAkun() {		
		dropdown.click();
		signOut.click();
		signOut1.click();
	}
}
