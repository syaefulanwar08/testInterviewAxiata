package jawaban_automation_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jawaban_automation_test.driver.DriverSingleton;

public class CreateGist {

private WebDriver driver;
	
	public CreateGist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='gist[description]']")
	private WebElement txtDescription;
	
	@FindBy(xpath = "//input[@name='gist[contents][][name]']")
	private WebElement txtFilename;
	
	@FindBy(xpath = "//*[@id=\"code-editor\"]/div/pre")
	private WebElement txtIsi;
	
	@FindBy(xpath = "//*[@id=\"new_gist\"]/div/div[2]/div/button")
	private WebElement btnCreate;

	
	public void Create() {		
		txtDescription.sendKeys("Hello World");
		txtFilename.sendKeys("Hello World");
		txtIsi.click();
		txtIsi.sendKeys("test");
		btnCreate.click();
		
	}
}
