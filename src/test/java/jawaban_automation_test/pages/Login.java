package jawaban_automation_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jawaban_automation_test.driver.DriverSingleton;



public class Login {
	
private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@role='navigation']/a[1]")
	private WebElement gotoSignIn;
	
	@FindBy(id = "login_field")
	private WebElement txtUsername;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btnSignIn;
	
	@FindBy(id = "otp")
	private WebElement txtOTP;
	
	@FindBy(xpath = "//*[@id=\"login\"]/div[6]/div/ul/li/a")
	private WebElement recoveryCode;
	
	@FindBy(id = "recovery_code")
	private WebElement txtRecoveryCode;
	
	@FindBy(xpath = "//*[@id=\"login\"]/form/div[3]/div[2]/button")
	private WebElement btnVerify;

	@FindBy(xpath = "/html/body/div[1]/header/div[6]/details/details-menu")
	private WebElement dropdownPlus;
			
	@FindBy(xpath = "/html/body/div[1]/header/div[6]/details/details-menu/a[3]")
	private WebElement newGist;
	
	public void login() {		
		gotoSignIn.click();
		txtUsername.sendKeys("syaefulanwar08@gmail.com");
		txtPassword.sendKeys("anwarsyaeful2908");
		btnSignIn.click();
		
		recoveryCode.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtRecoveryCode.sendKeys("9a573-06150"); //harus diganti setiap menjalankan test
		btnVerify.click();
		
		dropdownPlus.click();
		newGist.click();
		
	}
	
//	public String getWalletValue() {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
//		return txtWallet.getText();
//	}
}
