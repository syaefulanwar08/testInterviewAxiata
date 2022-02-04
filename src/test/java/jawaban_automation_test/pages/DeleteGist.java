package jawaban_automation_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jawaban_automation_test.driver.DriverSingleton;

public class DeleteGist {
	
	private WebDriver driver;
	
	public DeleteGist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[2]/form/button")
	private WebElement btnDelete;


	public void Delete() {		
		btnDelete.click();
		driver.switchTo().alert().accept();

	}
}
